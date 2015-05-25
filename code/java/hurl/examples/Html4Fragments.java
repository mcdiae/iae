import hurl.build.FragmentBuilder;
import hurl.build.UriBuilder;
import hurl.build.UrlDefaults;
import hurl.escape.prep.ProhibitedException;

import java.util.ArrayList;
import java.util.List;

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

/**
 * Strictly enforcing the HTML 4 restrictions on {@code id} and/or {@code name}
 * elements used with URL fragment parts and anchor tags.
 * 
 * @author McDowell
 */
public class Html4Fragments {

  private static FragmentBuilder createFragmentBuilder() {
    return FragmentBuilder.create(UrlDefaults.html4FragmentEscaper());
  }

  public static void main(String[] args) {
    List<String> validUrls = new ArrayList<String>();
    String[] ids = { "id100", "ID", "100", "X{}", "foo(x,y)", "X:Y:Z", "ID1.0",
        "ID1_0", "ID::::::::::" };

    for (String id : ids) {
      try {
        FragmentBuilder fragment = createFragmentBuilder().setValue(id);
        String anchor = UriBuilder.create().setFragment(fragment).toString();
        validUrls.add(anchor);
      } catch (ProhibitedException e) {
        System.out.format("invalid identifier: %s%n", id);
      }
    }

    System.out.format("page anchors: %s%n", validUrls);
  }
}
