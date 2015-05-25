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

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.CharBuffer;

/**
 * <p>
 * Utility methods for creating data copy operations. The returned values read
 * from or write to the encapsulated stream.
 * </p>
 * 
 * Unless otherwise noted:
 * <ul>
 * <li>The encapsulated object is not modified until the {@code Doctor} is
 * invoked.</li>
 * <li>The {@code Closer} passed to the {@code Doctor} is not used.</li>
 * </ul>
 * 
 * @author McDowell
 * @see Doctorable#doctor(Doctor)
 * @see Operable#operate(Doctor)
 */
public final class Drains {
  private Drains() {}

  /**
   * Utility method for reading all character data from a {@code Readable} and
   * writing it to an {@code Appendable}.
   * 
   * @param <A>
   *          the Appendable subtype
   * @param readable
   *          the data source
   * @param appendable
   *          the output object
   * @return the Appendable passed as an argument
   * @throws IOException
   */
  public static <A extends Appendable> A drain(Readable readable, A appendable)
      throws IOException {
    CharBuffer buffer = CharBuffer.allocate(1024);
    for (int i = readable.read(buffer); i != -1; i = readable.read(buffer)) {
      buffer.flip();
      appendable.append(buffer, 0, i);
    }
    return appendable;
  }

  /**
   * Reads all bytes from an {@code InputStream} and writes them to an
   * {@code OutputStream}.
   * 
   * @param <O>
   *          the OutputStream subclass
   * @param in
   *          the data source
   * @param out
   *          the data target
   * @return the data target passed as an argument
   * @throws IOException
   */
  public static <O extends OutputStream> O drain(InputStream in, O out)
      throws IOException {
    byte[] buffer = new byte[1024];
    for (int i = in.read(buffer); i != -1; i = in.read(buffer)) {
      out.write(buffer, 0, i);
    }
    return out;
  }

  /**
   * {@code Doctor} for draining an {@code InputStream} to an
   * {@code OutputStream}.
   * 
   * @param <O>
   *          the output subclass
   * @param in
   *          the input source
   * @return the operation
   */
  public static <O extends OutputStream> Doctor<O, Die<O>> inDrain(
      final Die<? extends InputStream> in) {
    class InputDrain implements Doctor<O, Die<O>> {
      @Override
      public O op(Die<O> out) throws IOException {
        return drain(in.die(), out.die());
      }
    }

    InternalUtils.notNull(in);
    return new InputDrain();
  }

  /**
   * {@code Doctor} for copying a byte array to an {@code OutputStream}. The
   * encapsulated byte array is not modified. This object is reusable and thread
   * safe so long as the byte array is not modified externally.
   * 
   * @param <O>
   *          the OutputStream subclass
   * @param data
   *          the non-null data to copy
   * @return the operation
   */
  public static <O extends OutputStream> Doctor<O, Die<O>> byteDrain(
      final byte[] data) {
    class ByteArrayDrain implements Doctor<O, Die<O>> {
      @Override
      public O op(Die<O> f) throws IOException {
        return drain(new ByteArrayInputStream(data), f.die());
      }
    }

    InternalUtils.notNull(data);
    return new ByteArrayDrain();
  }

  public static <O extends OutputStream, OO extends Die<O>> Doctor<O, Die<InputStream>> outDrain(
      final OO out) {
    class OutputDrain implements Doctor<O, Die<InputStream>> {
      @Override
      public O op(Die<InputStream> in) throws IOException {
        return drain(in.die(), out.die());
      }
    }

    InternalUtils.notNull(out);
    return new OutputDrain();
  }

  public static <A extends Appendable, Y extends Die<A>> Doctor<A, Die<Readable>> writeDrain(
      final Y out) {
    class ReadableDrain implements Doctor<A, Die<Readable>> {
      @Override
      public A op(Die<Readable> in) throws IOException {
        return drain(in.die(), out.die());
      }
    }

    InternalUtils.notNull(out);
    return new ReadableDrain();
  }

  public static <A extends Appendable> Doctor<A, Die<A>> readDrain(
      final Die<? extends Readable> in) {
    class AppendableDrain implements Doctor<A, Die<A>> {
      @Override
      public A op(Die<A> out) throws IOException {
        return drain(in.die(), out.die());
      }
    }

    InternalUtils.notNull(in);
    return new AppendableDrain();
  }

  /**
   * {@code Doctor} for copying a {@code CharSequence} to an {@code Appendable}
   * (e.g. a {@code Writer}). Reusability and thread safety is dependent on the
   * {@code CharSequence} implementation.
   * 
   * @param <A>
   *          the Appendable type
   * @param data
   *          the data to write
   * @return the operation
   */
  public static <A extends Appendable> Doctor<A, Die<A>> charDrain(
      final CharSequence data) {
    class SequenceAppender implements Doctor<A, Die<A>> {
      @Override
      public A op(Die<A> f) throws IOException {
        A a = f.die();
        a.append(data);
        return a;
      }
    }

    InternalUtils.notNull(data);
    return new SequenceAppender();
  }
}
