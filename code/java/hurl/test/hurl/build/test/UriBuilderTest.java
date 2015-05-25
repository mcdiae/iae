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

import hurl.build.UriBuilder;

import org.junit.Assert;
import org.junit.Test;

public class UriBuilderTest {

  @Test
  public void testUriBuilder() {
    String control = "http://username:password@foo.co.uk:8080/foo.html;jsessionid=10?foo=bar#ch1";
    UriBuilder uri = UriBuilder.create().setScheme("http").setUserInfo(
        "username:password").setHost("foo.co.uk").setPort(8080).setPath(
        "/foo.html;jsessionid=10").setQuery("foo=bar").setFragment("ch1");

    Assert.assertEquals(control, uri.toString());
    Assert.assertEquals(control, uri.build().toString());
  }

  @Test
  public void testBuild() {
    String uri = UriBuilder.create().setScheme("https").setUserInfo("user:pw")
        .setHost("localhost").setPort(80).setPath("/path").setQuery(
            "query=none").setFragment("frag").toString();
    Assert.assertEquals("https://user:pw@localhost:80/path?query=none#frag",
        uri);

    Assert.assertEquals("http://user:pw@localhost:80/path?query=none#frag",
        UriBuilder.create(uri).setScheme("http").toString());
    Assert.assertEquals("https://blah@localhost:80/path?query=none#frag",
        UriBuilder.create(uri).setUserInfo("blah").toString());
    Assert.assertEquals("https://user:pw@foo:80/path?query=none#frag",
        UriBuilder.create(uri).setHost("foo").toString());
    Assert.assertEquals("https://user:pw@localhost:8090/path?query=none#frag",
        UriBuilder.create(uri).setPort(8090).toString());
    Assert.assertEquals("https://user:pw@localhost:80/foo?query=none#frag",
        UriBuilder.create(uri).setPath("/foo").toString());
    Assert.assertEquals("https://user:pw@localhost:80/path?foo#frag",
        UriBuilder.create(uri).setQuery("foo").toString());
    Assert.assertEquals("https://user:pw@localhost:80/path?query=none#foo",
        UriBuilder.create(uri).setFragment("foo").toString());

    Assert.assertEquals("/path?query=none", UriBuilder.create(uri).setScheme(
        null).setUserInfo(null).setHost(null).setPort(-1).setFragment(null)
        .toString());
  }
}
