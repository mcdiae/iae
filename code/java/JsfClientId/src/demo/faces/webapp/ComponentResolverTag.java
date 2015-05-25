/*
Copyright (c) 2009 McDowell

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

package demo.faces.webapp;

import javax.el.ValueExpression;
import javax.faces.component.UIComponent;
import javax.faces.webapp.UIComponentELTag;

import demo.faces.component.UIComponentResolver;

/**
 * Custom tag library tag class for {@link UIComponentResolver}. Required for
 * the JSP API.
 * 
 * @author McDowell
 * @since 2.0
 */
public class ComponentResolverTag extends UIComponentELTag {

  /**
   * @see UIComponentResolver#COMPONENT_TYPE
   */
  @Override
  public String getComponentType() {
    return UIComponentResolver.COMPONENT_TYPE;
  }

  /**
   * @return null
   */
  @Override
  public String getRendererType() {
    return null;
  }

  private ValueExpression strict;
  private ValueExpression var;

  @Override
  protected void setProperties(UIComponent component) {
    super.setProperties(component);
    setProperty(component, "strict", strict);
    setProperty(component, "var", var);
  }

  private void setProperty(UIComponent component, String name,
      ValueExpression ve) {
    if (ve == null) {
      return;
    }
    if (ve.isLiteralText()) {
      component.getAttributes().put(name, ve.getExpressionString());
    } else {
      component.setValueExpression(name, ve);
    }
  }

  public void setStrict(ValueExpression strict) {
    this.strict = strict;
  }

  public void setVar(ValueExpression var) {
    this.var = var;
  }

  @Override
  public void release() {
    super.release();
    strict = null;
    var = null;
  }

}
