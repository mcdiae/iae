/*
Copyright (c) 2012 McDowell

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
package demo.faces.defer.el.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;
import javax.enterprise.inject.spi.Annotated;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.faces.application.Application;
import javax.faces.context.FacesContext;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import demo.faces.defer.Property;
import demo.faces.defer.el.EL;
import demo.faces.defer.el.ElProducer;

public class ElProducerTest {
  private static final String EXPR = "#{foo}";

  @Mock
  private ExpressionFactory expressionFactory;
  @Mock
  private ELContext elContext;
  @Mock
  private ValueExpression expr;
  @Mock
  private InjectionPoint site;

  private FacesContext context;

  private Object set = new Object();
  private Object get = new Object();

  @EL(EXPR)
  @Before
  public void before() throws SecurityException, NoSuchMethodException {
    MockitoAnnotations.initMocks(this);

    Application app = mock(Application.class);
    context = ContextMocker.mockFacesContext();

    when(context.getApplication()).thenReturn(app);
    when(app.getExpressionFactory()).thenReturn(expressionFactory);
    when(context.getELContext()).thenReturn(elContext);

    EL el = ElProducerTest.class.getMethod("before").getAnnotation(EL.class);
    Annotated annotated = mock(Annotated.class);
    when(site.getAnnotated()).thenReturn(annotated);
    when(annotated.getAnnotation(EL.class)).thenReturn(el);
    when(expressionFactory.createValueExpression(elContext, EXPR, Object.class)).thenReturn(
        expr);
    when(expr.getValue(elContext)).thenReturn(get);
  }

  @Test
  public void producer() {
    ElProducer producer = new ElProducer();
    Property prop = producer.property(site);
    assertEquals(get, prop.get());
    prop.set(set);
    verify(expr).setValue(elContext, set);
  }

  @Test
  public void passivation() throws Exception {
    ElProducer producer = new ElProducer();
    Property prop = producer.property(site);
    prop = Serialization.testPassivation(prop);
    assertEquals(get, prop.get());
    prop.set(set);

    verify(expr).setValue(elContext, set);
  }

  @After
  public void after() {
    context.release();
  }
}
