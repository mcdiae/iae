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

import static tld.gurn.incidental.Logs.log;

import java.util.Map;

import javax.faces.component.UIComponent;

import tld.gurn.ctrl.components.DynamicRepeat;
import tld.gurn.incidental.Reflection;

public class DynamicRepeatTag extends DynamicAttributeComponentTag {
  private static final Map<String, Class<?>> PROP_TYPES =
    Reflection.getPropertyTypes(DynamicRepeat.class);
  
  @Override
  protected Map<String, Class<?>> getPropertyTypes() {
    return PROP_TYPES;
  }
  
  @Override
  public String getComponentType() {
    return DynamicRepeat.COMPONENT_TYPE;
  }

  @Override
  public String getRendererType() {
    return DynamicRepeat.RENDERER_TYPE;
  }

  @Override
  protected void setProperties(UIComponent component) {
    if (!(component instanceof DynamicRepeat)) {
      String msg = "Component %s is not instance of %s";
      log().severe(String.format(msg, component, DynamicRepeat.class));
    }

    super.setProperties(component);
  }
}
