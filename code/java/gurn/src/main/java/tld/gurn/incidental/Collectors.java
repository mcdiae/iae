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

package tld.gurn.incidental;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public final class Collectors {
  private Collectors() {
  }

  public static <K, V> Map<K, V> newMap() {
    return new HashMap<K, V>();
  }

  public static <K, V> SortedMap<K, V> newSortedMap() {
    return new TreeMap<K, V>();
  }

  /**
   * Creates an unmodifiable set of items.
   * 
   * @param <T>
   * @param items
   * @return
   */
  public static <T> Set<T> setOf(T... items) {
    Set<T> set = new HashSet<T>(Arrays.asList(items));
    return Collections.unmodifiableSet(set);
  }

  public static <T> List<T> listOf(Collection<T> collection) {
    List<T> list = new ArrayList<T>(collection);
    return Collections.unmodifiableList(list);
  }
}
