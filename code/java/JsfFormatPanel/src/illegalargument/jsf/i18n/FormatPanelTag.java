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

package illegalargument.jsf.i18n;

import javax.el.ValueExpression;
import javax.faces.component.UIComponent;
import javax.faces.webapp.UIComponentELTag;

/**
 * JSP tag library tag for JSF 1.2 control formatPanel.
 * 
 * @author McDowell
 */
public class FormatPanelTag extends UIComponentELTag {

  @Override
  public String getComponentType() {
    return HtmlFormatPanel.COMPONENT_TYPE;
  }

  @Override
  public String getRendererType() {
    return HtmlFormatPanel.RENDERER_TYPE;
  }

  private ValueExpression formatString;
  private ValueExpression style;
  private ValueExpression styleClass;
  private ValueExpression dir;
  private ValueExpression lang;
  private ValueExpression title;

  @Override
  protected void setProperties(UIComponent component) {
    super.setProperties(component);
    setProperty(component, "formatString", formatString);
    setProperty(component, "style", style);
    setProperty(component, "styleClass", styleClass);
    setProperty(component, "dir", dir);
    setProperty(component, "lang", lang);
    setProperty(component, "title", title);
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

  public void setFormatString(ValueExpression formatString) {
    this.formatString = formatString;
  }

  public void setStyle(ValueExpression style) {
    this.style = style;
  }

  public void setStyleClass(ValueExpression styleClass) {
    this.styleClass = styleClass;
  }

  public void setDir(ValueExpression dir) {
    this.dir = dir;
  }

  public void setLang(ValueExpression lang) {
    this.lang = lang;
  }

  public void setTitle(ValueExpression title) {
    this.title = title;
  }

  @Override
  public void release() {
    super.release();
    this.formatString = null;
    this.style = null;
    this.styleClass = null;
    this.dir = null;
    this.lang = null;
    this.title = null;
  }

}
