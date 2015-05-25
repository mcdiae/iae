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
import javax.faces.render.Renderer;

import tld.gurn.ctrl.components.DynamicTemplate;

public class DynamicTemplateRenderer extends Renderer {

  @Override
  public void encodeEnd(FacesContext context, UIComponent component)
      throws IOException {
    if (!component.isRendered()) {
      return;
    }
    DynamicTemplate template = (DynamicTemplate) component;

    ResponseWriter writer = context.getResponseWriter();

    String tag = template.getTag();
    if (tag != null) {
      writer.startElement(tag, component);
      writeId(context, template);
      writeDynamicAttributes(context, template);
    }

    Object text = template.getValue();
    if (text != null) {
      if (Boolean.FALSE.equals(template.getEscape())) {
        writer.write(text.toString());
      } else {
        writer.writeText(text, null);
      }
    }

    if (tag != null) {
      writer.endElement(tag);
    }
  }
}
