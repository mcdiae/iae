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

package demo.faces.cache;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.faces.component.UIComponent;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;

import demo.faces.ClientIdUtils;

/**
 * Thread-safe cache for quickly finding components based on ID. The class is
 * serializable, but only short term persistence is supported.
 * 
 * @author McDowell
 */
@Deprecated
public class ComponentIdCache implements Serializable {

  private static final long serialVersionUID = 1L;

  private final Map<String, Map<String, ComponentResolver[]>> viewCache = new ConcurrentHashMap<String, Map<String, ComponentResolver[]>>();

  /**
   * Returns the clientId of a control based on its id.
   * 
   * @param context
   *          the JSF context
   * @param id
   *          the id of a control in the view
   * @return the clientId of the control, or null if not found
   */
  public String getClientId(FacesContext context, String id) {
    UIViewRoot view = context.getViewRoot();
    String viewId = view.getViewId();
    // get path map for this view
    Map<String, ComponentResolver[]> pathMap = viewCache.get(viewId);
    if (pathMap == null) {
      pathMap = new ConcurrentHashMap<String, ComponentResolver[]>();
      viewCache.put(viewId, pathMap);
    }
    // get the path to the component
    ComponentResolver[] path = pathMap.get(id);
    if (path == null) {
      Finder finder = new Finder();
      findComponent(finder, view, id);
      if (finder.isFound()) {
        pathMap.put(id, finder.getPath());
        UIComponent component = finder.getComponent();
        return component.getClientId(context);
      } else {
        // component with id does not exist
        return null;
      }
    }
    // resolve the component from path
    UIComponent component = resolve(view, path);
    if (component == null) {
      // tree must be dynamic, use full search
      return ClientIdUtils.findClientId(id);
    }
    // check id
    if (id.equals(component.getId())) {
      // path resolved to component
      return component.getClientId(context);
    }
    // tree must be dynamic, use full search
    return ClientIdUtils.findClientId(id);
  }

  private void findComponent(Finder finder, UIComponent component, String id) {
    if (id.equals(component.getId())) {
      finder.setComponent(component);
    }

    List<UIComponent> kids = component.getChildren();
    for (int i = 0; i < kids.size(); i++) {
      UIComponent kid = kids.get(i);
      findComponent(finder, kid, id);
      if (finder.isFound()) {
        finder.insert(new ChildResolver(i));
        return;
      }
    }

    Map<String, UIComponent> facets = component.getFacets();
    for (Map.Entry<String, UIComponent> facet : facets.entrySet()) {
      findComponent(finder, facet.getValue(), id);
      if (finder.isFound()) {
        finder.insert(new FacetResolver(facet.getKey()));
        return;
      }
    }
  }

  private UIComponent resolve(UIComponent component, ComponentResolver[] path) {
    for (ComponentResolver resolver : path) {
      component = resolver.resolve(component);
      if (component == null) {
        return null;
      }
    }
    return component;
  }

  private static class Finder {

    private UIComponent found;
    private List<ComponentResolver> path = new ArrayList<ComponentResolver>();

    public void setComponent(UIComponent component) {
      found = component;
    }

    public UIComponent getComponent() {
      return found;
    }

    public boolean isFound() {
      return found != null;
    }

    public void insert(ComponentResolver resolver) {
      path.add(0, resolver);
    }

    public ComponentResolver[] getPath() {
      ComponentResolver[] arr = new ComponentResolver[path.size()];
      path.toArray(arr);
      return arr;
    }

  }

}
