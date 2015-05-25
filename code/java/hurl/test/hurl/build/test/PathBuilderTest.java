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

package hurl.build.test;

import hurl.build.PathBuilder;
import hurl.parts.Path;

import java.net.URI;

import org.junit.Assert;
import org.junit.Test;

public class PathBuilderTest {

  @Test
  public void uriSymmetry() {
    String[] tests = { "http://foo/bar", "http://foo", "http://foo/bar/baz",
        "foo//bar/baz", "http://foo/:bar/baz", "/foo/bar/baz/",
        "http://foo/-._~!$&'()*+,;=%20", };

    for (String test : tests) {
      URI uri = URI.create(test);
      String pre = uri.getRawPath();
      String post = PathBuilder.create().parse(pre).toString();
      Assert.assertEquals(pre, post);
    }
  }

  @Test
  public void testSeparators() {
    class Pair {
      String path;
      boolean lead;
      boolean trailing;

      Pair(String path, boolean lead, boolean trailing) {
        this.path = path;
        this.lead = lead;
        this.trailing = trailing;
      }
    }

    Pair[] tests = { new Pair("/", true, true),
        new Pair("/foo.html", true, false), new Pair("foo.html", false, false),
        new Pair("foo/", false, true), };

    for (Pair test : tests) {
      Path path = PathBuilder.create().parse(test.path).build();
      Assert.assertEquals(test.lead, path.hasLeadingSeparator());
      Assert.assertEquals(test.trailing, path.hasTrailingSeparator());
    }
  }
}
