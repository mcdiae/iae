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

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;


public final class Streams {
  private Streams() {}

  /**
   * If an {@link IOException} is thrown, it is wrapped in a
   * {@link RuntimeIOException}. This may be useful for adding error handling
   * to types like {@link java.io.PrintWriter}.
   * 
   * @param writer
   *          the output target to be decorated
   * @return the decorated type
   * @see RuntimeIOException
   */
  public static Writer uncheckedWriter(final Writer writer) {
    class UncheckedWriter extends Writer {
      @Override
      public void write(char[] cbuf, int off, int len) {
        try {
          writer.write(cbuf, off, len);
        } catch (IOException e) {
          throw new RuntimeIOException(e);
        }
      }

      @Override
      public void flush() {
        try {
          writer.flush();
        } catch (IOException e) {
          throw new RuntimeIOException(e);
        }
      }

      @Override
      public void close() {
        try {
          writer.close();
        } catch (IOException e) {
          throw new RuntimeIOException(e);
        }
      }
    }

    notNull(writer);
    return new UncheckedWriter();
  }

  /**
   * If an {@link IOException} is thrown, it is wrapped in a
   * {@link RuntimeIOException}. This may be useful for adding error handling
   * to types like {@link java.io.PrintStream}.
   * 
   * @param out
   *          the output target to be decorated
   * @return the decorated type
   * @see RuntimeIOException
   */
  public static OutputStream uncheckedOutputStream(final OutputStream out) {
    class UncheckedOutputStream extends OutputStream {
      @Override
      public void write(int b) {
        try {
          out.write(b);
        } catch (IOException e) {
          throw new RuntimeIOException(e);
        }
      }

      @Override
      public void close() {
        try {
          out.close();
        } catch (IOException e) {
          throw new RuntimeIOException(e);
        }
      }
    }

    notNull(out);
    return new UncheckedOutputStream();
  }

  /**
   * Type for little-endian data operations.
   * 
   * @param in
   *          the underlying data stream
   * @return the deorated type
   */
  public static LittleEndianInputStream littleEndianInputStream(
      DataInputStream in) {
    return new LittleEndianInputStream(in);
  }

  /**
   * Type for little-endian data operations.
   * 
   * @param out
   *          the underlying data stream
   * @return the deorated type
   */
  public static LittleEndianOutputStream littleEndianOutputStream(
      DataOutputStream out) {
    return new LittleEndianOutputStream(out);
  }

  private static final <T> T notNull(T t) {
    if (t == null) {
      throw new IllegalArgumentException("null");
    }
    return t;
  }
}
