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

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;
import java.io.PushbackReader;
import java.io.Reader;
import java.io.Writer;

/**
 * A set of static methods for creating stream buffers of a given size. The
 * {@code Doctor} instances returned by these methods are immutable and thread
 * safe.
 * 
 * @author McDowell
 * @see Doctorable#doctor(Doctor)
 * @see Operable#operate(Doctor)
 */
public final class Buffers {
  private Buffers() {}

  /**
   * For creating input buffers.
   * 
   * @param size
   *          the buffer size
   * @return a factory for creating input buffers
   */
  public static Doctor<InputDie<BufferedInputStream>, Die<InputStream>> inBuffer(
      final int size) {
    class InBufferDoctor implements
        Doctor<InputDie<BufferedInputStream>, Die<InputStream>> {
      @Override
      public InputDie<BufferedInputStream> op(Die<InputStream> f)
          throws IOException {
        return IO.in(f.getCloser(), new BufferedInputStream(f.die(), size));
      }
    }

    InternalUtils.greaterThanZero(size);
    return new InBufferDoctor();
  }

  public static Doctor<OutputDie<BufferedOutputStream>, Die<OutputStream>> outBuffer(
      final int size) {
    class OutBufferDoctor implements
        Doctor<OutputDie<BufferedOutputStream>, Die<OutputStream>> {
      @Override
      public OutputDie<BufferedOutputStream> op(Die<OutputStream> f)
          throws IOException {
        return IO.out(f.getCloser(), new BufferedOutputStream(f.die(), size));
      }
    }

    InternalUtils.greaterThanZero(size);
    return new OutBufferDoctor();
  }

  public static Doctor<ReaderDie<BufferedReader>, Die<Reader>> readBuffer(
      final int size) {
    class ReadBufferDoctor implements
        Doctor<ReaderDie<BufferedReader>, Die<Reader>> {
      @Override
      public ReaderDie<BufferedReader> op(Die<Reader> f) throws IOException {
        return IO.reading(f.getCloser(), new BufferedReader(f.die(), size));
      }
    }

    InternalUtils.greaterThanZero(size);
    return new ReadBufferDoctor();
  }

  public static Doctor<WriterDie<BufferedWriter>, Die<Writer>> writeBuffer(
      final int size) {
    class WriteBufferDoctor implements
        Doctor<WriterDie<BufferedWriter>, Die<Writer>> {
      @Override
      public WriterDie<BufferedWriter> op(Die<Writer> f) throws IOException {
        return IO.writing(f.getCloser(), new BufferedWriter(f.die(), size));
      }
    }

    InternalUtils.greaterThanZero(size);
    return new WriteBufferDoctor();
  }

  public static <R extends Reader, RR extends Die<R>> Doctor<ReaderDie<PushbackReader>, RR> charPushback(
      final int size) {
    class CharPushbackDoctor implements Doctor<ReaderDie<PushbackReader>, RR> {
      @Override
      public ReaderDie<PushbackReader> op(RR f) throws IOException {
        return IO.reading(f.getCloser(), new PushbackReader(f.die(), size));
      }
    }

    InternalUtils.greaterThanZero(size);
    return new CharPushbackDoctor();
  }

  public static <I extends InputStream, II extends Die<I>> Doctor<InputDie<PushbackInputStream>, II> pushback(
      final int size) {
    class PushbackDoctor implements Doctor<InputDie<PushbackInputStream>, II> {
      @Override
      public InputDie<PushbackInputStream> op(II f) throws IOException {
        return IO.in(f.getCloser(), new PushbackInputStream(f.die(), size));
      }
    }

    InternalUtils.greaterThanZero(size);
    return new PushbackDoctor();
  }
}
