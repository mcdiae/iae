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
import hurl.build.UrlDefaults;
import hurl.escape.Escaper;
import hurl.escape.FormEscaper;
import hurl.parts.Query;

import java.nio.charset.Charset;

/**
 * This class demonstrates how you might edit a URL using a legacy encoding.
 * 
 * @author McDowell
 */
public class LegacyUrl {
  public static void main(String[] args) {
    String key = "cost";
    String tenPounds = "\u00A310.00\u00BE";
    System.out.println("cost: " + tenPounds);

    String url = "http://localhost/path?foo=bar";
    UriBuilder builder = UriBuilder.create(url);

    Charset iso_8859_1 = Charset.forName("ISO-8859-1");
    Escaper rfc2396 = new FormEscaper(iso_8859_1);
    Query query = QueryBuilder.create(rfc2396, UrlDefaults.queryDelimiter())
        .parse(builder.getQuery()).addParam(key, tenPounds).build();

    url = builder.setQuery(query).toString();
    System.out.println("URL: " + url);
  }
}
