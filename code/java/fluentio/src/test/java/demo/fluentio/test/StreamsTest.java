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

package demo.fluentio.test;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;

import org.junit.Assert;
import org.junit.Test;

import demo.fluentio.Closers;
import demo.fluentio.RuntimeIOException;
import demo.fluentio.Streams;
import demo.fluentio.UncheckedCloser;

public class StreamsTest {

  @Test
  public void testUncheckedByteException() {
    try {
      UncheckedCloser closer = Closers.uncheckedCloser();
      try {
        final PrintStream out = new PrintStream(Streams
            .uncheckedOutputStream(new FailingOutputStream()));
        invoke(new Runnable() {
          @Override
          public void run() {
            out.write(1);
            out.flush();
          }
        });
        Assert.fail("should fail with runtime exception handling");
      } finally {
        closer.close();
      }
    } catch (RuntimeIOException e) {
      // OK
    }
  }

  @Test
  public void testUncheckedCharException() {
    try {
      UncheckedCloser closer = Closers.uncheckedCloser();
      try {
        final PrintWriter out = new PrintWriter(Streams
            .uncheckedWriter(new OutputStreamWriter(new FailingOutputStream())));
        invoke(new Runnable() {
          @Override
          public void run() {
            out.write("Hello");
            out.flush();
          }
        });
        Assert.fail("should fail with runtime exception handling");
      } finally {
        closer.close();
      }
    } catch (RuntimeIOException e) {
      // OK
    }
  }

  private void invoke(Runnable r) {
    r.run();
  }

  private static class FailingOutputStream extends OutputStream {
    @Override
    public void write(int b) throws IOException {
      throw new IOException("OK");
    }
  }
}
