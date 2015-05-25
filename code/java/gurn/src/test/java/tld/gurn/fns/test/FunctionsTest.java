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

package tld.gurn.fns.test;

import javax.faces.application.ViewHandler;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import static org.mockito.Mockito.*;

import tld.gurn.fns.Functions;
import tld.gurn.test.MockContext;

public class FunctionsTest {

  private FacesContext context;
  private ViewHandler viewHandler;
  private ExternalContext ext;

  @Before
  public void init() {
    context = MockContext.mockContext();
    viewHandler = context.getApplication()
        .getViewHandler();
    ext = context.getExternalContext();
  }

  @After
  public void after() {
    FacesContext.getCurrentInstance()
        .release();
  }

  @Test
  public void testActionUrl() {
    String actionUrl = "/context/action.faces";
    String viewId = "action";

    when(viewHandler.getActionURL(context, viewId)).thenReturn(actionUrl);
    when(ext.encodeActionURL(actionUrl)).thenReturn(actionUrl);

    assertEquals(actionUrl, Functions.actionUrl(viewId));
  }

  @Test
  public void testResourceUrl() {
    String resourceUrl = "/context/foo.gif";
    String resource = "/foo.gif";

    when(viewHandler.getResourceURL(context, resource)).thenReturn(resourceUrl);
    when(ext.encodeResourceURL(resourceUrl)).thenReturn(resourceUrl);

    assertEquals(resourceUrl, Functions.resourceUrl(resource));
  }

  @Test
  public void testNamespace() {
    String namespaced = "view1234foo";
    String name = "foo";

    when(ext.encodeNamespace(name)).thenReturn(namespaced);

    assertEquals(namespaced, Functions.namespace(name));
  }

  @Test
  public void testIsUserInRole() {
    String roleA = "roleA";
    String roleB = "roleB";

    when(ext.isUserInRole(roleA)).thenReturn(Boolean.TRUE);
    when(ext.isUserInRole(roleB)).thenReturn(Boolean.FALSE);

    assertTrue(Functions.isUserInRole(roleA));
    assertFalse(Functions.isUserInRole(roleB));
  }

  @Test
  public void testXml() {
    String encoded = Functions.xml("\"'&<>");
    assertEquals("&quot;&apos;&amp;&lt;&gt;", encoded);
  }

  @Test
  public void testJsString() {
    String encoded = Functions.jsString("\\\t\r\n\"'");
    assertEquals("\\\\\\t\\r\\n\\\"\\'", encoded);
  }

  @Test
  public void testSafeId() {
    String id = "Hello, World! abc __";
    when(ext.encodeNamespace(id)).thenReturn(id);
    String encoded = Functions.safeId(id);
    assertEquals("jHello_002c_0020World_0021_0020abc_0020_005f_005f", encoded);
  }
}
