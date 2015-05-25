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

import static tld.gurn.ctrl.jsp.Tagging.bindValueChangeListener;
import static tld.gurn.ctrl.jsp.Tagging.isJsfAttribute;
import static tld.gurn.ctrl.jsp.Tagging.jsfAttributeToPropertyName;
import static tld.gurn.incidental.Logs.log;

import java.util.Map;

import javax.faces.component.EditableValueHolder;
import javax.faces.component.UIComponent;
import javax.servlet.jsp.JspException;

import tld.gurn.ctrl.components.DynamicInput;
import tld.gurn.incidental.Reflection;

public class DynamicInputTag extends DynamicAttributeComponentTag {
  private static final Map<String, Class<?>> PROP_TYPES =
    Reflection.getPropertyTypes(DynamicInput.class);

  private static final String PROP_VALUECHANGELISTENER = "valueChangeListener";

  private static final String PROP_VALIDATOR = "validator";

  private Object valueChangeListener;
  private Object validator;

  @Override
  protected Map<String, Class<?>> getPropertyTypes() {
    return PROP_TYPES;
  }
  
  @Override
  public String getComponentType() {
    return DynamicInput.COMPONENT_TYPE;
  }

  @Override
  public String getRendererType() {
    return DynamicInput.RENDERER_TYPE;
  }

  @Override
  public void setDynamicAttribute(String uri, String localName, Object value)
      throws JspException {
    if (!filterValueChangeAttribute(uri, localName, value)) {
      super.setDynamicAttribute(uri, localName, value);
    }
  }

  private boolean filterValueChangeAttribute(String uri, String localName,
      Object value) {
    if (!isJsfAttribute(localName)) {
      return false;
    }
    String attrName = jsfAttributeToPropertyName(localName);
    if (PROP_VALUECHANGELISTENER.equals(attrName)) {
      valueChangeListener = value;
      return true;
    } else if (PROP_VALIDATOR.equals(localName)) {
      validator = value;
    }
    return false;
  }

  @Override
  protected void setProperties(UIComponent component) {
    if (!(component instanceof DynamicInput)) {
      String msg = "Component %s is not instance of %s";
      log().severe(String.format(msg, component, DynamicInput.class));
    }

    super.setProperties(component);

    EditableValueHolder evh = (EditableValueHolder) component;
    bindValueChangeListener(getFacesContext(), evh, valueChangeListener);
    bindValueChangeListener(getFacesContext(), evh, validator);
  }

  @Override
  public void release() {
    valueChangeListener = null;
    super.release();
  }
}
