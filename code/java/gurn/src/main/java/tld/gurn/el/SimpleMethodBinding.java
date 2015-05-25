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

package tld.gurn.el;

import javax.faces.component.StateHolder;
import javax.faces.context.FacesContext;
import javax.faces.el.EvaluationException;
import javax.faces.el.MethodBinding;
import javax.faces.el.MethodNotFoundException;

public final class SimpleMethodBinding extends MethodBinding implements
    StateHolder {
  private String navigationOutcome;
  private boolean isTransient = false;

  public SimpleMethodBinding() {
  }

  @Override
  public Class<?> getType(FacesContext facescontext)
      throws MethodNotFoundException {
    return String.class;
  }

  @Override
  public Object invoke(FacesContext facescontext, Object[] aobj)
      throws EvaluationException, MethodNotFoundException {
    return navigationOutcome;
  }

  public boolean isTransient() {
    return isTransient;
  }

  public void restoreState(FacesContext context, Object state) {
    this.navigationOutcome = (String) state;
  }

  public Object saveState(FacesContext context) {
    return navigationOutcome;
  }

  public void setTransient(boolean newTransientValue) {
    this.isTransient = newTransientValue;
  }

  public static MethodBinding adaptToMethodBinding(String navigationOutcome) {
    SimpleMethodBinding binding = new SimpleMethodBinding();
    binding.navigationOutcome = navigationOutcome;
    return binding;
  }
}
