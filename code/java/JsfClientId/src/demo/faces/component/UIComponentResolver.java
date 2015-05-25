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

package demo.faces.component;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.el.ValueExpression;
import javax.faces.FacesException;
import javax.faces.component.UIComponent;
import javax.faces.component.UIComponentBase;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.FacesEvent;
import javax.faces.event.FacesListener;
import javax.faces.event.PhaseId;

import demo.faces.resolver.Resolver;

// TODO: check invokeOnComponent to see if it needs setUp/tearDown

/**
 * Component that sets a {@link Resolver} to itself on the request map to make
 * it accessible to child controls. The resolver is keyed to the "var" property.
 * The variable is request-scope and only accessible to child controls (the var
 * is unset at the end tag). The component is invisible and renders nothing.
 * 
 * @author McDowell
 * @since 2.0
 */
public class UIComponentResolver extends UIComponentBase {

  public static final String COMPONENT_TYPE = "demo.faces.component.UIComponentResolver";

  private final Resolver resolver = new Resolver(this);

  private Boolean strict;
  private String var;

  @Override
  public String getFamily() {
    return COMPONENT_TYPE;
  }

  /**
   * If strict is set to true, an exception is thrown if a collision is detected
   * when setting or removing the var.
   * 
   * @param strict
   *          a boolean; may be null
   */
  public void setStrict(Boolean strict) {
    this.strict = strict;
  }

  public Boolean getStrict() {
    if (strict != null) {
      return strict;
    }
    ValueExpression ve = getValueExpression("strict");
    return (ve == null) ? null : (Boolean) ve.getValue(getFacesContext()
        .getELContext());
  }

  public void setVar(String var) {
    this.var = var;
  }

  public String getVar() {
    if (var != null) {
      return var;
    }
    ValueExpression ve = getValueExpression("var");
    return (ve == null) ? null : (String) ve.getValue(getFacesContext()
        .getELContext());
  }

  @Override
  public Object saveState(FacesContext context) {
    Object[] state = new Object[3];
    state[0] = super.saveState(context);
    state[1] = strict;
    state[2] = var;
    return state;
  }

  @Override
  public void restoreState(FacesContext context, Object s) {
    Object[] state = (Object[]) s;
    super.restoreState(context, state[0]);
    strict = (Boolean) state[1];
    var = (String) state[2];
  }

  private boolean isStrict() {
    Boolean isStrict = getStrict();
    return isStrict == null || isStrict.booleanValue();
  }

  private void setUp(FacesContext context) {
    if (var == null) {
      throw new IllegalStateException("JSF component id='" + getId()
          + "' of type " + getClass() + " cannot have a null 'var' attribute");
    }
    Map<String, Object> req = reqMap(context);
    if (req.put(var, resolver) != null && isStrict()) {
      throw new FacesException("Id collision for " + getId());
    }
  }

  private void tearDown(FacesContext context) {
    Map<String, Object> req = reqMap(context);
    if (req.remove(var) != resolver && isStrict()) {
      throw new FacesException("Id collision for " + getId());
    }
  }

  @Override
  public void encodeBegin(FacesContext context) throws IOException {
  }

  @Override
  public void encodeChildren(FacesContext context) throws IOException {
    setUp(context);
    try {
      for (UIComponent kid : getChildren()) {
        if (kid.isRendered()) {
          kid.encodeAll(context);
        }
      }
    } finally {
      tearDown(context);
    }
  }

  @Override
  public void encodeEnd(FacesContext context) throws IOException {
  }

  @Override
  public void processDecodes(FacesContext context) {
    setUp(context);
    try {
      super.processDecodes(context);
    } finally {
      tearDown(context);
    }
  }

  @Override
  public void processRestoreState(FacesContext context, Object state) {
    Object[] myState = (Object[]) state;
    restoreState(context, myState[0]);
    setUp(context);
    try {
      restoreKids(context, (Object[]) myState[1]);
      restoreFacets(context, (Map<?, ?>) myState[2]);
    } finally {
      tearDown(context);
    }
  }

  @Override
  public Object processSaveState(FacesContext context) {
    Object[] state = new Object[3];
    state[0] = saveState(context);
    setUp(context);
    try {
      state[1] = saveKids(context);
      state[2] = saveFacets(context);
      return state;
    } finally {
      tearDown(context);
    }
  }

  private Object[] saveKids(FacesContext context) {
    if (getChildCount() == 0) {
      return null;
    }
    Object[] state = new Object[getChildCount()];
    int index = 0;
    for (UIComponent kid : getChildren()) {
      state[index++] = kid.saveState(context);
    }
    return state;
  }

  private void restoreKids(FacesContext context, Object[] state) {
    if (state == null) {
      return;
    }
    int index = 0;
    for (UIComponent kid : getChildren()) {
      Object kidState = state[index++];
      if (kidState != null) {
        kid.restoreState(context, kidState);
      }
    }
  }

  private Map<String, Object> saveFacets(FacesContext context) {
    if (getFacetCount() == 0) {
      return null;
    }
    Map<String, Object> state = new HashMap<String, Object>(getFacetCount());
    for (Map.Entry<String, UIComponent> facet : getFacets().entrySet()) {
      state.put(facet.getKey(), facet.getValue().saveState(context));
    }
    return state;
  }

  private void restoreFacets(FacesContext context, Map<?, ?> state) {
    if (getFacetCount() == 0) {
      return;
    }
    for (Map.Entry<String, UIComponent> facet : getFacets().entrySet()) {
      Object facetState = state.get(facet.getKey());
      if (facetState != null) {
        facet.getValue().restoreState(context, facetState);
      }
    }
  }

  @Override
  public void processUpdates(FacesContext context) {
    setUp(context);
    try {
      super.processUpdates(context);
    } finally {
      tearDown(context);
    }
  }

  @Override
  public void processValidators(FacesContext context) {
    setUp(context);
    try {
      super.processValidators(context);
    } finally {
      tearDown(context);
    }
  }

  @Override
  public void broadcast(FacesEvent event) throws AbortProcessingException {
    FacesContext context = FacesContext.getCurrentInstance();
    setUp(context);
    try {
      if (event instanceof ResolverEvent) {
        event = ((ResolverEvent) event).getEvent();
        event.getComponent().broadcast(event);
      } else {
        super.broadcast(event);
      }
    } finally {
      tearDown(context);
    }
  }

  @Override
  public void queueEvent(FacesEvent event) {
    if (event.getComponent() != null) {
      super.queueEvent(new ResolverEvent(event, this));
    }
  }

  private Map<String, Object> reqMap(FacesContext context) {
    ExternalContext extContext = context.getExternalContext();
    return extContext.getRequestMap();
  }

  @Override
  public boolean getRendersChildren() {
    return true;
  }

  private static class ResolverEvent extends FacesEvent {
    private static final long serialVersionUID = 1L;

    private final FacesEvent decorated;

    public ResolverEvent(FacesEvent decorated, UIComponent component) {
      super(component);
      this.decorated = decorated;
    }

    public FacesEvent getEvent() {
      return decorated;
    }

    @Override
    public boolean isAppropriateListener(FacesListener listener) {
      return decorated.isAppropriateListener(listener);
    }

    @Override
    public void processListener(FacesListener listener) {
      decorated.processListener(listener);
    }

    @Override
    public PhaseId getPhaseId() {
      return decorated.getPhaseId();
    }

    @Override
    public void setPhaseId(PhaseId phaseId) {
      decorated.setPhaseId(phaseId);
    }

    @Override
    public void queue() {
      decorated.queue();
    }
  }

}
