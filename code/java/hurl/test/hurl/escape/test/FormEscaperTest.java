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

import hurl.escape.FormEscaper;

import java.nio.charset.Charset;

import org.junit.Assert;
import org.junit.Test;

public class FormEscaperTest {

  @Test
  public void testSpaces() {
    String plus = "+";
    String space = " ";
    Charset ascii = Charset.forName("US-ASCII");
    FormEscaper escaper = new FormEscaper(ascii);

    Assert.assertEquals(plus, escaper.escape(space));
    Assert.assertEquals(space, escaper.unescape(plus));
  }

  @Test
  public void testCharsets() {
    // very safe chars
    String test = "test1234";

    for (Charset charset : Charset.availableCharsets().values()) {
      if (charset.canEncode()) {
        FormEscaper escaper = new FormEscaper(charset);
        String escaped = escaper.escape(test);
        Assert.assertEquals("charset: " + charset.name(), test, escaper
            .unescape(escaped));
      }
    }
  }

}
