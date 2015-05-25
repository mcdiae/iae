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

package tld.gurn.beans;

import static tld.gurn.incidental.Assertions.staticMethod;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Set;

import javax.faces.FacesException;

class MethodAdapter extends AbstractMap<Object, Object> {
  private final Method method;

  public MethodAdapter(Method method) {
    this.method = staticMethod(method);
  }

  @Override
  public Set<Entry<Object, Object>> entrySet() {
    Set<Entry<Object, Object>> empty = Collections.emptySet();
    return empty;
  }

  @Override
  public Object get(Object key) {
    try {
      return method.invoke(null, key);
    } catch (IllegalArgumentException e) {
      throw new FacesException(e);
    } catch (IllegalAccessException e) {
      throw new FacesException(e);
    } catch (InvocationTargetException e) {
      throw new FacesException(e);
    }
  }

}
