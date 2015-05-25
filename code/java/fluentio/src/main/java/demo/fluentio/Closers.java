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
import java.io.IOException;


/**
 * Factory class for creating {@code closer.Closer}s.
 * 
 * @author McDowell
 */
public final class Closers {

  /**
   * <p>
   * Immutable {@code UncheckedCloser} that does not keep a reference to
   * arguments passed to {@code UncheckedCloser#using(Closeable)} and does
   * nothing on {@code Closeable#close()}. Useful where a {@code Closeable} is
   * required without the functionality (e.g. with an in-memory buffer).
   * </p>
   * <p>
   * Note that care should taken in many stream decoration scenarios. For
   * example, when decorating a {@code java.io.ByteArrayOutputStream} with a
   * {@code java.io.BufferedOutputStream} - failure to close the stream may
   * result in buffered bytes not being flushed to the decorated stream.
   * </p>
   */
  public static final UncheckedCloser SHUT = new UncheckedCloser() {
    @Override
    public void close() {}

    @Override
    public <T extends Closeable> T using(T t) {
      return t;
    }
  };

  private Closers() {}

  /**
   * Instantiates a {@code Closer}.
   * 
   * @return the closer
   */
  public static Closer closer() {
    class CloserCheckedImpl implements Closer {
      private Closeable closeable;

      @Override
      public <T extends Closeable> T using(T t) {
        closeable = t;
        return t;
      }

      @Override
      public void close() throws IOException {
        if (closeable != null) {
          closeable.close();
        }
      }
    }

    return new CloserCheckedImpl();
  }

  /**
   * Instantiates an {@code UncheckedCloser} - sometimes useful for
   * interface-based callbacks (pseudo-lambdas), etc. in methods that don't
   * declare {@code java.io.IOException}, or when working with in-memory
   * buffers where close is required, but no {@code IOException} will ever
   * result.
   * 
   * @return an unchecked closer
   */
  public static UncheckedCloser uncheckedCloser() {
    return uncheckedCloser(closer());
  }

  /**
   * Decorates the argument with an unchecked version.
   * 
   * @param closer
   *          the closer to decorate
   * @return a version that throws a runtime exception
   */
  public static UncheckedCloser uncheckedCloser(final Closer closer) {
    class UncheckedCloserImpl implements UncheckedCloser {
      @Override
      public <T extends Closeable> T using(T t) {
        return closer.using(t);
      }

      @Override
      public void close() throws RuntimeIOException {
        try {
          closer.close();
        } catch (IOException e) {
          throw new RuntimeIOException(e);
        }
      }
    }

    notNull(closer);
    return new UncheckedCloserImpl();
  }

  /**
   * A {@code Closer} for a pair of streams - useful when writing from one
   * stream to another.
   * 
   * @return a coupled closer
   */
  public static CoupledCloser coupledCloser() {
    return coupledCloser(closer(), closer());
  }

  /**
   * Creates a {@code CoupledCloser} with the given arguments.
   * 
   * @param in
   *          returned by {@code CoupledCloser#in()}
   * @param out
   *          returned by {@code CoupledCloser#out()}
   * @return the new closer
   */
  public static CoupledCloser coupledCloser(final Closer in, final Closer out) {
    class CoupledCloserImpl implements CoupledCloser {
      public Closer in() {
        return in;
      }

      public Closer out() {
        return out;
      }

      @Override
      public void close() throws IOException {
        try {
          in.close();
        } finally {
          out.close();
        }
      }
    }

    notNull(in);
    notNull(out);
    return new CoupledCloserImpl();
  }

  /**
   * Instantiates an unchecked coupled {@code Closer}.
   * 
   * @return an unchecked closer
   * @see #uncheckedCloser()
   * @see #coupledCloser()
   */
  public static UncheckedCoupledCloser uncheckedCoupledCloser() {
    return uncheckedCoupledCloser(coupledCloser(uncheckedCloser(),
        uncheckedCloser()));
  }

  /**
   * Decorates the argument with an unchecked type.
   * 
   * @param coupledCloser
   *          the object to decorate
   * @return a version that throws a runtime exception
   */
  public static UncheckedCoupledCloser uncheckedCoupledCloser(
      final CoupledCloser coupledCloser) {
    class UncheckedCoupledCloserImpl implements UncheckedCoupledCloser {
      @Override
      public Closer in() {
        return coupledCloser.in();
      }

      @Override
      public Closer out() {
        return coupledCloser.out();
      }

      @Override
      public void close() throws RuntimeIOException {
        try {
          coupledCloser.close();
        } catch (IOException e) {
          throw new RuntimeIOException(e);
        }
      }
    }

    notNull(coupledCloser);
    return new UncheckedCoupledCloserImpl();
  }

  private static final <T> T notNull(T t) {
    if (t == null) {
      throw new IllegalArgumentException("null");
    }
    return t;
  }
}
