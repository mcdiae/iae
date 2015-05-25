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

import static tld.gurn.incidental.Logs.log;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.logging.Level;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.webapp.UIComponentTag;
import javax.xml.namespace.QName;

import tld.gurn.ctrl.components.DynamicAttributeHolder;
import tld.gurn.incidental.Bindings;
import tld.gurn.incidental.Logs;

final class Rendering {
  private Rendering() {
  }

  public static void writeDynamicAttributes(FacesContext context,
      DynamicAttributeHolder dynamicAttributeHolder) throws IOException {
    Map<String, Object> dynamicAttrs =
        dynamicAttributeHolder.getDynamicAttributes();

    if (log().isLoggable(Level.FINE)) {
      log().fine("rendering dynamic attrs: " + dynamicAttrs);
    }

    if (dynamicAttrs == null || dynamicAttrs.isEmpty()) {
      return;
    }

    ResponseWriter writer = context.getResponseWriter();
    for (Map.Entry<String, Object> entry : dynamicAttrs.entrySet()) {
      String key = entry.getKey();
      Object value = eval(context, entry.getValue());
      writeAttribute(writer, key, value);
    }
  }

  public static void writeId(FacesContext context, UIComponent component)
      throws IOException {
    Object id = null;
    if (component instanceof DynamicAttributeHolder) {
      DynamicAttributeHolder holder = (DynamicAttributeHolder) component;
      Map<String, Object> map = holder.getDynamicAttributes();
      id = (map == null) ? null : map.get("id");
    }
    if (id == null) {
      id = component.getClientId(context);
    }

    writeAttribute(context.getResponseWriter(), "id", id);
  }

  private static class Holder {
    private static final Random RAN = new Random();
  }

  private static void writeAttribute(ResponseWriter writer, String key,
      Object value) throws IOException {
    boolean error = true;
    try {
      writeAttributeInternal(writer, key, value);
      error = false;
    } finally {
      if (error) {
        Logs.log()
            .severe("Error writing attribute " + key + "=" + value);
      }
    }
  }

  private static void writeAttributeInternal(ResponseWriter writer, String key,
      Object value) throws IOException {
    if (value == null) {
      value = "";
    }

    QName name = QName.valueOf(key);
    String localPart = name.getLocalPart();
    String namespace = name.getNamespaceURI();
    if (empty(namespace)) {
      writer.writeAttribute(localPart, value, localPart);
    } else {
      int n = Holder.RAN.nextInt(Integer.MAX_VALUE);
      String prefix = "dynamic" + n;
      writer.writeAttribute(prefix + ":" + localPart, value, name.toString());
      writer.writeAttribute("xmlns:" + prefix, namespace, name.toString());
    }
  }

  private static boolean empty(String str) {
    return (str == null) || (str.length() == 0);
  }

  public static Object eval(FacesContext context, Object o) {
    if (o instanceof String && UIComponentTag.isValueReference(o.toString())) {
      return Bindings.evaluate(context, o.toString());
    } else {
      return o;
    }
  }

  public static void renderChildren(FacesContext context, UIComponent component)
      throws IOException {
    if (component.getChildCount() > 0) {
      @SuppressWarnings("unchecked")
      List<UIComponent> kids = component.getChildren();
      for (UIComponent kid : kids) {
        render(context, kid);
      }
    }
  }

  private static void render(FacesContext context, UIComponent component)
      throws IOException {
    if (component.isRendered()) {
      component.encodeBegin(context);
      if (component.getRendersChildren()) {
        component.encodeChildren(context);
      } else {
        renderChildren(context, component);
      }
      component.encodeEnd(context);
    }
  }

  public static void decodeChildren(FacesContext context, UIComponent component) {
    if (component.getChildCount() > 0) {
      @SuppressWarnings("unchecked")
      List<UIComponent> kids = component.getChildren();
      for (UIComponent kid : kids) {
        decode(context, kid);
      }
    }
  }

  private static void decode(FacesContext context, UIComponent component) {
    if (component.isRendered()) {
      component.decode(context);
      if (!component.getRendersChildren()) {
        decodeChildren(context, component);
      }
    }
  }

  public static void resetIds(UIComponent component) {
    component.setId(component.getId());
    @SuppressWarnings("unchecked")
    Iterator<UIComponent> kids = component.getFacetsAndChildren();
    while (kids.hasNext()) {
      UIComponent kid = kids.next();
      resetIds(kid);
    }
  }
}
