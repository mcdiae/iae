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

import static tld.gurn.ctrl.jsp.Tagging.bind;
import static tld.gurn.ctrl.jsp.Tagging.isJsfAttribute;
import static tld.gurn.ctrl.jsp.Tagging.jsfAttributeToPropertyName;
import static tld.gurn.incidental.Logs.log;

import java.util.Map;
import java.util.logging.Level;

import javax.faces.component.UIComponent;
import javax.faces.webapp.UIComponentTag;
import javax.servlet.jsp.JspException;
import javax.xml.namespace.QName;

import tld.gurn.ctrl.components.DynamicAttributeHolder;
import tld.gurn.incidental.Collectors;
import tld.gurn.incidental.Reflection;
import tld.gurn.incidental.Reflection.Setter;

class DynamicTagComposer {

  private static final Map<String, Setter> STANDARD_JSF_ATTRS =
      Reflection.setters(UIComponentTag.class);

  private Map<String, Object> attributes = null;
  private Map<String, Object> jsfAttributes = null;
  private final UIComponentTag owner;
  private final Map<String, Class<?>> propertyTypes;

  public DynamicTagComposer(UIComponentTag owner,
      Map<String, Class<?>> propertyTypes) {
    this.owner = owner;
    this.propertyTypes = propertyTypes;
  }

  private Map<String, Object> attributeMap() {
    if (attributes == null) {
      attributes = Collectors.newMap();
    }
    return attributes;
  }

  private Map<String, Object> jsfAttributeMap() {
    if (jsfAttributes == null) {
      jsfAttributes = Collectors.newMap();
    }
    return jsfAttributes;
  }

  public void setDynamicAttribute(String uri, String localName, Object value)
      throws JspException {
    value = ValueExpressionHandler.valueExpressionToString(value);
    if (isJsfAttribute(localName)) {
      setJsfAttribute(localName, value);
    } else {
      String attr = new QName(uri, localName).toString();
      attributeMap().put(attr, value);
    }
  }

  private void setJsfAttribute(String name, Object value) {
    String propertyName = jsfAttributeToPropertyName(name);
    Setter setter = STANDARD_JSF_ATTRS.get(propertyName);
    if (setter == null) {
      jsfAttributeMap().put(propertyName, value);
    } else {
      setter.set(owner, value);
    }
  }

  public void setProperties(UIComponent component) {
    if (!(component instanceof DynamicAttributeHolder)) {
      String msg = "Component %s is not instance of %s";
      log().warning(String.format(msg, component, DynamicAttributeHolder.class));
    }

    bind(component, "dynamicAttributes", attributes, null);
    setJsfProperties(component);
  }

  private void setJsfProperties(UIComponent component) {
    if (jsfAttributes == null) {
      return;
    }

    Object working = null;
    try {
      for (Map.Entry<String, Object> attr : jsfAttributes.entrySet()) {
        if (log().isLoggable(Level.FINE)) {
          log().fine("Binding " + attr.getKey() + "=" + attr.getValue());
        }

        working = attr;
        String name = attr.getKey();
        bind(component, name, attr.getValue(), propertyTypes.get(name));
        working = null;
      }
    } finally {
      if (working != null) {
        String msg = String.format("Error setting JSF property %s", working);
        log().severe(msg);
      }
    }
  }

}
