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

import java.util.Map;

import javax.faces.component.UIComponent;
import javax.faces.webapp.UIComponentTag;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.DynamicAttributes;

abstract class DynamicAttributeComponentTag extends UIComponentTag implements
    DynamicAttributes {
  private DynamicTagComposer composer;

  private DynamicTagComposer composer() {
    if (composer == null) {
      composer = new DynamicTagComposer(this, getPropertyTypes());
    }
    return composer;
  }

  protected abstract Map<String, Class<?>> getPropertyTypes();

  public void setDynamicAttribute(String uri, String localName, Object value)
      throws JspException {
    composer().setDynamicAttribute(uri, localName, value);
  }

  @Override
  protected void setProperties(UIComponent component) {
    super.setProperties(component);
    if (composer != null) {
      composer.setProperties(component);
    }
  }

  @Override
  public void release() {
    composer = null;
    super.release();
  }
}