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

package hurl.test.util;

import java.util.Iterator;

public class AllCodepointsIterator {
  // see http://unicode.org/glossary/
  private static final int MAX = 0x10FFFF;

  private static final int SURROGATE_FIRST = 0xD800;
  private static final int SURROGATE_LAST = 0xDFFF;

  private int codepoint = 0;

  public boolean hasNext() {
    return codepoint < MAX;
  }

  public int next() {
    int ret = codepoint;
    codepoint = next(codepoint);
    return ret;
  }

  private int next(int codepoint) {
    while (codepoint < MAX) {
      codepoint++;
      // skip surrogates (half characters)
      if (codepoint == SURROGATE_FIRST) {
        codepoint = SURROGATE_LAST + 1;
      }
      // skip undefined chars
      if (!Character.isDefined(codepoint)) {
        continue;
      }
      return codepoint;
    }
    return MAX;
  }

  public static final Iterable<Integer> ITERABLE = new Iterable<Integer>() {
    public Iterator<Integer> iterator() {
      final AllCodepointsIterator nested = new AllCodepointsIterator();
      return new Iterator<Integer>() {
        public boolean hasNext() {
          return nested.hasNext();
        }

        public Integer next() {
          return nested.next();
        }

        public void remove() {
          throw new UnsupportedOperationException();
        }
      };
    }
  };

  public static final Iterable<String> ALLCHARS = new Iterable<String>() {
    public Iterator<String> iterator() {
      final AllCodepointsIterator nested = new AllCodepointsIterator();
      return new Iterator<String>() {
        public boolean hasNext() {
          return nested.hasNext();
        }

        public String next() {
          return new String(Character.toChars(nested.next()));
        }

        public void remove() {
          throw new UnsupportedOperationException();
        }
      };
    }
  };
}
