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

package tld.gurn.ctrl.renderers;

import static tld.gurn.ctrl.renderers.Rendering.writeDynamicAttributes;
import static tld.gurn.ctrl.renderers.Rendering.writeId;

import java.io.IOException;

import javax.faces.component.UIComponent;
import javax.faces.component.UIData;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.Renderer;

import tld.gurn.ctrl.components.DynamicRepeat;

public class DynamicRepeatRenderer extends Renderer {

  @Override
  public boolean getRendersChildren() {
    return true;
  }

  @Override
  public void encodeBegin(FacesContext context, UIComponent component)
      throws IOException {
    if (!component.isRendered()) {
      return;
    }
    DynamicRepeat repeat = (DynamicRepeat) component;

    String tag = repeat.getTag();
    if (tag == null) {
      return;
    }

    ResponseWriter writer = context.getResponseWriter();
    writer.startElement(tag, component);
    writeId(context, repeat);
    writeDynamicAttributes(context, repeat);
  }

  @Override
  public void encodeChildren(FacesContext context, UIComponent component)
      throws IOException {
    if (!component.isRendered()) {
      return;
    }
    DynamicRepeat panel = (DynamicRepeat) component;

    int offset = panel.getFirst();
    int end = to(panel);

    for (int i = offset; i < end; i++) {
      panel.setRowIndex(i);
      Rendering.resetIds(panel);
      Rendering.renderChildren(context, panel);
    }

    panel.setRowIndex(-1);
    Rendering.resetIds(panel);
  }

  private int to(UIData data) {
    int offset = data.getFirst();
    int rows = data.getRows();
    int rowCount = data.getRowCount();
    return offset + ((rows == 0) ? rowCount : Math.min(rows, rowCount));
  }

  @Override
  public void encodeEnd(FacesContext context, UIComponent component)
      throws IOException {
    if (!component.isRendered()) {
      return;
    }
    DynamicRepeat repeat = (DynamicRepeat) component;

    String tag = repeat.getTag();
    if (tag == null) {
      return;
    }

    ResponseWriter writer = context.getResponseWriter();
    writer.endElement(tag);
  }

  @Override
  public void decode(FacesContext context, UIComponent component) {
    if (!component.isRendered()) {
      return;
    }
    DynamicRepeat panel = (DynamicRepeat) component;

    int offset = panel.getFirst();
    int end = to(panel);

    for (int i = offset; i < end; i++) {
      panel.setRowIndex(i);
      Rendering.resetIds(panel);
      Rendering.decodeChildren(context, panel);
    }

    panel.setRowIndex(-1);
    Rendering.resetIds(panel);
  }
}
