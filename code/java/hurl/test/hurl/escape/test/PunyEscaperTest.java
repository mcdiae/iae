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
import hurl.escape.PunyEscaper;
import hurl.test.util.TestStrings;

import java.util.Locale;

import org.junit.Assert;
import org.junit.Test;

public class PunyEscaperTest {

  private final Pair arabicEgyptian = new Pair(TestStrings.arabicEgyptian,
      "egbpdaj6bu4bxfgehfvwxn");
  private final Pair chineseSimplified = new Pair(
      TestStrings.chineseSimplified, "ihqwcrb4cv8a8dqg056pqjye");
  private final Pair chineseTraditional = new Pair(
      TestStrings.chineseTraditional, "ihqwctvzc91f659drss3x8bo0yb");
  private final Pair czech = new Pair(TestStrings.czech,
      "Proprostnemluvesky-uyb24dma41a");
  private final Pair hebrew = new Pair(TestStrings.hebrew,
      "4dbcagdahymbxekheh6e0a7fei0b");
  private final Pair hindiDevanagari = new Pair(TestStrings.hindiDevanagari,
      "i1baa7eci9glrd9b2ae1bj0hfcgg6iyaf8o0a1dig0cd");
  private final Pair oneDollar = new Pair(TestStrings.oneDollar, "-> $1.00 <--");

  private final Pair[] pairs = { arabicEgyptian, chineseSimplified,
      chineseTraditional, czech, hebrew, hindiDevanagari, oneDollar };

  @Test
  public void testEncode() {
    Escaper escaper = PunyEscaper.INSTANCE;
    for (Pair pair : pairs) {
      Assert.assertEquals(pair.escaped.toLowerCase(Locale.ENGLISH), escaper
          .escape(pair.unescaped).toLowerCase(Locale.ENGLISH));
      Assert.assertEquals(pair.unescaped, escaper.unescape(pair.escaped));
    }
  }

  private static class Pair {
    public final String unescaped;
    public final String escaped;

    public Pair(String unescaped, String escaped) {
      this.unescaped = unescaped;
      this.escaped = escaped;
    }
  }

}
