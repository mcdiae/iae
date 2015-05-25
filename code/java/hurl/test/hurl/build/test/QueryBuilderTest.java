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

import hurl.build.QueryBuilder;
import hurl.build.UrlDefaults;
import hurl.escape.Escaper;
import hurl.escape.FormEscaper;
import hurl.escape.UriEscaper;
import hurl.escape.test.UriEscaperTest;
import hurl.parts.Param;
import hurl.parts.Query;
import hurl.test.util.AllCodepointsIterator;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Locale;

import org.junit.Assert;
import org.junit.Test;

public class QueryBuilderTest {

  @Test
  public void testSimple() {
    QueryBuilder builder = QueryBuilder.create();
    builder.addParam("foo", "bar");
    Assert.assertEquals("foo=bar", builder.toString());
    Assert.assertEquals("foo=bar", builder.build().toString());
  }

  @Test
  public void testFluent() {
    String foo = "foo";
    String bar = "bar";
    Query query = QueryBuilder.create().addParam(foo, bar).addParam(foo, bar)
        .addParam(foo).build();

    Assert.assertEquals("foo=bar&foo=bar&foo", query.toString());
  }

  @Test
  public void testAdd() {
    Escaper escaper = new UriEscaper(Charset.forName("US-ASCII"),
        UriEscaperTest.ALL);
    Param param = new Param(escaper, "foo", "bar");
    Assert.assertEquals("%66%6F%6F=%62%61%72", param.toString());

    String result = QueryBuilder.create().addParam(param).addParam(
        param.getKey(), param.getValue()).toString();
    Assert.assertEquals("foo=bar&foo=bar", result);
  }

  @Test
  public void testUri() throws URISyntaxException {
    URI uri = URI.create("http://foo:8080?foo=baz");
    URI target = URI.create("http://foo:8080?foo=bar");
    QueryBuilder query = QueryBuilder.create().parse(uri.getQuery()).setParam(
        "foo", "bar");
    URI test = new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), uri
        .getPort(), uri.getPath(), query.toString(), uri.getFragment());
    Assert.assertEquals(target, test);

    uri = URI.create("http://foo:8080?foo=baz&x=y");
    target = URI.create("http://foo:8080?foo=bar&x=y");
    query = QueryBuilder.create().parse(uri.getQuery()).setParam("foo", "bar");
    test = new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), uri
        .getPort(), uri.getPath(), query.toString(), uri.getFragment());
    Assert.assertEquals(target, test);
  }

  @Test
  public void testNormalize() {
    Query b1 = QueryBuilder.create().addParam("foo", "bar").addParam("baz")
        .build();

    Query b2 = QueryBuilder.create().addParam("baz").addParam("foo", "bar")
        .build();

    String q1 = b1.normalize().toString();
    String q2 = b2.normalize().toString();
    Assert.assertEquals(q1, q2);
  }

  public void testCreate() {
    Charset iso8859_1 = Charset.forName("ISO-8859-1");
    Escaper formEscaper = new FormEscaper(iso8859_1);
    Escaper uriEscaper = new UriEscaper(iso8859_1, UriEscaper
        .getNonAlphanumPattern());
    QueryBuilder[] qb = {
        QueryBuilder.create(uriEscaper, UrlDefaults.queryDelimiter()),
        QueryBuilder.create(formEscaper, UrlDefaults.queryDelimiter()),
        QueryBuilder.create() };

    for (QueryBuilder builder : qb) {
      builder.addParam("fooooooo").addParam("abce", "defbn__+==%$??+\t");
    }
  }

  @Test
  public void testU2029() {
    // helps test pattern matching
    int codepoint = 0x2029; // GENERAL_PUNCTUATION, PARAGRAPH_SEPARATOR
    String u2029 = new String(Character.toChars(codepoint));
    String expected = "%e2%80%a9";
    String escaped = QueryBuilder.create().addParam(u2029).toString()
        .toLowerCase(Locale.ENGLISH);
    Assert.assertEquals(expected, escaped);
  }

  @Test
  public void testParams() {
    String[] tests = { "?", "=", "&", "%", "Hello" };

    QueryBuilder builder = QueryBuilder.create();
    for (String test : tests) {
      builder.addParam(test);
    }
    String encoded = builder.toString();

    Query query = QueryBuilder.create().parse(encoded).build();
    List<Param> params = query.getParams();
    for (int i = 0; i < tests.length; i++) {
      Assert.assertEquals(tests[i], params.get(i).getKey());
    }
  }

  @Test
  public void testAllcodepoints() {
    for (String ch : AllCodepointsIterator.ALLCHARS) {
      {
        Query query = QueryBuilder.create().addParam(ch).build();
        Assert.assertNotNull(query.findParam(ch));
      }
      {
        Query query = QueryBuilder.create().addParam(ch, ch).build();
        Assert.assertEquals(ch, query.findValue(ch));
      }
      {
        Query query = QueryBuilder.create().addParam(ch).build();
        String qpart = query.toString();
        String qpart2 = QueryBuilder.create().parse(qpart).toString();
        Assert.assertEquals(qpart, qpart2);
        String decoded = QueryBuilder.create().parse(qpart).build().findParam(
            ch).getKey();
        Assert.assertEquals(ch, decoded);
      }
      {
        Query query = QueryBuilder.create().addParam(ch).build();

        // test suitability for URI
        String uri = "http://foo?" + query;
        Assert.assertEquals(uri, URI.create(uri).toASCIIString());
      }
    }
  }

  @Test
  public void testEmpty() {
    Query query = QueryBuilder.create().parse("").build();
    Assert.assertEquals("", query.toString());
    Assert.assertEquals(0, query.getParams().size());
  }
}
