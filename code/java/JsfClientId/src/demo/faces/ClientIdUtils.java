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

package demo.faces;

import java.util.Iterator;
import java.util.Map;

import javax.faces.component.UIComponent;
import javax.faces.component.UIViewRoot;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import demo.faces.cache.ComponentIdCache;

/**
 * Utility methods for working with clientIds. Requires JEE5/JSF1.2 or above.
 * <P>
 * <B>WARNING: the methods assume component identifiers are unique to the view.
 * Component identifiers need only be unique to their
 * {@link javax.faces.component.NamingContainer}.</B>
 * <P>
 * The methods will continue to work so long as the component's ID is unique to
 * the view. For single JSPs with no includes, this is manageable. With heavy
 * use of Facelet templates, accidental collisions become more likely. This
 * class has been deprecated; use with care.
 * 
 * @author McDowell
 * @deprecated use {@link demo.faces.function.IdFunction} instead
 */
@Deprecated
public class ClientIdUtils {

  /**
   * This method takes the id of a component and returns its clientId.
   * 
   * If the component cannot be found, an IllegalStateException is thrown. This
   * method may only be called during a JSF request.
   * 
   * @param id
   *          the id of a JSF component
   * @return the component's clientId
   * @see javax.faces.component.UIComponent#getClientId(javax.faces.context.FacesContext)
   * @see javax.faces.component.UIComponent#getId()
   * @deprecated possible id collisions when walking component tree
   */
  @Deprecated
  public static String findClientId(String id) {
    FacesContext context = FacesContext.getCurrentInstance();
    UIViewRoot view = context.getViewRoot();
    if (view == null) {
      throw new IllegalStateException("view == null");
    }
    UIComponent component = findComponent(view, id);
    if (component == null) {
      throw new IllegalStateException("no component has id='" + id + "'");
    }
    return component.getClientId(context);
  }

  private static UIComponent findComponent(UIComponent component, String id) {
    if (id.equals(component.getId())) {
      return component;
    }

    Iterator<UIComponent> kids = component.getFacetsAndChildren();
    while (kids.hasNext()) {
      UIComponent kid = kids.next();
      UIComponent found = findComponent(kid, id);
      if (found != null) {
        return found;
      }
    }

    return null;
  }

  private static final String CACHE_KEY = ComponentIdCache.class.getName();

  /**
   * This method caches information in the application map to speed up retrieval
   * of clientIds.
   * 
   * For small component graphs, or graphs where the target component can be
   * found near the top of the page, the cost of caching outweighs the cost of
   * traversing the tree. This method should only be used after profiling has
   * determined that findClientId(String) is a bottleneck.
   * 
   * This method performs poorly with UI trees whose structures change.
   * 
   * Implementation note:
   * 
   * Information for retrieving clientIds quickly is persisted for the lifetime
   * of the application. This is a potential source of memory leaks.
   * 
   * @see #findClientId(String)
   * @deprecated possible id collisions when walking component tree
   */
  @Deprecated
  public static String findCachedClientId(String id) {
    FacesContext context = FacesContext.getCurrentInstance();
    ExternalContext extContext = context.getExternalContext();
    Map<String, Object> applicationMap = extContext.getApplicationMap();
    ComponentIdCache cache = (ComponentIdCache) applicationMap.get(CACHE_KEY);
    if (cache == null) {
      cache = new demo.faces.cache.ComponentIdCache();
      applicationMap.put(CACHE_KEY, cache);
    }
    String clientId = cache.getClientId(context, id);
    if (clientId == null) {
      throw new IllegalStateException("no component has id='" + id + "'");
    }
    return clientId;
  }

}
