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

package illegalargument.character;

import java.util.Locale;

public class Case {

  enum Dir {
    UPPERCASE, LOWERCASE;
    public Dir not() {
      return this == UPPERCASE ? LOWERCASE : UPPERCASE;
    }
  }

  private final String up;
  private final String down;
  private final boolean symmetrical;

  public Case(Dir dir, Locale locale, String data) {
    if (dir == Dir.UPPERCASE) {
      up = data.toUpperCase(locale);
      down = up.toLowerCase(locale);
      symmetrical = down.equals(data);
    } else {
      down = data.toLowerCase(locale);
      up = down.toUpperCase(locale);
      symmetrical = up.equals(data);
    }
  }

  public String get(Dir dir) {
    return dir == Dir.UPPERCASE ? up : down;
  }

  public boolean isSymmetrical() {
    return symmetrical;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((down == null) ? 0 : down.hashCode());
    result = prime * result + (symmetrical ? 1231 : 1237);
    result = prime * result + ((up == null) ? 0 : up.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    final Case other = (Case) obj;
    if (down == null) {
      if (other.down != null)
        return false;
    } else if (!down.equals(other.down))
      return false;
    if (symmetrical != other.symmetrical)
      return false;
    if (up == null) {
      if (other.up != null)
        return false;
    } else if (!up.equals(other.up))
      return false;
    return true;
  }

}
