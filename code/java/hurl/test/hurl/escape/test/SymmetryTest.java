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

import hurl.escape.CompositeEscaper;
import hurl.escape.Escaper;
import hurl.escape.FormEscaper;
import hurl.escape.NoOpEscaper;
import hurl.escape.PunyEscaper;
import hurl.escape.SymmetricalEscaper;
import hurl.escape.UriEscaper;
import hurl.test.util.AllCodepointsIterator;
import hurl.test.util.TestStrings;

import java.nio.charset.Charset;

import org.junit.Assert;
import org.junit.Test;

public class SymmetryTest {
  private final Charset utf8 = Charset.forName("UTF-8");
  private final Escaper form = new FormEscaper(utf8);
  private final Escaper uri = new UriEscaper(utf8, UriEscaper
      .getNonAlphanumPattern());
  private final Escaper puny = new PunyEscaper();
  private final Escaper noop = new NoOpEscaper();
  private final Escaper composite = new CompositeEscaper(puny, form, uri, noop);
  private final Escaper debug = new SymmetricalEscaper(composite);
  private final Escaper[] escapers = { form, uri, puny, composite, debug, noop };

  @Test
  public void testStrings() {
    for (String data : TestStrings.all()) {
      for (Escaper escaper : escapers) {
        String escaped = escaper.escape(data);
        String unescaped = escaper.unescape(escaped);
        Assert.assertEquals(escaper.getClass().getName(), data, unescaped);
      }
    }
  }

  @Test
  public void testAllCodepoints() {
    for (int codepoint : AllCodepointsIterator.ITERABLE) {
      try {
        String str = new String(Character.toChars(codepoint));
        for (Escaper escaper : escapers) {
          String escaped = escaper.escape(str);
          String unescaped = escaper.unescape(escaped);
          if (!str.equals(unescaped)) {
            String msg = String.format("U+%04x", codepoint);
            Assert.assertEquals(msg, str, unescaped);
          }
        }
      } catch (RuntimeException e) {
        String msg = String.format("Failed on codepoint U+%04x", codepoint);
        Assert.fail(msg);
      }
    }
  }
}
