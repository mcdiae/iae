/*
Copyright (c) 2011 McDowell

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

package tld.gurn.incidental;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public final class Assertions {
  private Assertions() {
  }

  public static <T> T notNull(T t) {
    if (t == null) {
      throw new AssertionError("null");
    }
    return t;
  }
  
  public static String notEmpty(String s) {
    if(s == null || s.length() == 0) {
      throw new AssertionError("null or empty string");
    }
    return s;
  }

  public static Method staticMethod(Method method) {
    if (!Modifier.isStatic(method.getModifiers())) {
      throw new AssertionError("method not static: " + method);
    }
    return method;
  }
}
