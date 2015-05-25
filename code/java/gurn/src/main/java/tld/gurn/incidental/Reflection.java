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

import static tld.gurn.incidental.Collectors.newMap;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

import javax.faces.FacesException;

public final class Reflection {
  private Reflection() {
  }

  public static interface Setter {
    public void set(Object target, Object value);
  }

  public static Map<String, Setter> setters(Class<?> type) {
    Map<String, Setter> setters = Collectors.newMap();

    for (Method method : type.getMethods()) {
      if (isSetter(method)) {
        String name = setterToName(method);
        setters.put(name, setter(method));
      }
    }

    return Collections.unmodifiableMap(setters);
  }

  private static Setter setter(final Method method) {
    class SetterImpl implements Setter {
      public void set(Object target, Object value) {
        invoke(method, target, value);
      }
    }

    return new SetterImpl();
  }

  private static final Pattern SETTER_NAME =
      Pattern.compile("set[A-Z][\\p{Alnum}]*");

  private static boolean isSetter(Method method) {
    return !Modifier.isStatic(method.getModifiers())
        && len(method.getParameterTypes()) == 1
        && SETTER_NAME.matcher(method.getName())
            .matches();
  }

  private static int len(Object[] array) {
    return array == null ? 0 : array.length;
  }

  private static String setterToName(Method method) {
    String name = method.getName();
    return name.substring(3, 4)
        .toLowerCase(Locale.ENGLISH) + name.substring(4);
  }

  public static Object invoke(Method method, Object target, Object... args) {
    try {
      return method.invoke(target, args);
    } catch (IllegalAccessException e) {
      throw new IllegalStateException(e);
    } catch (InvocationTargetException e) {
      throw new FacesException(e);
    }
  }

  public static Class<?> classOrNull(String className) {
    try {
      return Class.forName(className);
    } catch (ClassNotFoundException e) {
      return null;
    }
  }

  public static Method knownMethod(Class<?> type, String methodName,
      Class<?>... params) {
    try {
      return type.getMethod(methodName, params);
    } catch (SecurityException e) {
      throw new AssertionError(e);
    } catch (NoSuchMethodException e) {
      throw new AssertionError(e);
    }
  }

  public static Map<String, Class<?>> getPropertyTypes(Class<?> c) {
    Map<String, Class<?>> map = newMap();
    try {
      BeanInfo info = Introspector.getBeanInfo(c);
      for (PropertyDescriptor prop : info.getPropertyDescriptors()) {
        String name = prop.getName();
        Class<?> type = prop.getPropertyType();
        map.put(name, type);
      }
    } catch (IntrospectionException e) {
      throw new AssertionError(e);
    }
    return map;
  }
}
