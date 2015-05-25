/*
Copyright (c) 2012 McDowell

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
package blog.iae.json.utf;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableSet;

import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Type defining the intersection of Java and JSON encodings.
 * <P>
 * WARNING: Sun <A href=
 * "http://docs.oracle.com/javase/1.5.0/docs/guide/intl/encoding.doc.html">Java
 * 5 does not support UTF-32</A>.
 * <P>
 * Note: Java implementations are only <A href=
 * "http://docs.oracle.com/javase/1.5.0/docs/api/java/nio/charset/Charset.html"
 * >required</A> to support six encodings; of those, the encodings supported by
 * JSON are: UTF-8; UTF-16BE; UTF-16LE.
 */
public final class JsonCharsets {
  private JsonCharsets() {
  }

  /**
   * UTF-8
   */
  public static final Charset UTF_8 = Charset.forName("UTF-8");

  /**
   * UTF-16BE (big endian)
   */
  public static final Charset UTF_16BE = Charset.forName("UTF-16BE");

  /**
   * UTF-16LE (little endian)
   */
  public static final Charset UTF_16LE = Charset.forName("UTF-16LE");

  private static final Set<Charset> REQ_ENCODINGS = unmodifiableSet(set(asList(
      UTF_8, UTF_16BE, UTF_16LE)));

  private static final Set<Charset> ENCODINGS = encodings();

  private static Set<Charset> encodings() {
    Set<Charset> encs = set(requiredJsonEncodings());
    try {
      encs.add(UTF_32LE());
    } catch (UnsupportedCharsetException e) {
      // failsafe
    }
    try {
      encs.add(UTF_32BE());
    } catch (UnsupportedCharsetException e) {
      // failsafe
    }
    return unmodifiableSet(encs);
  }

  /**
   * The encodings supported by both JSON and the Java runtime.
   * 
   * @return UTF-8; UTF-16BE; UTF-16LE; plus UTF-32LE and UTF-32BE if they are
   *         supported by the runtime
   */
  public static Set<Charset> supportedJsonEncodings() {
    return ENCODINGS;
  }

  /**
   * The encodings supported by JSON that are required encodings on the Java
   * platform (Java 5 to Java 7.)
   * 
   * @return UTF-8; UTF-16BE; UTF-16LE
   */
  public static Set<Charset> requiredJsonEncodings() {
    return REQ_ENCODINGS;
  }

  /**
   * WARNING: known to throw {@link UnsupportedCharsetException} on Sun Java 5.
   * 
   * @return UTF-32LE (little endian)
   * @throws UnsupportedCharsetException
   */
  public static Charset UTF_32LE() {
    return Charset.forName("UTF-32LE");
  }

  /**
   * WARNING: known to throw {@link UnsupportedCharsetException} on Sun Java 5.
   * 
   * @return UTF-32BE (big endian)
   * @throws UnsupportedCharsetException
   */
  public static Charset UTF_32BE() {
    return Charset.forName("UTF-32BE");
  }

  private static <T> Set<T> set(Collection<T> coll) {
    return (coll == null) ? new HashSet<T>() : new HashSet<T>(coll);
  }
}
