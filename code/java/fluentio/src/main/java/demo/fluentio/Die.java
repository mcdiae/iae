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


/**
 * <p>
 * Implementations of this type provide their own methods for decorating
 * {@code java.io.Closeable} I/O artifacts.
 * </p>
 * <p>
 * The general contract of implementations is that references to the
 * {@code closer.Die} should be considered stale after the consumer called a
 * method on it; that is, once you have called a method on a {@code closer.Die},
 * you should never call another method on it but instead use the value returned
 * by the method call.
 * </p>
 * <p>
 * Implementations should be considered mutable and not thread-safe unless
 * otherwise stated.
 * </p>
 * <p>
 * <i><a href="http://dictionary.reference.com/browse/die">Die</a>: "any of
 * various devices for cutting or forming material in a press or a stamping or
 * forging machine."</i>
 * </p>
 * 
 * @author McDowell
 * 
 * @param <T>
 *          the type that is being built
 */
public interface Die<T> {

  /**
   * @return the encapsulated object
   */
  public T die();

  /**
   * @return the closer used by this instance
   */
  public Closer getCloser();
}
