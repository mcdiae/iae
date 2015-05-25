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

import static demo.fluentio.Closers.closer;
import static demo.fluentio.Doctors.STRING;
import static demo.fluentio.test.TUtils.temp;
import static demo.fluentio.test.TUtils.testChars;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.charset.Charset;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import demo.fluentio.Closer;
import demo.fluentio.Closers;
import demo.fluentio.IO;
import demo.fluentio.RuntimeIOException;
import demo.fluentio.UncheckedCloser;

public class CharTest {
  private String chars;
  private final Charset utf16 = Charset.forName("UTF-16");

  @Before
  public void setup() {
    chars = testChars();
  }

  @Test
  public void encodeDecodeTest() throws IOException {
    File temp = temp();
    {
      Closer closer = closer();
      try {
        IO.open(closer, temp).encode(utf16).die().write(chars);
      } finally {
        closer.close();
      }
    }
    {
      Closer closer = closer();
      try {
        String result = IO.access(closer, temp).decode(utf16).doctor(STRING);
        Assert.assertEquals(chars, result);
      } finally {
        closer.close();
      }
    }
  }

  @Test
  public void encodeDecodeUtf8Test() throws IOException {
    File temp = temp();
    {
      Closer closer = closer();
      try {
        IO.open(closer, temp).utf8().die().write(chars);
      } finally {
        closer.close();
      }
    }
    {
      Closer closer = closer();
      try {
        String result = IO.access(closer, temp).utf8().doctor(STRING);
        Assert.assertEquals(chars, result);
      } finally {
        closer.close();
      }
    }
  }

  @Test
  public void testBuffered() throws IOException {
    File temp = temp();
    {
      Closer closer = closer();
      try {
        IO.open(closer, temp).utf8().buffered().die().write(chars);
      } finally {
        closer.close();
      }
    }
    {
      Closer closer = closer();
      try {
        String result = IO.access(closer, temp).utf8().buffered()
            .doctor(STRING);
        Assert.assertEquals(chars, result);
      } finally {
        closer.close();
      }
    }
  }

  @Test
  public void testPrintWriter() throws IOException {
    File temp = temp();
    {
      Closer closer = closer();
      try {
        IO.open(closer, temp).utf8().printer().die().write(chars);
      } finally {
        closer.close();
      }
    }
    {
      Closer closer = closer();
      try {
        String result = IO.access(closer, temp).utf8().doctor(STRING);
        Assert.assertEquals(chars, result);
      } finally {
        closer.close();
      }
    }
  }

  @Test
  public void testUnchecked() {
    class Thrower extends Writer {
      @Override
      public void close() throws IOException {
        throw new IOException("Test");
      }

      @Override
      public void write(char[] cbuf, int off, int len) throws IOException {
        throw new IOException("Test");
      }

      @Override
      public void flush() throws IOException {
        throw new IOException("Test");
      }
    }

    UncheckedCloser closer = Closers.uncheckedCloser();
    PrintWriter pw = IO.writing(closer, new Thrower()).unchecked().printer()
        .die();
    try {
      pw.write("Hello");
      Assert.fail("should throw exception");
    } catch (RuntimeIOException e) {
      // Good
    }
    try {
      pw.flush();
      Assert.fail("should throw exception");
    } catch (RuntimeIOException e) {
      // Good
    }
    try {
      closer.close();
      Assert.fail("should throw exception");
    } catch (RuntimeIOException e) {
      // Good
    }
  }
}
