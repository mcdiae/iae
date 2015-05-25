/*
Copyright (c) 2010 McDowell

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

package demo.fluentio;

import java.io.Closeable;


/**
 * <p>
 * Utility for closing streams.
 * </p>
 * <p>
 * Java streams make use of the <a
 * href="http://en.wikipedia.org/wiki/Decorator_pattern">decorator pattern</a>.
 * When closing the stream stack, only the outermost decorator needs to be
 * closed.
 * </p>
 * <p>
 * Implementations of this class can be used to reduce the number of lines for
 * tracking the required {@link Closeable}, but is most effective when used
 * with the {@link IO} class.
 * </p>
 * <p>
 * Before:
 * </p>
 * 
 * <pre>
 * InputStream in = new FileInputStream(&quot;foo.txt&quot;);
 * Closeable resource = in;
 * try {
 *   Reader reader = new InputStreamReader(in, charset);
 *   resource = reader;
 *   BufferedInputStream lineReader = new BufferedInputStream(reader);
 *   resource = lineReader;
 *   // read lines
 * } finally {
 *   resource.close();
 * }
 * </pre>
 * 
 * <p>
 * After:
 * </p>
 * 
 * <pre>
 * Closer closer = Closers.closer();
 * try {
 *   InputStream in = closer.using(new FileInputStream(&quot;foo.txt&quot;));
 *   Reader reader = closer.using(new InputStreamReader(in, charset));
 *   BufferedInputStream lineReader = closer
 *       .using(new BufferedInputStream(reader));
 *   // read lines
 * } finally {
 *   closer.close();
 * }
 * </pre>
 * 
 * <p>
 * Unless otherwise noted, implementations are mutable and not thread safe.
 * </p>
 * 
 * @author McDowell
 * @see CoupledCloser
 * @see Closers
 * @see IO
 */
public interface Closer extends Closeable {

  /**
   * Holds a reference to the most recent argument in order to close it when
   * {@code Closeable#close()} is called.
   * 
   * @param <T>
   *          the type to be closed
   * @param t
   *          the object to be closed
   * @return the argument t
   */
  public <T extends Closeable> T using(T t);
}
