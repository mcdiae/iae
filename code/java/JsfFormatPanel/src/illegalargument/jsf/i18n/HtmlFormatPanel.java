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
import javax.faces.component.UIPanel;
import javax.faces.context.FacesContext;

/**
 * Formatted panel control for laying out child controls in a locale-specified
 * manner.
 * 
 * @author McDowell
 */
public class HtmlFormatPanel extends UIPanel {

  public static final String COMPONENT_TYPE = "illegalargument.jsf.i18n.HtmlFormatPanel";
  public static final String RENDERER_TYPE = "illegalargument.jsf.i18n.FormatPanelRenderer";

  private String formatString;
  private String style;
  private String styleClass;
  private String dir;
  private String lang;
  private String title;

  public HtmlFormatPanel() {
    setRendererType(RENDERER_TYPE);
  }

  public String getFamily() {
    return COMPONENT_TYPE;
  }

  public String getFormatString() {
    return resolveValue("formatString", formatString);
  }

  public void setFormatString(String formatString) {
    this.formatString = formatString;
  }

  public String getStyle() {
    return resolveValue("style", style);
  }

  public void setStyle(String style) {
    this.style = style;
  }

  public String getStyleClass() {
    return resolveValue("styleClass", styleClass);
  }

  public void setStyleClass(String styleClass) {
    this.styleClass = styleClass;
  }

  public String getDir() {
    return resolveValue("dir", dir);
  }

  public void setDir(String dir) {
    this.dir = dir;
  }

  public String getLang() {
    return resolveValue("lang", lang);
  }

  public void setLang(String lang) {
    this.lang = lang;
  }

  public String getTitle() {
    return resolveValue("title", title);
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public Object saveState(FacesContext context) {
    Object[] stateHolder = new Object[7];
    stateHolder[0] = super.saveState(context);
    stateHolder[1] = this.formatString;
    stateHolder[2] = this.style;
    stateHolder[3] = this.styleClass;
    stateHolder[4] = this.dir;
    stateHolder[5] = this.lang;
    stateHolder[6] = this.title;
    return stateHolder;
  }

  @Override
  public void restoreState(FacesContext context, Object state) {
    Object[] stateHolder = (Object[]) state;
    super.restoreState(context, stateHolder[0]);
    formatString = (String) stateHolder[1];
    style = (String) stateHolder[2];
    styleClass = (String) stateHolder[3];
    dir = (String) stateHolder[4];
    lang = (String) stateHolder[5];
    title = (String) stateHolder[6];
  }

  private String resolveValue(String attribute, String value) {
    if (value != null) {
      return value;
    }
    ValueExpression ve = getValueExpression(attribute);
    return (ve == null) ? null : (String) ve.getValue(getFacesContext()
        .getELContext());
  }

}
