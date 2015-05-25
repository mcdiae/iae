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
package demo.faces.defer.el;

import java.io.Serializable;

import javax.el.ELContext;
import javax.el.ValueExpression;
import javax.enterprise.inject.Default;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.faces.context.FacesContext;

import demo.faces.defer.Property;

/**
 * @author McDowell
 */
public class ElProducer {

  /**
   * Produces a property for lazy EL evaluation. Property injection points are
   * expected to be annotated with the {@link EL} qualifier.
   * 
   * @param site
   *          the injection point
   * @return a property implementation
   */
  @Produces
  @EL("")
  @Default
  public Property property(InjectionPoint site) {
    EL el = site.getAnnotated().getAnnotation(EL.class);
    ElProperty property = new ElProperty(el);
    return property;
  }

  private static class ElProperty implements Property, Serializable {
    private static final long serialVersionUID = 1L;

    private final EL expr;

    ElProperty(EL expr) {
      this.expr = expr;
    }

    @Override
    public <T> T get() {
      FacesContext jsf = context();
      @SuppressWarnings("unchecked")
      T t = (T) resolve(jsf).getValue(jsf.getELContext());
      return t;
    }

    @Override
    public <T> void set(T t) {
      FacesContext jsf = context();
      resolve(jsf).setValue(jsf.getELContext(), t);
    }

    private ValueExpression resolve(FacesContext jsf) {
      ELContext context = jsf.getELContext();
      return jsf.getApplication()
          .getExpressionFactory()
          .createValueExpression(context, expr.value(), expr.coerce());
    }

    private FacesContext context() {
      FacesContext jsf = FacesContext.getCurrentInstance();
      if (jsf == null) {
        throw new IllegalStateException(
            "FacesContext.getCurrentInstance() == null; "
                + "code must be executed in a JSF context");
      }
      return jsf;
    }
  }
}