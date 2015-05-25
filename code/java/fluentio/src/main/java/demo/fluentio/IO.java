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
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;


/**
 * <a href="http://en.wikipedia.org/wiki/Fluent_interface">Fluent</a> API for
 * performing I/O operations.
 * 
 * @author McDowell
 * @see Closers
 */
public final class IO {
  private IO() {}

  /**
   * Wraps an {@code OutputStream} in an {@code OutputStreamBuilder}.
   * 
   * @param <T>
   *          the {@code OutputStream} subclass
   * @param closer
   *          the {@code Closer} that will close this stream
   * @param out
   *          the {@code OutputStream}
   * @return an {@code OutputStreamBuilder}
   */
  public static <T extends OutputStream> OutputDie<T> out(Closer closer, T out) {
    return new OutputDie<T>(closer, out);
  }

  /**
   * Wraps a {@code Writer} in a {@code WriterBuilder}.
   * 
   * @param <T>
   *          the {@code Writer} subclass
   * @param closer
   *          the {@code Closer} that will close this stream
   * @param out
   *          the {@code Writer}
   * @return a {@code WriterBuilder}
   */
  public static <T extends Writer> WriterDie<T> writing(Closer closer, T out) {
    return new WriterDie<T>(closer, out);
  }

  /**
   * Wraps an {@code InputStream} in an {@code InputStreamBuilder}.
   * 
   * @param <T>
   *          the {@code InputStream} subclass
   * @param closer
   *          the {@code Closer} that will close this stream
   * @param in
   *          the {@code InputStream}
   * @return an {@code InputStreamBuilder}
   */
  public static <T extends InputStream> InputDie<T> in(Closer closer, T in) {
    return new InputDie<T>(closer, in);
  }

  /**
   * Wraps a {@code Reader} in a {@code ReaderBuilder}.
   * 
   * @param <T>
   *          the {@code Reader} subclass
   * @param closer
   *          the {@code Closer} that will close this stream
   * @param in
   *          the {@code Reader}
   * @return a {@code ReaderBuilder}
   */
  public static <T extends Reader> ReaderDie<T> reading(Closer closer, T in) {
    return new ReaderDie<T>(closer, in);
  }

  /**
   * Opens a file for output.
   * 
   * @param closer
   *          the {@code Closer} that will close this stream
   * @param file
   *          the file
   * @param append
   *          if true, will append data
   * @return the builder for this stream
   * @throws IOException
   */
  public static OutputDie<FileOutputStream> open(Closer closer, File file,
      boolean append) throws IOException {
    return out(closer, new FileOutputStream(file, append));
  }

  /**
   * Opens a file for output.
   * 
   * @param closer
   *          the {@code Closer} that will close this stream
   * @param file
   *          the file
   * @return the builder for this stream
   * @throws IOException
   */
  public static OutputDie<FileOutputStream> open(Closer closer, File file)
      throws IOException {
    return open(closer, file, false);
  }

  /**
   * Opens a file for input.
   * 
   * @param closer
   *          the {@code Closer} that will close this stream
   * @param file
   *          the file
   * @return the builder for this stream
   * @throws IOException
   */
  public static InputDie<FileInputStream> access(Closer closer, File file)
      throws IOException {
    return in(closer, new FileInputStream(file));
  }

  public static InputDie<ByteArrayInputStream> bytes(Closer closer, byte[] data) {
    return in(closer, new ByteArrayInputStream(data));
  }
}
