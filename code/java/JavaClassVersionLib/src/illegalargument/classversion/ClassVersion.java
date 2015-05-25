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

package illegalargument.classversion;

/**
 * Class representing the class version of a Java binary (see <a
 * href="http://java.sun.com/docs/books/jvms/second_edition/html/ClassFile.doc.html#74353">ClassFile
 * Structure</a>).
 * 
 * @author McDowell
 * @see ClassScanner
 */
public final class ClassVersion implements Comparable {

  /** The minimum valid class version, 45.0 */
  public static final ClassVersion MINIMUM = new ClassVersion(
      45, 0);

  private final int major;
  private final int minor;

  public ClassVersion(int major, int minor) {
    this.major = major;
    this.minor = minor;
  }

  /**
   * Major class format version (e.g. 45 for Java 1.0.2)
   * 
   * @return the major version of the class format
   */
  public int getMajor() {
    return major;
  }

  /**
   * Minor class format version (e.g. 3 for Java 1.0.2)
   * 
   * @return the minor version of the class format
   */
  public int getMinor() {
    return minor;
  }

  public String toString() {
    return major + "." + minor;
  }

  public int compareTo(Object o) {
    ClassVersion that = (ClassVersion) o;
    if (major > that.major) {
      return 1;
    } else if (major < that.major) {
      return -1;
    } else if (minor > that.minor) {
      return 1;
    } else if (minor < that.minor) {
      return -1;
    }
    return 0;
  }

  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + major;
    result = prime * result + minor;
    return result;
  }

  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    final ClassVersion other = (ClassVersion) obj;
    if (major != other.major)
      return false;
    if (minor != other.minor)
      return false;
    return true;
  }

}
