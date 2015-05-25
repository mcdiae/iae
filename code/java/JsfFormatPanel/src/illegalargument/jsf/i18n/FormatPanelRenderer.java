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

import java.io.IOException;
import java.text.MessageFormat;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.faces.FacesException;
import javax.faces.component.UIComponent;
import javax.faces.component.UIParameter;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.Renderer;

/**
 * Renderer for {@link HtmlFormatPanel}.
 * 
 * @author McDowell
 */
public class FormatPanelRenderer extends Renderer {

  /** Used to find patterns of the form {2,number,integer} */
  private static final Pattern PARAM_PATTERN = Pattern.compile("\\{\\d.*?\\}");

  /** Used to extract the integer from PARAM_REGEX matched */
  private static final Pattern INDEX_PATTERN = Pattern.compile("\\d+");

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

    ResponseWriter writer = context.getResponseWriter();

    String style;
    String styleClass;
    String dir;
    String lang;
    String title;
    if (component instanceof HtmlFormatPanel) {
      HtmlFormatPanel panel = (HtmlFormatPanel) component;
      style = panel.getStyle();
      styleClass = panel.getStyleClass();
      dir = panel.getDir();
      lang = panel.getLang();
      title = panel.getTitle();
    } else {
      style = (String) component.getAttributes().get("style");
      styleClass = (String) component.getAttributes().get("styleClass");
      dir = (String) component.getAttributes().get("dir");
      lang = (String) component.getAttributes().get("lang");
      title = (String) component.getAttributes().get("title");
    }
    writer.startElement("span", component);
    writer.writeAttribute("id", component.getClientId(context), "id");
    writeAttribute(writer, "style", style, "style");
    writeAttribute(writer, "class", styleClass, "styleClass");
    writeAttribute(writer, "dir", dir, "dir");
    writeAttribute(writer, "lang", lang, "lang");
    writeAttribute(writer, "title", title, "title");
  }

  private void writeAttribute(ResponseWriter writer, String name, String value,
      String prop) throws IOException {
    if (value != null) {
      writer.writeAttribute(name, value, prop);
    }
  }

  @Override
  public void encodeChildren(FacesContext context, UIComponent component)
      throws IOException {
    if (!component.isRendered()) {
      return;
    }

    String formatString;
    if (component instanceof HtmlFormatPanel) {
      HtmlFormatPanel panel = (HtmlFormatPanel) component;
      formatString = panel.getFormatString();
    } else {
      formatString = (String) component.getAttributes().get("formatString");
    }

    ResponseWriter writer = context.getResponseWriter();
    List<UIComponent> kids = component.getChildren();

    Matcher matcher = PARAM_PATTERN.matcher(formatString);
    int end = 0;
    while (matcher.find(end)) {
      int start = matcher.start();
      if (start > end) {
        writer.writeText(formatString.substring(end, start), null);
      }
      String param = matcher.group();
      int kidIndex = getIndex(param);
      if (kidIndex >= kids.size()) {
        String msg = "Error on component of type {0} id={1}. Index of parameter {2} out of bounds for number of children ({3}). Format string: {4}";
        msg = MessageFormat.format(msg, component.getClass().getName(),
            component.getId(), param, kids.size(), formatString);
        throw new FacesException(msg);
      }
      UIComponent kid = kids.get(kidIndex);
      renderChild(context, kid, param);
      end = matcher.end();
    }
    int len = formatString.length();
    if (end < len) {
      writer.writeText(formatString.substring(end, len), null);
    }
  }

  @Override
  public void encodeEnd(FacesContext context, UIComponent component)
      throws IOException {
    if (!component.isRendered()) {
      return;
    }
    ResponseWriter writer = context.getResponseWriter();
    writer.endElement("span");
  }

  private int getIndex(String param) {
    Matcher matcher = INDEX_PATTERN.matcher(param);
    if (matcher.find()) {
      String index = matcher.group();
      return Integer.parseInt(index);
    } else {
      throw new IllegalStateException("Invalid data: " + param);
    }
  }

  private String replaceIndex(String param, int index) {
    Matcher matcher = INDEX_PATTERN.matcher(param);
    if (matcher.find()) {
      String idx = Integer.toString(index);
      return matcher.replaceFirst(idx);
    } else {
      throw new IllegalStateException("Invalid data: " + param);
    }
  }

  private void renderChild(FacesContext context, UIComponent kid, String param)
      throws IOException {
    if (kid instanceof UIParameter) {
      param = replaceIndex(param, 0);
      Object value = ((UIParameter) kid).getValue();
      String text = MessageFormat.format(param, value);
      ResponseWriter writer = context.getResponseWriter();
      writer.writeText(text, kid, null);
    } else {
      kid.encodeAll(context);
    }
  }

}
