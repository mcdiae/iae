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

package tld.gurn.ctrl.jsp;

import java.lang.reflect.Method;

import tld.gurn.incidental.Reflection;

/**
 * JSF 1.1 controls don't support unified EL expressions.
 * 
 * @author McDowell
 */
final class ValueExpressionHandler {
  private ValueExpressionHandler() {
  }

  private static final Class<?> EXPRESSION =
      Reflection.classOrNull("javax.el.Expression");
  private static final boolean SUPPORTED = (EXPRESSION != null);
  private static final Method GET_EXPRESSION_STRING =
      SUPPORTED ? Reflection.knownMethod(EXPRESSION, "getExpressionString")
          : null;

  public static Object valueExpressionToString(Object o) {
    if (o != null && EXPRESSION != null && EXPRESSION.isInstance(o)) {
      return Reflection.invoke(GET_EXPRESSION_STRING, o);
    }
    return o;
  }

}
