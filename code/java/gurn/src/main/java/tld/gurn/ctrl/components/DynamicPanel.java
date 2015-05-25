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

import javax.faces.component.UIPanel;
import javax.faces.context.FacesContext;

import tld.gurn.ctrl.renderers.DynamicPanelRenderer;

public class DynamicPanel extends UIPanel implements DynamicAttributeHolder, ClientIdProvider {

  public static final String COMPONENT_TYPE = DynamicPanel.class.getName();

  public static final String RENDERER_TYPE =
      DynamicPanelRenderer.class.getName();

  private Map<String, Object> attrs;
  private String tag;

  public DynamicPanel() {
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

  @Override
  public Object saveState(FacesContext context) {
    Object[] panelState = { super.saveState(context), tag, attrs };
    return panelState;
  }

  @Override
  public void restoreState(FacesContext context, Object state) {
    Object[] panelState = (Object[]) state;
    super.restoreState(context, panelState[0]);
    tag = cast(panelState[1]);
    attrs = cast(panelState[2]);
  }
}
