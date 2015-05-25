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

package tld.gurn.fns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

import tld.gurn.incidental.CharEscapes;


public final class Functions {
  private Functions() {
  }

  private static FacesContext context() {
    return FacesContext.getCurrentInstance();
  }

  public static String actionUrl(String viewId) {
    FacesContext context = context();
    String actionUrl = context.getApplication()
        .getViewHandler()
        .getActionURL(context, viewId);
    return context.getExternalContext()
        .encodeActionURL(actionUrl);
  }

  public static String resourceUrl(String url) {
    FacesContext context = context();
    String resUrl = context.getApplication()
        .getViewHandler()
        .getResourceURL(context, url);
    return context.getExternalContext()
        .encodeResourceURL(resUrl);
  }

  public static String namespace(String name) {
    return context().getExternalContext()
        .encodeNamespace(name);
  }

  public static String clientId(UIComponent component) {
    return component.getClientId(context());
  }

  public static boolean isUserInRole(String role) {
    return context().getExternalContext()
        .isUserInRole(role);
  }

  private static final Pattern ALPHANUMERIC = Pattern.compile("[^\\p{Alnum}]+");

  public static String safeId(String id) {
    String namespaced = namespace(id);
    StringBuilder buffer = new StringBuilder("j");
    Matcher matcher = ALPHANUMERIC.matcher(namespaced);
    int offset = 0;
    while (matcher.find()) {
      buffer.append(namespaced, offset, matcher.start());
      appendSafe(buffer, matcher.group());
      offset = matcher.end();
    }
    buffer.append(namespaced, offset, namespaced.length());
    return buffer.toString();
  }

  private static void appendSafe(StringBuilder out, CharSequence data) {
    for (int i = 0; i < data.length(); i++) {
      out.append("_");
      char ch = data.charAt(i);
      out.append(nibble(ch, 12));
      out.append(nibble(ch, 8));
      out.append(nibble(ch, 4));
      out.append(nibble(ch, 0));
    }
  }

  private static String nibble(char ch, int shift) {
    return Integer.toHexString((ch >> shift) & 0xF);
  }

  public static String cdata(String value) {
    return value == null ? null : "<![CDATA["
        + value.replace("]]>", "]]]]><![CDATA[>") + "]]>";
  }

  // http://www.w3.org/TR/xml/#syntax
  private static final CharEscapes XML_ESCAPES = CharEscapes.builder()
      .with('"', "&quot;")
      .with('\'', "&apos;")
      .with('&', "&amp;")
      .with('<', "&lt;")
      .with('>', "&gt;")
      .build();

  public static String xml(String value) {
    if (value == null) {
      return null;
    }
    return XML_ESCAPES.escape(value);
  }

  private static final CharEscapes JS_ESCAPES = CharEscapes.builder()
      .with('\\', "\\\\")
      .with('\t', "\\t")
      .with('\r', "\\r")
      .with('\n', "\\n")
      .with('\b', "\\b")
      .with('\f', "\\f")
      .with('"', "\\\"")
      .with('\'', "\\'")
      .build();

  public static String jsString(String value) {
    if (value == null) {
      return null;
    }
    return JS_ESCAPES.escape(value);
  }
}
