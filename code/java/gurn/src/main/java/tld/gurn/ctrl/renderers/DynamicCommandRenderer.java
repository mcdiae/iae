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
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.event.ActionEvent;
import javax.faces.render.Renderer;

import tld.gurn.ctrl.components.DynamicCommand;

public class DynamicCommandRenderer extends Renderer {

  @Override
  public void encodeBegin(FacesContext context, UIComponent component)
      throws IOException {
    if (!component.isRendered()) {
      return;
    }
    DynamicCommand command = (DynamicCommand) component;

    String tag = command.getTag();
    if (tag == null) {
      return;
    }

    ResponseWriter writer = context.getResponseWriter();
    writer.startElement(tag, component);
    writeId(context, command);
    writeDynamicAttributes(context, command);
  }

  @Override
  public void encodeEnd(FacesContext context, UIComponent component)
      throws IOException {
    if (!component.isRendered()) {
      return;
    }
    DynamicCommand command = (DynamicCommand) component;

    String tag = command.getTag();
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
    DynamicCommand command = (DynamicCommand) component;

    if (isOn(context, command)) {
      command.queueEvent(new ActionEvent(command));
    }
  }

  private boolean isOn(FacesContext context, DynamicCommand command) {
    boolean inputExpressionSet = command.getValueBinding("on") != null;
    if (inputExpressionSet) {
      return Boolean.TRUE.equals(command.getOn());
    }
    if (Boolean.FALSE.equals(command.getDefaultParam())) {
      return false;
    }
    String clientId = command.getClientId(context);
    return context.getExternalContext()
        .getRequestParameterMap()
        .containsKey(clientId);
  }
}
