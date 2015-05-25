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

package tld.gurn.ctrl.components;

import static tld.gurn.ctrl.components.Componentry.cast;
import static tld.gurn.ctrl.components.Componentry.property;

import java.util.Map;

import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;

import tld.gurn.ctrl.renderers.DynamicInputRenderer;

public class DynamicInput extends UIInput implements DynamicAttributeHolder, ClientIdProvider {
  public static final String COMPONENT_TYPE = DynamicInput.class.getName();

  public static final String RENDERER_TYPE =
      DynamicInputRenderer.class.getName();

  private Map<String, Object> attrs;
  private String tag;
  private Object in;
  private Boolean defaultParam;

  public DynamicInput() {
    setRendererType(RENDERER_TYPE);
  }

  public String getClientId() {
    return super.getClientId(FacesContext.getCurrentInstance());
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public String getTag() {
    return property(this, "tag", tag);
  }

  public void setDynamicAttributes(Map<String, Object> attrs) {
    this.attrs = attrs;
  }

  public Map<String, Object> getDynamicAttributes() {
    return property(this, "dynamicAttributes", attrs);
  }

  public Object getIn() {
    return property(this, "in", in);
  }

  public void setIn(Boolean in) {
    this.in = in;
  }

  public Boolean getDefaultParam() {
    return property(this, "defaultParam", defaultParam);
  }

  public void setDefaultParam(Boolean defaultParam) {
    this.defaultParam = defaultParam;
  }

  @Override
  public Object saveState(FacesContext context) {
    Object[] state = { super.saveState(context), tag, attrs, in, defaultParam };
    return state;
  }

  @Override
  public void restoreState(FacesContext context, Object _state) {
    Object[] state = (Object[]) _state;
    super.restoreState(context, state[0]);
    tag = cast(state[1]);
    attrs = cast(state[2]);
    in = cast(state[3]);
    defaultParam = cast(state[4]);
  }
}
