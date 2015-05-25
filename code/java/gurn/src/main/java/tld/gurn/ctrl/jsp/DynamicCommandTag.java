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

import static tld.gurn.ctrl.jsp.Tagging.bindAction;
import static tld.gurn.ctrl.jsp.Tagging.bindActionListener;
import static tld.gurn.ctrl.jsp.Tagging.isJsfAttribute;
import static tld.gurn.ctrl.jsp.Tagging.jsfAttributeToPropertyName;
import static tld.gurn.incidental.Logs.log;

import java.util.Map;

import javax.faces.component.ActionSource;
import javax.faces.component.UIComponent;
import javax.servlet.jsp.JspException;

import tld.gurn.ctrl.components.DynamicCommand;
import tld.gurn.incidental.Reflection;

public class DynamicCommandTag extends DynamicAttributeComponentTag {
  private static final Map<String, Class<?>> PROP_TYPES =
    Reflection.getPropertyTypes(DynamicCommand.class);
  
  private static final String PROP_ACTION = "action";
  private static final String PROP_ACTIONLISTENER = "actionListener";

  private Object action;
  private Object actionListener;

  @Override
  protected Map<String, Class<?>> getPropertyTypes() {
    return PROP_TYPES;
  }
  
  @Override
  public String getComponentType() {
    return DynamicCommand.COMPONENT_TYPE;
  }

  @Override
  public String getRendererType() {
    return DynamicCommand.RENDERER_TYPE;
  }

  @Override
  public void setDynamicAttribute(String uri, String localName, Object value)
      throws JspException {
    if (!filterActionAttribute(uri, localName, value)) {
      super.setDynamicAttribute(uri, localName, value);
    }
  }

  private boolean filterActionAttribute(String uri, String localName,
      Object value) {
    if (!isJsfAttribute(localName)) {
      return false;
    }
    String attrName = jsfAttributeToPropertyName(localName);
    if (PROP_ACTION.equals(attrName)) {
      action = value;
      return true;
    } else if (PROP_ACTIONLISTENER.equals(attrName)) {
      actionListener = value;
      return true;
    }
    return false;
  }

  @Override
  protected void setProperties(UIComponent component) {
    if (!(component instanceof DynamicCommand)) {
      String msg = "Component %s is not instance of %s";
      log().severe(String.format(msg, component, DynamicCommand.class));
    }

    super.setProperties(component);
    bindAction(getFacesContext(), (ActionSource) component, action);
    bindActionListener(getFacesContext(), (ActionSource) component,
        actionListener);
  }

  @Override
  public void release() {
    action = null;
    actionListener = null;
    super.release();
  }
}
