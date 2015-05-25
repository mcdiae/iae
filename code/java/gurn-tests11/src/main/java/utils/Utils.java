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

package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

public class Utils {

  private static final Set<String> EXCLUDES = new HashSet<String>(
      Arrays.asList("/index.jsp", "/indexfaces.jsp"));

  public List<String> getPages() {
    FacesContext context = FacesContext.getCurrentInstance();
    ExternalContext ext = context.getExternalContext();

    Set<String> result = new TreeSet<String>();

    @SuppressWarnings("unchecked")
    Set<String> paths = ext.getResourcePaths("/");
    List<String> queue = new LinkedList<String>(paths);
    while (!queue.isEmpty()) {
      String path = queue.remove(0);
      if (EXCLUDES.contains(path)) {
        continue;
      } else if (path.endsWith("/")) {
        @SuppressWarnings("unchecked")
        Set<String> dirContents = ext.getResourcePaths(path);
        queue.addAll(dirContents);
      } else if (path.endsWith(".jsp")) {
        result.add(path.substring(1, path.length() - 4) + ".faces");
      }
    }

    return new ArrayList<String>(result);
  }

}
