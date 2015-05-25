/*
Copyright (c) 2009 McDowell

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
 */

package illegalargument.character;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class Reporter {

  private final String header = "codepoint   glyph   escaped    %-15s info%n";
  private final String divider = "=======================================================================\n";
  private final String fmt = "%-10s  %-5s   %-10s %-15s %s%n";

  public void header(Appendable out, Charset charset) {
    String prt = String.format(header, charset.name());
    append(out, prt);
    append(out, divider);
  }

  public void report(Appendable out, Charset charset, int codePoint) {
    String cp = String.format("U+%04x", codePoint);
    boolean defined = Character.isDefined(codePoint);
    char[] chars = defined ? Character.toChars(codePoint) : new char[0];
    String glyph = defined ? new String(chars) : "";
    String escaped = defined ? toEscaped(chars) : "";
    String encoded;
    try {
      encoded = defined ? (charset.newEncoder().canEncode(glyph) ? toHex(encode(
          glyph, charset))
          : "unsupported")
          : "n/a";
    } catch (IllegalArgumentException e) {
      // Java 1.5 - IAE thrown on canEncode(String) even though canEncode()
      // return true
      System.err.println(charset + ": " + e);
      encoded = "ERROR!";
    }
    String info;
    if (defined) {
      info = Character.UnicodeBlock.of(codePoint).toString() + ", "
          + getType(codePoint);
    } else {
      info = "undefined";
    }
    String prt = String.format(fmt, cp, glyph, escaped, encoded, info);
    append(out, prt);
  }

  private byte[] encode(String s, Charset charset) {
    try {
      String enc = charset.name();
      return s.getBytes(enc);
    } catch (UnsupportedEncodingException e) {
      throw new RuntimeException(e);
    }
  }

  private String toEscaped(char[] chars) {
    String escaped = "";
    for (char c : chars) {
      escaped += String.format("\\u%04x", (int) c);
    }
    return escaped;
  }

  private String toHex(byte[] arr) {
    String hex = "";
    for (byte b : arr) {
      hex += String.format("%02x,", (b & 0xFF));
    }
    return hex;
  }

  private void append(Appendable out, String data) {
    try {
      out.append(data);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  private String getType(int codePoint) {
    int type = Character.getType(codePoint);
    switch (type) {
    case Character.COMBINING_SPACING_MARK:
      return "COMBINING_SPACING_MARK";
    case Character.CONNECTOR_PUNCTUATION:
      return "CONNECTOR_PUNCTUATION";
    case Character.CONTROL:
      return "CONTROL";
    case Character.CURRENCY_SYMBOL:
      return "CURRENCY_SYMBOL";
    case Character.DASH_PUNCTUATION:
      return "DASH_PUNCTUATION";
    case Character.DECIMAL_DIGIT_NUMBER:
      return "DECIMAL_DIGIT_NUMBER";
    case Character.ENCLOSING_MARK:
      return "ENCLOSING_MARK";
    case Character.END_PUNCTUATION:
      return "END_PUNCTUATION";
    case Character.FINAL_QUOTE_PUNCTUATION:
      return "FINAL_QUOTE_PUNCTUATION";
    case Character.FORMAT:
      return "FORMAT";
    case Character.INITIAL_QUOTE_PUNCTUATION:
      return "INITIAL_QUOTE_PUNCTUATION";
    case Character.LETTER_NUMBER:
      return "LETTER_NUMBER";
    case Character.LINE_SEPARATOR:
      return "LINE_SEPARATOR";
    case Character.LOWERCASE_LETTER:
      return "LOWERCASE_LETTER";
    case Character.MATH_SYMBOL:
      return "MATH_SYMBOL";
    case Character.MODIFIER_LETTER:
      return "MODIFIER_LETTER";
    case Character.MODIFIER_SYMBOL:
      return "MODIFIER_SYMBOL";
    case Character.NON_SPACING_MARK:
      return "NON_SPACING_MARK";
    case Character.OTHER_LETTER:
      return "OTHER_LETTER";
    case Character.OTHER_NUMBER:
      return "OTHER_NUMBER";
    case Character.OTHER_PUNCTUATION:
      return "OTHER_PUNCTUATION";
    case Character.OTHER_SYMBOL:
      return "OTHER_SYMBOL";
    case Character.PARAGRAPH_SEPARATOR:
      return "PARAGRAPH_SEPARATOR";
    case Character.PRIVATE_USE:
      return "PRIVATE_USE";
    case Character.SPACE_SEPARATOR:
      return "SPACE_SEPARATOR";
    case Character.START_PUNCTUATION:
      return "START_PUNCTUATION";
    case Character.SURROGATE:
      return "SURROGATE";
    case Character.TITLECASE_LETTER:
      return "TITLECASE_LETTER";
    case Character.UNASSIGNED:
      return "UNASSIGNED";
    case Character.UPPERCASE_LETTER:
      return "UPPERCASE_LETTER";
    }
    return "unknown";
  }

  public static void main(String[] args) {
    Reporter rep = new Reporter();
    rep.header(System.out, Charset.defaultCharset());
    rep.report(System.out, Charset.defaultCharset(), 0x61);
    rep.report(System.out, Charset.forName("UTF-8"), 0x4444);
    rep.report(System.out, Charset.forName("UTF-8"), Integer.MAX_VALUE);
  }
}
