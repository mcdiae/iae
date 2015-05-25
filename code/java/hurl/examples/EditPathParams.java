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

import hurl.build.QueryBuilder;
import hurl.build.UriBuilder;
import hurl.escape.Escaper;
import hurl.escape.UriEscaper;
import hurl.parts.Delimiter;

import java.net.URI;
import java.nio.charset.Charset;
import java.util.regex.Pattern;

/**
 * Code that demonstrates editing a path parameter.
 * 
 * @author McDowell
 */
public class EditPathParams {
  /** Unsafe list that treats '/' as opaque and uses ';' as separator */
  private static final Pattern UNSAFE = Pattern.compile("[^\\p{Alnum}"
      + Pattern.quote("-._~!$&'()*+,=:@/") + "]++");
  private static final Escaper PATH_QUERY_ESCAPER = new UriEscaper(Charset
      .forName("UTF-8"), UNSAFE);
  private static final Delimiter DELIMITER = new Delimiter(";", Pattern
      .compile(";"));

  public static void main(String[] args) {
    // a bunch of test URIs
    String[] tests = { "http://localhost:8080",
        "http://localhost:8080/Hello,%20World!",
        "http://localhost:8080/myapp/MyServlet;v=1.1?foo=bar",
        "http://localhost:8080/myapp/MyServlet;jsessionid=dead;v=1.1?foo=bar",
        "http://[FEDC:BA98:7654:3210:FEDC:BA98:7654:3210]:80/index.html" };
    for (String test : tests) {
      URI uri = URI.create(test);
      System.out.println("OLD: " + uri);
      System.out.println("NEW: "
          + setJsessionid(uri, "54DD1CCCC811CC5A178C1DB7380FE7D1"));
    }
  }

  /**
   * Sets the jsessionid on a URI
   */
  private static URI setJsessionid(URI uri, String jsessionid) {
    String path = uri.getRawPath();
    if (path == null || path.length() == 0) {
      path = "/";
    }
    path = QueryBuilder.create(PATH_QUERY_ESCAPER, DELIMITER).parse(path)
        .setParam("jsessionid", jsessionid).toString();
    return UriBuilder.create(uri).setPath(path).build();
  }
}
