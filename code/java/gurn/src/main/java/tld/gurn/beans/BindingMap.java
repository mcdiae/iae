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

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

import tld.gurn.incidental.Collectors;

/**
 * A binding map for the current view.
 * 
 * Instance is application scope.
 * 
 * @author User
 */
public class BindingMap implements Map<String, UIComponent> {
  private static final String KEY_VIEW = BindingMap.class.getName() + "_VIEW";
  private static final String KEY_BINDINGS = BindingMap.class.getName()
      + "_BINDINGS";

  private Map<String, UIComponent> getInternal() {
    FacesContext context = FacesContext.getCurrentInstance();
    @SuppressWarnings("unchecked")
    Map<String, Object> requestMap = context.getExternalContext()
        .getRequestMap();
    String viewId = context.getViewRoot()
        .getViewId();

    @SuppressWarnings("unchecked")
    Map<String, UIComponent> bindings =
        (Map<String, UIComponent>) requestMap.get(KEY_BINDINGS);
    if (bindings == null) {
      bindings = Collectors.newMap();
      requestMap.put(KEY_BINDINGS, bindings);
    }

    Object current = requestMap.get(KEY_VIEW);
    if (!viewId.equals(current)) {
      bindings.clear();
      requestMap.put(KEY_VIEW, viewId);
    }
    return bindings;
  }

  public int size() {
    return getInternal().size();
  }

  public boolean isEmpty() {
    return getInternal().isEmpty();
  }

  public boolean containsKey(Object key) {
    return getInternal().containsKey(key);
  }

  public boolean containsValue(Object value) {
    return getInternal().containsValue(value);
  }

  public UIComponent get(Object key) {
    return getInternal().get(key);
  }

  public UIComponent put(String key, UIComponent value) {
    return getInternal().put(key, value);
  }

  public UIComponent remove(Object key) {
    return getInternal().remove(key);
  }

  public void putAll(Map<? extends String, ? extends UIComponent> t) {
    getInternal().putAll(t);
  }

  public void clear() {
    getInternal().clear();
  }

  public Set<String> keySet() {
    return getInternal().keySet();
  }

  public Collection<UIComponent> values() {
    return getInternal().values();
  }

  public Set<Entry<String, UIComponent>> entrySet() {
    return getInternal().entrySet();
  }

  @Override
  public boolean equals(Object obj) {
    return getInternal().equals(obj);
  }

  @Override
  public int hashCode() {
    return getInternal().hashCode();
  }
}
