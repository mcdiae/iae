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
import hurl.parts.Query;

import java.net.URI;

public class QueryEdit {
  public static void main(String[] args) {
    make();
    parse();
  }

  private static void make() {
    // can build a URL
    UriBuilder uriBuilder = UriBuilder.create("http://foo/path?baz=bar#p1");
    // used to edit query parts
    QueryBuilder query = QueryBuilder.create().parse(uriBuilder.getQuery())
        .addParam("num", "#30").addParam("pcnt", "100%");
    URI uri = uriBuilder.setQuery(query).build();
    System.out.println(uri);
  }

  private static void parse() {
    URI uri = URI.create("http://foo/path?baz=bar&num=%2330&pcnt=100%25#p1");
    // query the query
    Query query = QueryBuilder.create().parse(uri.getRawQuery()).build();
    System.out.println(query.findValue("num"));
  }
}
