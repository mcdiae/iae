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
 * Utility for closing a pair of streams.
 * </p>
 * 
 * <p>
 * Before:
 * </p>
 * 
 * <pre>
 * InputStream in = openIn();
 * Closeable resource = in;
 * try {
 *   InputStream buffer = new BufferedInputStream(in);
 *   resource = buffer;
 *   OutputStream out = openOut();
 *   try {
 *     //copy from buffer to out
 *   } finally {
 *     out.close();
 *   }
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
 * CoupledCloser closer = Closers.coupledCloser();
 * try {
 *   InputStream in = closer.in().using(openIn());
 *   InputStream buffer = closer.in().using(new BufferedInputStream(in));
 *   OutputStream out = closer.out().using(openOut());
 *   //copy from buffer to out
 * } finally {
 *   closer.close();
 * }
 * </pre>
 * 
 * 
 * @author McDowell
 * @see Closers
 * @see Closer
 * @see IO
 */
public interface CoupledCloser extends Closeable {

  /** @return the input {@code Closer} */
  public Closer in();

  /** @return the output {@code Closer} */
  public Closer out();
}
