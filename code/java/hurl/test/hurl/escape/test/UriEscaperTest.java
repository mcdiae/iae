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

package hurl.escape.test;

import hurl.escape.Escaper;
import hurl.escape.UriEscaper;
import hurl.test.util.AllCodepointsIterator;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

import org.junit.Assert;
import org.junit.Test;

public class UriEscaperTest {

  public static final Pattern ALL = Pattern.compile("([^a]|[a])++");

  @Test
  public void testEscaper() {
    Escaper escaper = new UriEscaper(Charset.forName("US-ASCII"), ALL);

    String test = "A";
    String escaped = "%41";

    Assert.assertEquals(escaped, escaper.escape(test));
    Assert.assertEquals(test, escaper.unescape(escaped));
  }

  @Test
  public void testU2029() {
    Escaper escaper = new UriEscaper(Charset.forName("UTF-8"), ALL);
    int codepoint = 0x2029;
    String str = new String(Character.toChars(codepoint));

    String escaped = escaper.escape(str);
    String unescaped = escaper.unescape(escaped);
    if (str.equals(escaped)) {
      String msg = String.format("U+%04x", codepoint);
      Assert.assertNotSame(msg, str, escaped);
    }
    if (!str.equals(unescaped)) {
      String msg = String.format("U+%04x", codepoint);
      Assert.assertEquals(msg, str, unescaped);
    }
  }

  @Test
  public void testSupplementary() {
    Escaper escaper = new UriEscaper(Charset.forName("UTF-8"), ALL);

    // test all codepoints
    for (int codepoint : AllCodepointsIterator.ITERABLE) {
      try {
        String str = new String(Character.toChars(codepoint));

        String escaped = escaper.escape(str);
        String unescaped = escaper.unescape(escaped);
        if (str.equals(escaped)) {
          String msg = String.format("U+%04x", codepoint);
          Assert.assertNotSame(msg, str, escaped);
        }
        if (!str.equals(unescaped)) {
          String msg = String.format("U+%04x", codepoint);
          Assert.assertEquals(msg, str, unescaped);
        }
      } catch (RuntimeException e) {
        String msg = String.format("Failed on codepoint U+%04x", codepoint);
        Assert.fail(msg);
      }
    }
  }

  @Test
  public void testPound() {
    Escaper escaper = new UriEscaper(Charset.forName("UTF-8"), ALL);

    class Pair {
      String unescaped;
      String escaped;

      Pair(String unescaped, String escaped) {
        this.unescaped = unescaped;
        this.escaped = escaped;
      }
    }

    List<Pair> pairs = Arrays.asList(new Pair("A", "%41"), new Pair("\u00a3",
        "%C2%A3"), new Pair("\u306e", "%e3%81%ae"));
    for (Pair pair : pairs) {
      Assert.assertEquals(pair.unescaped, escaper.unescape(pair.escaped));
      // compare, locale insensitive, considering 0xAA == 0xaa
      Assert.assertTrue(String.CASE_INSENSITIVE_ORDER.compare(pair.escaped,
          escaper.escape(pair.unescaped)) == 0);
    }
  }
}
