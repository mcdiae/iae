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
import hurl.escape.SymmetricalEscaper;

import org.junit.Assert;
import org.junit.Test;

public class DebugEscaperTest {

  @Test
  public void testSymmetry() {
    Escaper good = new Escaper() {
      public String escape(String unescaped) {
        return reverse(unescaped);
      }

      public String unescape(String escaped) {
        return reverse(escaped);
      }
    };

    String foo = "foo";
    Escaper debug = new SymmetricalEscaper(good);
    debug.escape(foo);
    debug.unescape(foo);
  }

  @Test
  public void testThrows() {
    Escaper bad = new Escaper() {
      public String escape(String unescaped) {
        return reverse(unescaped);
      }

      public String unescape(String escaped) {
        // deliberate bug
        return escaped;
      }
    };

    String foo = "foo";
    Escaper debug = new SymmetricalEscaper(bad);
    try {
      debug.escape(foo);
      Assert.fail("should throw");
    } catch (IllegalArgumentException e) {
      // expected
    }
    try {
      debug.unescape(foo);
      Assert.fail("should throw");
    } catch (IllegalArgumentException e) {
      // expected
    }
  }

  private String reverse(String foo) {
    char[] data = foo.toCharArray();
    for (int i = 0, j = data.length - 1; i < j; i++, j--) {
      char temp = data[i];
      data[i] = data[j];
      data[j] = temp;
    }
    return new String(data);
  }

}
