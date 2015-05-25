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

package hurl.parts.test;

import hurl.parts.Delimiter;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

import org.junit.Assert;
import org.junit.Test;

public class DelimiterTest {

  @Test
  public void testUrlQuery() {
    String test1 = "foo";
    String test2 = "bar";
    String test3 = "baz";
    String[] list = Arrays.asList(test1, test2, test3).toArray(new String[3]);
    String sequence = test1 + ";" + test2 + "&" + test3;
    Delimiter delim = new Delimiter("&", Pattern.compile("&|;"));
    String[] output = delim.split(sequence).toArray(new String[3]);
    Assert.assertArrayEquals(list, output);
  }

  @Test
  public void testSplitConcat() {
    String sequence = "foo&bar&baz";
    Delimiter delim = new Delimiter("&", Pattern.compile("&"));
    List<String> split = delim.split(sequence);
    Assert.assertEquals(sequence, delim.concatenate(split));
    for (String segment : split) {
      Assert.assertEquals(3, segment.length());
    }
  }

  @Test
  public void testEmpty() {
    Delimiter delim = new Delimiter("&", Pattern.compile("&"));
    Assert.assertEquals(4, delim.split("&&&").size());
  }
}
