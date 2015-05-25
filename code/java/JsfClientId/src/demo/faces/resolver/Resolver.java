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

package demo.faces.resolver;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;

import javax.faces.FacesException;
import javax.faces.component.NamingContainer;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

import demo.faces.function.IdFunction;

/**
 * Utility class for aiding component traversal using the Universal Expression
 * Language.
 * 
 * @author McDowell
 * @since 2.0
 */
public class Resolver {

  private final Map<String, Resolver> findMap = new ResolverMap() {
    @Override
    public Resolver get(Object id) {
      return find(id);
    }
  };

  private final Map<String, Resolver> ancestorMap = new ResolverMap() {
    public Resolver get(Object key) {
      return ancestor(key);
    };
  };

  private final ResolverMap facetMap = new ResolverMap() {
    public Resolver get(Object key) {
      return facet(key);
    };
  };

  private final ResolverMap peerMap = new ResolverMap() {
    public Resolver get(Object key) {
      return peer(key);
    };
  };

  private final UIComponent component;

  /**
   * Takes component associated with this resolver.
   * 
   * @param component
   *          a non-null component
   */
  public Resolver(UIComponent component) {
    if (component == null) {
      throw new IllegalArgumentException("null");
    }
    this.component = component;
  }

  /**
   * The JSF component that backs this resolver.
   * 
   * @return the component
   */
  public UIComponent getComponent() {
    return component;
  }

  /**
   * Returns the component identifier encoded for view use.
   * 
   * @return the clientId
   * @see UIComponent#getClientId(FacesContext)
   */
  public String getClientId() {
    FacesContext context = FacesContext.getCurrentInstance();
    return component.getClientId(context);
  }

  /**
   * Returns the resolver for the immediate parent of this component.
   * 
   * @return the parent
   * @see UIComponent#getParent()
   */
  public Resolver getParent() {
    return new Resolver(component.getParent());
  }

  /**
   * This component's {@link NamingContainer}.
   * 
   * @return the naming container or the view root
   * @see IdFunction#container(UIComponent)
   */
  public Resolver getContainer() {
    return new Resolver(IdFunction.container(component));
  }

  private Resolver find(Object id) {
    if (id == null) {
      throw new FacesException("Tried to find component relative to "
          + component.getId() + " with null ID");
    }
    UIComponent found = IdFunction.find(component, id.toString());
    return new Resolver(found);
  }

  private Resolver peer(Object id) {
    if (id == null) {
      throw new FacesException("Tried to find component relative to "
          + component.getId() + " with null ID");
    }
    UIComponent found = IdFunction.find(component, id.toString());
    if (found == null) {
      throw new FacesException("Cannot find peer of component id='" + id
          + "' relative to id='" + component.getId() + "'");
    }
    return new Resolver(found);
  }

  /**
   * Object for finding components in the same NamingContainer based on their
   * ids. If this component is a {@link NamingContainer}, this method will NOT
   * return one of its children. Only use the get method.
   * 
   * @see IdFunction#find(UIComponent, String)
   * @see #getPeer()
   */
  public Map<String, Resolver> getFind() {
    return this.findMap;
  }

  /**
   * Object for finding peer components in the same {@link NamingContainer}
   * based on their ids. If this component is a {@link NamingContainer}, this
   * method will NOT return one of its children. Only use the get method.
   * 
   * @see IdFunction#peer(UIComponent, String)
   * @see #getFind()
   */
  public Map<String, Resolver> getPeer() {
    return this.peerMap;
  }

  /**
   * Object for finding ancestor components keyed to the ancestor id. Only use
   * the get method.
   */
  public Map<String, Resolver> getAncestor() {
    return this.ancestorMap;
  }

  /**
   * Object for finding component facets keyed to the facet name. Only use the
   * get method.
   */
  public Map<String, Resolver> getFacet() {
    return facetMap;
  }

  private Resolver ancestor(Object id) {
    return new Resolver(IdFunction.ancestor(component, id.toString()));
  }

  private Resolver facet(Object name) {
    return new Resolver(component.getFacet(name.toString()));
  }

  abstract static class ResolverMap extends AbstractMap<String, Resolver> {
    @Override
    public Set<java.util.Map.Entry<String, Resolver>> entrySet() {
      throw new UnsupportedOperationException();
    }
  }

}
