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

import static blog.iae.json.utf.JsonCharsets.UTF_16BE;
import static blog.iae.json.utf.JsonCharsets.UTF_16LE;
import static blog.iae.json.utf.JsonCharsets.UTF_32BE;
import static blog.iae.json.utf.JsonCharsets.UTF_32LE;
import static blog.iae.json.utf.JsonCharsets.UTF_8;
import static java.nio.charset.CodingErrorAction.REPORT;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.UnsupportedCharsetException;

/**
 * Methods for detecting JSON document encodings.
 * <P>
 * To open a stream to write JSON, use:
 * 
 * <pre>
 * OutputStream out = new FileOutputStream(file);
 * Closeable res = out;
 * try {
 *   Writer writer = JsonIo.newJsonWriter(out);
 *   res = writer;
 *   // write JSON
 * } finally {
 *   res.close();
 * }
 * </pre>
 * 
 * To open a stream to read JSON, use:
 * 
 * <pre>
 * InputStream in = new FileInputStream(file);
 * Closeable res = in;
 * try {
 *   Reader reader = JsonIo.newJsonReader(in);
 *   res = reader;
 *   // read JSON
 * } finally {
 *   res.close();
 * }
 * </pre>
 * 
 * This type does a best-guess detection of the encoding of a JSON data source
 * by inspecting the first four bytes as described in <A
 * href="http://tools.ietf.org/html/rfc4627#section-3">RFC 4627</A>.
 * <P>
 * Note: byte-order-marks are not supported; UTF-32 is not a standard Java
 * encoding and may no be supported by the runtime.
 * <P>
 * Streams are intollerant of malformed Unicode data by default.
 * 
 * @see JsonCharsets
 */
public final class JsonUtf {
  private JsonUtf() {
  }

  /**
   * Detects the JSON encoding and decorates the input with the appropriate
   * {@link Reader}.
   * 
   * @param in
   *          a JSON source
   * @param errorHandling
   *          how to handle malformed character data
   * @return the character decoder
   * @throws IOException
   *           on error
   * @throws UnsupportedCharsetException
   *           UTF-32 is unsupported on Sun Java 5
   */
  public static Reader newJsonReader(InputStream in,
      CodingErrorAction errorHandling) throws IOException,
      UnsupportedCharsetException {
    in = in.markSupported() ? in : new BufferedInputStream(in);
    CharsetDecoder decoder = detectJsonEncoding(in).newDecoder()
        .onMalformedInput(errorHandling)
        .onUnmappableCharacter(errorHandling);
    return new InputStreamReader(in, decoder);
  }

  /**
   * As {@link #newJsonReader(InputStream, CodingErrorAction)} with a default of
   * {@link CodingErrorAction#REPORT}.
   */
  public static Reader newJsonReader(InputStream in) throws IOException,
      UnsupportedCharsetException {
    return newJsonReader(in, REPORT);
  }

  /**
   * 
   * The stream must return true when {@link InputStream#markSupported()} is
   * called.
   * 
   * @param in
   *          a stream that supports mark
   * @return the detected encoding
   * @throws IOException
   *           on error
   * @throws UnsupportedCharsetException
   *           UTF-32 is unsupported on Sun Java 5
   */
  public static Charset detectJsonEncoding(InputStream in) throws IOException,
      UnsupportedCharsetException {
    if (!in.markSupported()) {
      throw new IllegalArgumentException(
          "InputStream.markSupported returned false");
    }
    in.mark(4);
    int mask = 0;
    for (int count = 0; count < 4; count++) {
      int r = in.read();
      if (r == -1) {
        break;
      }
      mask = mask << 1;
      mask |= (r == 0) ? 0 : 1;
    }
    in.reset();
    return match(mask);
  }

  private static Charset match(int mask) {
    switch (mask) {
    case 1:
      return UTF_32BE();
    case 5:
      return UTF_16BE;
    case 8:
      return UTF_32LE();
    case 10:
      return UTF_16LE;
    default:
      return UTF_8;
    }
  }

  /**
   * Creates a UTF-8 JSON writer.
   * 
   * @param out
   *          the JSON target
   * @param errorHandling
   *          the action on malformed data
   * @return the encoder
   * @throws IOException
   *           on IO error
   */
  public static Writer newJsonWriter(OutputStream out,
      CodingErrorAction errorHandling) throws IOException {
    CharsetEncoder encoder = UTF_8.newEncoder()
        .onMalformedInput(errorHandling)
        .onUnmappableCharacter(errorHandling);
    return new OutputStreamWriter(out, encoder);
  }

  /**
   * As {@link #newCompactJsonWriter(OutputStream, int, CodingErrorAction)} with
   * {@link CodingErrorAction#REPORT}.
   */
  public static Writer newJsonWriter(OutputStream out) throws IOException {
    CharsetEncoder encoder = UTF_8.newEncoder().onMalformedInput(REPORT);
    return new OutputStreamWriter(out, encoder);
  }

  private static final int DEFAULT_BUFFER_SIZE = 1024;

  /**
   * As {@link #newCompactJsonWriter(OutputStream, int, CodingErrorAction)} with
   * {@link CodingErrorAction#REPORT} and a default buffer size.
   */
  public static Writer newCompactJsonWriter(OutputStream out) {
    return newCompactJsonWriter(out, DEFAULT_BUFFER_SIZE, REPORT);
  }

  /**
   * As {@link #newCompactJsonWriter(OutputStream, int, CodingErrorAction)} with
   * {@link CodingErrorAction#REPORT}.
   */
  public static Writer newCompactJsonWriter(OutputStream out, int bufferSize) {
    return newCompactJsonWriter(out, bufferSize, REPORT);
  }

  /**
   * A writer that chooses between UTF-8 and UTF-16 by buffering a certain
   * amount of output and measuring how compact it will be when encoded using
   * either of those encodings.
   * <P>
   * Note: this method is only useful for certain ranges of Unicode data (e.g. a
   * high proportion of Japanese natural language data.) Clients that assume
   * JSON is UTF-8 may fail when faced with the results. The compression may be
   * redundant when combined with over-the-wire compression methods (e.g. GZIP.)
   * <P>
   * If in doubt, use {@link #newJsonWriter(OutputStream)} instead.
   * <P>
   * Calling {@link Writer#flush()} will cause the measuring phase to finish and
   * an encoding to be chosen if this has not happened already.
   * 
   * @param out
   *          the data target
   * @param bufferSize
   *          the maximum size of the in-memory buffer
   * @param errorHandling
   *          how to react to malformed data
   * @return the encoder
   */
  public static Writer newCompactJsonWriter(OutputStream out, int bufferSize,
      CodingErrorAction errorHandling) {
    return new JsonWriter(out, bufferSize, errorHandling);
  }
}
