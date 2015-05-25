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

import static tld.gurn.incidental.Assertions.notEmpty;
import static tld.gurn.incidental.Logs.log;

import java.util.Map;
import java.util.logging.Level;

import javax.faces.component.ActionSource;
import javax.faces.component.EditableValueHolder;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.el.MethodBinding;
import javax.faces.el.ValueBinding;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;
import javax.faces.webapp.UIComponentTag;

import tld.gurn.el.SimpleMethodBinding;
import tld.gurn.incidental.Bindings;

class Tagging {
  public static final String JSF_ATTRIBUTE_PREFIX = "jsf-";

  public static void bind(UIComponent component, String property, Object value,
      Class<?> type) {
    if (value == null) {
      return;
    }

    value = ValueExpressionHandler.valueExpressionToString(value);

    if (bindExpression(component, property, value)) {
      return;
    }

    Object watch = value;
    try {
      if (type != null && value instanceof String) {
        value = Coercion.coerce(value.toString(), type);
      }
      @SuppressWarnings("unchecked")
      Map<String, Object> attrs = component.getAttributes();
      attrs.put(property, value);
      watch = null;
    } finally {
      if (watch != null) {
        String template = "Error setting property %s to value %s of type %s";
        String msg = String.format(template, property, value, value.getClass()
            .getName());
        log().severe(msg);
      }
    }
  }

  private static boolean bindExpression(UIComponent component, String property,
      Object value) {
    if (!(value instanceof String)) {
      return false;
    }

    String str = value.toString();
    if (!UIComponentTag.isValueReference(str)) {
      return false;
    }

    if (log().isLoggable(Level.FINEST)) {
      String msg = "Setting binding: %s %s=%s";
      log().finest(String.format(msg, component, property, value));
    }

    ValueBinding binding = Bindings.binding(str);
    component.setValueBinding(property, binding);
    return true;
  }

  public static void bindValueChangeListener(FacesContext context,
      EditableValueHolder component, Object value) {
    if (value == null) {
      return;
    }
    String expression = methodExpression("valueChangeListener", value);
    Class<?>[] params = { ValueChangeEvent.class };
    MethodBinding binding = context.getApplication()
        .createMethodBinding(expression, params);
    component.setValueChangeListener(binding);
  }

  public static void bindValidator(FacesContext context,
      EditableValueHolder component, Object value) {
    if (value == null) {
      return;
    }
    String expression = methodExpression("validator", value);
    Class<?>[] params = { FacesContext.class, UIComponent.class, Object.class };
    MethodBinding binding = context.getApplication()
        .createMethodBinding(expression, params);
    component.setValidator(binding);
  }

  public static void bindActionListener(FacesContext context,
      ActionSource component, Object value) {
    if (value == null) {
      return;
    }
    String expression = methodExpression("actionListener", value);
    Class<?>[] params = { ActionEvent.class };
    MethodBinding binding = context.getApplication()
        .createMethodBinding(expression, params);
    component.setActionListener(binding);
  }

  public static void bindAction(FacesContext context, ActionSource component,
      Object value) {
    if (value == null) {
      return;
    }
    String expression = methodExpression("action", value);
    MethodBinding binding = createMethodBinding(context, expression);
    component.setAction(binding);
  }

  private static String methodExpression(String attribute, Object value) {
    value = ValueExpressionHandler.valueExpressionToString(value);
    if (value instanceof String) {
      return value.toString();
    } else {
      String msg =
          String.format(
              "Attribute %s requires a String expression. Value %s is a %s.",
              attribute, value, value.getClass()
                  .getName());
      throw new IllegalArgumentException(msg);
    }
  }

  private static final Class<?>[] EMPTY_ARRAY = {};

  private static MethodBinding createMethodBinding(FacesContext context,
      String expression) {
    if (UIComponentTag.isValueReference(expression)) {
      return context.getApplication()
          .createMethodBinding(expression, EMPTY_ARRAY);
    } else {
      return SimpleMethodBinding.adaptToMethodBinding(expression);
    }
  }

  public static boolean isJsfAttribute(String attributeName) {
    return attributeName.startsWith(JSF_ATTRIBUTE_PREFIX);
  }

  public static String jsfAttributeToPropertyName(String attributeName) {
    if (!isJsfAttribute(attributeName)) {
      throw new IllegalArgumentException(attributeName);
    }
    return notEmpty(attributeName.substring(JSF_ATTRIBUTE_PREFIX.length()));
  }
}
