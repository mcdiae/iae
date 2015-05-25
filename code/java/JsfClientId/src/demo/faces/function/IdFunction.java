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

package demo.faces.function;

import javax.faces.FacesException;
import javax.faces.component.NamingContainer;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

import demo.faces.resolver.Resolver;

/**
 * Static methods for mapping to custom tag library functions.
 * 
 * @author McDowell
 * @since 2.0
 */
public final class IdFunction {

  private IdFunction() {
  }

  /**
   * Returns the clientId of a given component. Only required in JSF 1.2; JSF
   * 2.0 users can call the no-args getClientId method on the component
   * directly.
   * 
   * @param component
   *          the component
   * @return the client id
   * @see UIComponent#getClientId(FacesContext)
   */
  public static String cid(UIComponent component) {
    FacesContext context = FacesContext.getCurrentInstance();
    return component.getClientId(context);
  }

  /**
   * Finds a peer of a given {@link UIComponent} based on its component
   * identifier. The "container" of the component is found using
   * {@link #container(UIComponent)}, then {@link #find(UIComponent, String)} is
   * called on the result.
   * 
   * @param peerOfThis
   *          a component
   * @param id
   *          the id of the component to find in the container
   * @return the component
   * @see javax.faces.component.UIComponent#findComponent(String)
   * @throws IllegalArgumentException
   *           if an argument is null
   */
  public static UIComponent peer(UIComponent peerOfThis, String id)
      throws IllegalArgumentException {
    if (peerOfThis == null || id == null) {
      throw new IllegalArgumentException("UIComponent=" + peerOfThis
          + "; String=" + id);
    }
    UIComponent container = container(peerOfThis);
    return find(container, id);
  }

  /**
   * Finds a component by its identifier, relative to a provided component. If
   * the provided component is a {@link NamingContainer}, the method will use it
   * to find one of its children. Otherwise, {@link #container(UIComponent)} is
   * used to retrieve the container and that is used to find the component.
   * 
   * @param relativeToThis
   *          a component for disambiguation of ID collisions
   * @param id
   *          the id of the component to find
   * @return the component with the id
   * @throws IllegalArgumentException
   *           if an argument is null
   * @see UIComponent#findComponent(String)
   */
  public static UIComponent find(UIComponent relativeToThis, String id)
      throws IllegalArgumentException {
    if (relativeToThis == null || id == null) {
      throw new IllegalArgumentException("UIComponent=" + relativeToThis
          + "; String=" + id);
    }
    boolean nc = relativeToThis instanceof NamingContainer;
    UIComponent container;
    if (nc) {
      container = relativeToThis;
    } else {
      container = container(relativeToThis);
    }
    FacesContext context = FacesContext.getCurrentInstance();
    String clientId = nc ? container.getClientId(context) + separator(context)
        + id : id;
    return container.findComponent(clientId);
  }

  /**
   * Returns the nearest {@link NamingContainer} ancestor or the view root if
   * none.
   * 
   * @param component
   *          the component whose container is required
   * @return the container
   */
  public static UIComponent container(UIComponent component) {
    UIComponent parent = component.getParent();
    while (parent != null) {
      if (parent instanceof NamingContainer) {
        return parent;
      }
      parent = parent.getParent();
    }
    FacesContext context = FacesContext.getCurrentInstance();
    return context.getViewRoot();
  }

  /**
   * Returns the closest ancestor of the given component with the given id.
   * 
   * @param component
   *          the component whose ancestor must be found
   * @param id
   *          the id of the ancestor
   * @return the ancestor
   * @throws IllegalArgumentException
   *           if an argument is null
   * @throws FacesException
   *           if no ancestor can be found
   */
  public static UIComponent ancestor(UIComponent component, String id)
      throws IllegalArgumentException, FacesException {
    if (id == null) {
      throw new IllegalArgumentException("UIComponent=" + component
          + "; String=" + id);
    }
    UIComponent ancestor = component.getParent();
    while (ancestor != null) {
      if (id.equals(ancestor.getId())) {
        return ancestor;
      }
    }
    return null;
  }

  /**
   * Wraps a component in a resolver.
   * 
   * @param component
   *          the component to wrap
   * @return the resolver
   */
  public static Resolver resolver(UIComponent component) {
    return new Resolver(component);
  }

  /**
   * Utilises new JSF2 separator functionality if available. By default, this
   * will probably be ':', but it is an implementation decision and can be set
   * by user in JSF 2.
   * 
   * TODO: start depending on JSF 2 + fall back to JSF 1.2 when appropriate
   * 
   * @see javax.faces.component.UINamingContainer#getSeparatorChar(FacesContext)
   */
  private static char separator(FacesContext context) {
    final String PARAM_NAME = "javax.faces.SEPARATOR_CHAR";
    String separator = context.getExternalContext()
        .getInitParameter(PARAM_NAME);
    if (separator == null) {
      return NamingContainer.SEPARATOR_CHAR;
    }
    separator = separator.trim();
    if (separator.length() == 1) {
      return separator.charAt(0);
    }
    String msg = "ERROR: value '" + separator + "' set for init parameter "
        + PARAM_NAME + " has illegal length (must be a single character)";
    context.getExternalContext().log(msg);
    throw new IllegalStateException(msg);
  }
}
