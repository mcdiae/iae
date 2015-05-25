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

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * Class file representing a Java version.
 * 
 * @author McDowell
 * @see #forClassVersion(ClassVersion)
 */
public final class JavaVersion implements Comparable {

  private final String description;
  private final ClassVersion max;

  private static final List KNOWN_VERSIONS = loadKnownVersions();

  /**
   * 
   * @param description
   *          a text description of the Java version
   * @param max
   *          the maximum class version produced by compilers for this Java
   *          version
   */
  private JavaVersion(String description, ClassVersion max) {
    if (description == null || max == null) {
      throw new IllegalArgumentException("null");
    }
    this.description = description;
    this.max = max;
  }

  public String getDescription() {
    return description;
  }

  public ClassVersion getMaxVersion() {
    return max;
  }

  /**
   * Tests whether the given class version is supported by the Java version
   * represented by this instance.
   * 
   * @param classVersion
   *          the value to test
   * @return true if the provided class version is less than or equal to the
   *         maximum class version for this Java version
   */
  public boolean isSupported(ClassVersion classVersion) {
    return max.compareTo(classVersion) >= 0;
  }

  public String toString() {
    return description;
  }

  private static List loadKnownVersions() {
    List list = new ArrayList(10);

    try {
      String resource = "illegalargument/classversion/versionmap.xml";
      DocumentBuilderFactory factory = DocumentBuilderFactory
          .newInstance();
      DocumentBuilder docBuilder = factory
          .newDocumentBuilder();
      InputStream in = JavaVersion.class.getClassLoader()
          .getResourceAsStream(resource);
      if (in == null) {
        throw new IllegalStateException(
            "Cannot load resource " + resource);
      }
      try {
        Document doc = docBuilder.parse(in);
        NodeList versions = doc.getDocumentElement()
            .getChildNodes();
        for (int i = 0; i < versions.getLength(); i++) {
          Node node = versions.item(i);
          if (node instanceof Element) {
            Element ver = (Element) node;
            String description = ver
                .getAttribute("description");
            int major = Integer.parseInt(ver
                .getAttribute("major"));
            int minor = Integer.parseInt(ver
                .getAttribute("minor"));
            ClassVersion classVersion = new ClassVersion(
                major, minor);
            JavaVersion javaVersion = new JavaVersion(
                description, classVersion);
            list.add(javaVersion);
          }
        }
      } finally {
        in.close();
      }
    } catch (ParserConfigurationException e) {
      throw new IllegalStateException(e
          .getLocalizedMessage());
    } catch (SAXException e) {
      throw new IllegalStateException(e
          .getLocalizedMessage());
    } catch (IOException e) {
      throw new IllegalStateException(e
          .getLocalizedMessage());
    }

    return Collections.unmodifiableList(list);
  }

  /**
   * Returns the array of Java versions known to the API.
   * 
   * @return known Java versions (defensive copy)
   */
  public static JavaVersion[] getKnownJavaVersions() {
    JavaVersion[] versions = new JavaVersion[KNOWN_VERSIONS
        .size()];
    KNOWN_VERSIONS.toArray(versions);
    return versions;
  }

  /**
   * Attempts to match a class version to a Java version. If the class version
   * is less than 45.0, an IllegalArgumentException is thrown. If the class
   * version is higher than the predefined values known by the API, a new
   * JavaVersion instance is returned with a description containing the class
   * version.
   * 
   * @param classVersion
   *          the class version to match
   * @return the lowest matching Java version
   */
  public static JavaVersion forClassVersion(
      ClassVersion classVersion) {
    if (classVersion.compareTo(ClassVersion.MINIMUM) < 0) {
      throw new IllegalArgumentException();
    }
    Iterator versions = KNOWN_VERSIONS.iterator();
    while (versions.hasNext()) {
      JavaVersion ver = (JavaVersion) versions.next();
      if (ver.isSupported(classVersion)) {
        return ver;
      }
    }
    return new JavaVersion(
        "UNKNOWN JAVA VERSION (class version"
            + classVersion + ")", classVersion);
  }

  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime
        * result
        + ((description == null) ? 0 : description
            .hashCode());
    result = prime * result
        + ((max == null) ? 0 : max.hashCode());
    return result;
  }

  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    final JavaVersion other = (JavaVersion) obj;
    if (description == null) {
      if (other.description != null)
        return false;
    } else if (!description.equals(other.description))
      return false;
    if (max == null) {
      if (other.max != null)
        return false;
    } else if (!max.equals(other.max))
      return false;
    return true;
  }

  public int compareTo(Object o) {
    JavaVersion other = (JavaVersion) o;
    int n = max.compareTo(other.max);
    if (n == 0) {
      return description.compareTo(other.description);
    }
    return n;
  }

}
