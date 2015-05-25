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

package beans.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SelectBean {

  private String[] selected;

  private List<String> options = Arrays.asList("red", "blue", "yellow");

  private Map<String, Boolean> selectedMap;

  public String[] getSelected() {
    return selected;
  }

  public void setSelected(String[] selected) {
    selectedMap = null;
    this.selected = selected;
    System.out.println("Selected: " + getSelectedList());
  }

  public List<String> getOptions() {
    return options;
  }

  public Map<String, Boolean> getSelectedMap() {
    if (selectedMap != null) {
      return selectedMap;
    }
    selectedMap = new HashMap<String, Boolean>();
    for (String value : options) {
      Boolean b = (selected != null) && getSelectedList().contains(value);
      selectedMap.put(value, b);
    }
    return selectedMap;
  }

  public List<String> getSelectedList() {
    List<String> list;
    if (selected == null) {
      list = Collections.emptyList();
    } else {
      list = Arrays.asList(selected);
    }
    return list;
  }
}
