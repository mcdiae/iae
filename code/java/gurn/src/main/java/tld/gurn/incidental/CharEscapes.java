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

import static tld.gurn.incidental.Collectors.listOf;
import static tld.gurn.incidental.Collectors.newSortedMap;

import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;
import java.util.SortedMap;

/**
 * A map of characters to their escape sequences.
 * 
 * @author McDowell
 */
public final class CharEscapes {

  private final char[] keys;
  private final String[] values;

  private CharEscapes(SortedMap<Character, String> map) {
    keys = new char[map.size()];
    values = new String[map.size()];
    List<Entry<Character, String>> entries = listOf(map.entrySet());
    for (int i = 0; i < entries.size(); i++) {
      Entry<Character, String> entry = entries.get(i);
      keys[i] = entry.getKey();
      values[i] = entry.getValue();
    }
  }

  private String get(char ch) {
    int idx = Arrays.binarySearch(keys, ch);
    return (idx < 0) ? null : values[idx];
  }

  public String escape(String str) {
    StringBuilder buffer = null;
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      String escape = get(ch);
      if (escape != null) {
        if (buffer == null) {
          buffer = new StringBuilder();
          buffer.append(str.substring(0, i));
        }
        buffer.append(escape);
      } else if (buffer != null) {
        buffer.append(ch);
      }
    }
    return (buffer == null) ? str : buffer.toString();
  }

  public static EscapeBuilder builder() {
    return new EscapeBuilder();
  }

  public static final class EscapeBuilder {
    private final SortedMap<Character, String> map = newSortedMap();

    private EscapeBuilder() {
    }

    public EscapeBuilder with(char ch, String s) {
      map.put(ch, s);
      return this;
    }

    public CharEscapes build() {
      return new CharEscapes(map);
    }
  }
}
