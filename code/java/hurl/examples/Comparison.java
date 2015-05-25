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

/**
 * Logically normalizing URLs for comparison.
 * 
 * @author McDowell
 */
public class Comparison {
  public static void main(String[] args) {
    // these URIs are considered (by this application) to be logically the same
    // because the query parameters have the same values
    URI uri1 = URI.create("http://localhost/?foo=bar&x=y&%2b+");
    URI uri2 = URI.create("http://localhost/path/..?%2b+&%78=y&foo=bar");
    compare(uri1, uri2);
    uri1 = normalizeQuery(uri1);
    uri2 = normalizeQuery(uri2);
    compare(uri1, uri2);
  }

  private static URI normalizeQuery(URI uri) {
    UriBuilder builder = UriBuilder.create(uri.normalize());
    Query query = QueryBuilder.create().parse(builder.getQuery()).build()
        .normalize();
    return builder.setQuery(query).build();
  }

  private static void compare(URI uri1, URI uri2) {
    System.out.println("1: " + uri1);
    System.out.println("2: " + uri2);
    System.out.println("Equals: " + uri1.equals(uri2));
  }
}
