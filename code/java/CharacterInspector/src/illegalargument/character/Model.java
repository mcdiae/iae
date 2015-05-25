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

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class Model {

  public enum Mode {
    GLYPHS, CODEPOINT, DECODE
  }

  private final Reporter reporter = new Reporter();
  private final ByteInterpreter byteInterp = new ByteInterpreter();

  private String data;
  private Charset charset;
  private Mode mode;

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public Charset getCharset() {
    return charset;
  }

  public void setCharset(Charset charset) {
    this.charset = charset;
  }

  public Mode getMode() {
    return mode;
  }

  public void setMode(Mode mode) {
    this.mode = mode;
  }

  public String getReport() {
    if (data == null) {
      data = "";
    }
    StringBuilder out = new StringBuilder();
    if (mode == Mode.CODEPOINT) {
      try {
        int codePoint = Integer.parseInt(data, 16);
        reporter.header(out, charset);
        reporter.report(out, charset, codePoint);

        if (Character.isDefined(codePoint)) {
          char[] chars = Character.toChars(codePoint);
          String glyph = new String(chars);
          out.append("\n\nContained in character sets:\n");
          appendStuff(out, getEncoders(glyph));
          out.append("\n\n");
          if (Character.isLowerCase(codePoint)
              || Character.isUpperCase(codePoint)) {
            Case.Dir dir = Character.isLowerCase(codePoint) ? Case.Dir.UPPERCASE
                : Case.Dir.LOWERCASE;

            Map<Case, Set<Locale>> cased = getCaseForms(dir, glyph);
            for (Map.Entry<Case, Set<Locale>> entry : cased.entrySet()) {
              Case c1 = entry.getKey();
              out.append("LOCALE " + dir + " FORM: ");
              out.append(c1.get(dir));
              out.append("\n");
              appendCodepoints(out, c1.get(dir));
              if (!c1.isSymmetrical()) {
                out.append("ASSYMETRICAL " + dir.not() + " FORM: ");
                out.append(c1.get(dir.not()));
                out.append("\n");
                appendCodepoints(out, c1.get(dir.not()));
              }
              appendStuff(out, entry.getValue());
              out.append("\n\n");
            }
          }
        }
      } catch (NumberFormatException e) {
        return "codepoint must be a hexadecimal integer";
      }
    } else if (mode == Mode.GLYPHS) {
      appendCodepoints(out, data);
    } else if (mode == Mode.DECODE) {
      byteInterp.setData(data);
      if (byteInterp.isValid()) {
        appendCodepoints(out, byteInterp.asString(charset));
      } else {
        out
            .append("In DECODE mode, the input must be a hexadecimal byte sequence.\n");
        out.append("No whitespace and ensure an even number of characters.");
      }
    }
    return out.toString();
  }

  private void appendCodepoints(Appendable out, String data) {
    reporter.header(out, charset);
    int codePoint;
    for (int i = 0; i < data.length(); i++) {
      char ch = data.charAt(i);
      if (Character.isHighSurrogate(ch) && (i + 1 < data.length())) {
        codePoint = Character.toCodePoint(ch, data.charAt(++i));
      } else {
        codePoint = 0xFFFF & ch;
      }
      reporter.report(out, charset, codePoint);
    }
  }

  private Map<Case, Set<Locale>> getCaseForms(Case.Dir dir, String s) {
    Map<Case, Set<Locale>> map = new LinkedHashMap<Case, Set<Locale>>();
    for (Locale locale : Locale.getAvailableLocales()) {
      Case cased = new Case(dir, locale, s);
      Set<Locale> set = map.get(cased);
      if (set == null) {
        set = new LinkedHashSet<Locale>();
        map.put(cased, set);
      }
      set.add(locale);
    }
    return map;
  }

  private Set<Charset> getEncoders(String cs) {
    Map<String, Charset> charsets = Charset.availableCharsets();
    Set<Charset> all = new LinkedHashSet<Charset>();
    all.addAll(charsets.values());
    Iterator<Charset> it = all.iterator();
    while (it.hasNext()) {
      Charset encoder = it.next();
      try {
        if (!encoder.canEncode() || !encoder.newEncoder().canEncode(cs)) {
          it.remove();
        }
      } catch (IllegalArgumentException e) {
        // Java 1.5 - IAE thrown on canEncode(String) even though canEncode()
        // return true
        System.err.println(encoder + ": " + e);
        it.remove();
      }
    }
    return all;
  }

  private void appendStuff(StringBuilder sb, Set<? extends Object> stuff) {
    int len = 0;
    for (Object obj : stuff) {
      String name = obj.toString();
      len += name.length() + 2;
      if (len > 80) {
        len = 0;
        sb.append('\n');
      }
      sb.append(name);
      sb.append(", ");
    }
  }

}
