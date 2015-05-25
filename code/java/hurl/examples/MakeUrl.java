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

import hurl.build.FragmentBuilder;
import hurl.build.PathBuilder;
import hurl.build.QueryBuilder;
import hurl.build.UriBuilder;
import hurl.parts.Query;

import java.net.URI;

/**
 * Demonstrates how to make a URL and parse it.
 * 
 * @author McDowell
 */
public class MakeUrl {
  public static void main(String[] args) {
    QueryBuilder query = QueryBuilder.create().addParam("msg", "Hello World")
        .addParam("myFavouriteChars", "+/&^$~@=");
    PathBuilder path = PathBuilder.create()
        .addElement("Documents and Whatever").addElement("Administrator");
    FragmentBuilder fragment = FragmentBuilder.create().setValue("Chapter #1");

    URI url = UriBuilder.create("http://localhost:8080").setQuery(query)
        .setPath(path).setFragment(fragment).build();
    System.out.println("URL: " + url);

    printMyFavouriteCharacters(url.toASCIIString());
  }

  private static void printMyFavouriteCharacters(String url) {
    URI uri = URI.create(url);
    Query query = QueryBuilder.create().parse(uri.getRawQuery()).build();
    System.out.println("myFavouriteChars: "
        + query.findValue("myFavouriteChars"));
  }
}
