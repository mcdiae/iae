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

import java.lang.reflect.Method;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

import javax.faces.FacesException;
import javax.faces.component.UIComponent;

import tld.gurn.fns.Functions;
import tld.gurn.incidental.Collectors;
import tld.gurn.incidental.Logs;

/**
 * Application scope function substitute class. JSF 1.1 does not support EL
 * functions in value expressions.
 * 
 * See {@linkplain http://developers.sun.com/docs/jscreator/help/jsp-jsfel/
 * jsf_expression_language_intro.html}
 * 
 * @author McDowell
 */
public class FnMap extends AbstractMap<String, Map<?, ?>> {

  private final Map<String, Map<?, ?>> map;

  public FnMap() {
    Logs.log()
        .info("Initializing FnMap");

    Map<String, Map<?, ?>> map = Collectors.newMap();

    init(map, Functions.class, "actionUrl", String.class);
    init(map, Functions.class, "resourceUrl", String.class);
    init(map, Functions.class, "namespace", String.class);
    init(map, Functions.class, "clientId", UIComponent.class);
    init(map, Functions.class, "isUserInRole", String.class);

    init(map, Functions.class, "safeId", String.class);
    init(map, Functions.class, "xml", String.class);
    init(map, Functions.class, "cdata", String.class);
    init(map, Functions.class, "jsString", String.class);

    this.map = Collections.unmodifiableMap(map);
  }

  private void init(Map<String, Map<?, ?>> map, Class<?> fnClass,
      String methodName, Class<?> param) {
    map.put(methodName, methodMap(fnClass, methodName, param));
  }

  @Override
  public Set<Entry<String, Map<?, ?>>> entrySet() {
    return map.entrySet();
  }

  private Map<Object, Object> methodMap(Class<?> fnClass, String methodName,
      Class<?> param) {
    try {
      Method method = fnClass.getMethod(methodName, param);
      return new MethodAdapter(method);
    } catch (SecurityException e) {
      throw new FacesException(e);
    } catch (NoSuchMethodException e) {
      throw new FacesException(e);
    }
  }
}
