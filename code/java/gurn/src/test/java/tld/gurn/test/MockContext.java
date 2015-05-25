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

package tld.gurn.test;

import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Iterator;

import javax.faces.application.Application;
import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.application.ViewHandler;
import javax.faces.component.UIViewRoot;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseStream;
import javax.faces.context.ResponseWriter;
import javax.faces.render.RenderKit;

import org.junit.Ignore;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

@Ignore
public final class MockContext {

  public static FacesContext mockContext() {
    Application application = mock(Application.class);
    ViewHandler viewHandler = mock(ViewHandler.class);
    ExternalContext ext = mock(ExternalContext.class);

    FacesContext context = mock(FacesContext.class);
    when(context.getApplication()).thenReturn(application);
    when(application.getViewHandler()).thenReturn(viewHandler);
    when(context.getExternalContext()).thenReturn(ext);
    doAnswer(Releaser.INSTANCE).when(context)
        .release();

    return M.setContext(context);
  }

  private static class M extends FacesContext {

    private M() {
    }

    public static FacesContext setContext(FacesContext context) {
      setCurrentInstance(context);
      return context;
    }

    @Override
    public void addMessage(String arg0, FacesMessage arg1) {
    }

    @Override
    public Application getApplication() {

      return null;
    }

    @Override
    public Iterator<String> getClientIdsWithMessages() {
      // TODO Auto-generated method stub
      return null;
    }

    @Override
    public ExternalContext getExternalContext() {
      // TODO Auto-generated method stub
      return null;
    }

    @Override
    public Severity getMaximumSeverity() {
      // TODO Auto-generated method stub
      return null;
    }

    @Override
    public Iterator<FacesMessage> getMessages() {
      // TODO Auto-generated method stub
      return null;
    }

    @Override
    public Iterator<FacesMessage> getMessages(String arg0) {
      // TODO Auto-generated method stub
      return null;
    }

    @Override
    public RenderKit getRenderKit() {
      // TODO Auto-generated method stub
      return null;
    }

    @Override
    public boolean getRenderResponse() {
      // TODO Auto-generated method stub
      return false;
    }

    @Override
    public boolean getResponseComplete() {
      // TODO Auto-generated method stub
      return false;
    }

    @Override
    public ResponseStream getResponseStream() {
      // TODO Auto-generated method stub
      return null;
    }

    @Override
    public ResponseWriter getResponseWriter() {
      // TODO Auto-generated method stub
      return null;
    }

    @Override
    public UIViewRoot getViewRoot() {
      // TODO Auto-generated method stub
      return null;
    }

    @Override
    public void release() {
      // TODO Auto-generated method stub

    }

    @Override
    public void renderResponse() {
      // TODO Auto-generated method stub

    }

    @Override
    public void responseComplete() {
      // TODO Auto-generated method stub

    }

    @Override
    public void setResponseStream(ResponseStream arg0) {
      // TODO Auto-generated method stub

    }

    @Override
    public void setResponseWriter(ResponseWriter arg0) {
      // TODO Auto-generated method stub

    }

    @Override
    public void setViewRoot(UIViewRoot arg0) {
      // TODO Auto-generated method stub

    }
  }

  private static enum Releaser implements Answer<Object> {
    INSTANCE;
    public Object answer(InvocationOnMock invocation) throws Throwable {
      M.setContext(null);
      return null;
    }
  }
}
