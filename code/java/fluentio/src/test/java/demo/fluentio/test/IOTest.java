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
import static demo.fluentio.Doctors.BYTES;
import static demo.fluentio.test.TUtils.temp;
import static demo.fluentio.test.TUtils.testData;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import demo.fluentio.Closer;
import demo.fluentio.Closers;
import demo.fluentio.CoupledCloser;
import demo.fluentio.IO;

public class IOTest {
  private byte[] data;

  @Before
  public void init() {
    data = testData();
  }

  @Test
  public void testFile() throws IOException {
    File temp = temp();
    {
      Closer closer = closer();
      try {
        IO.open(closer, temp).die().write(data);
      } finally {
        closer.close();
      }
    }
    {
      Closer closer = closer();
      try {
        byte[] result = IO.access(closer, temp).doctor(BYTES);
        Assert.assertArrayEquals(data, result);
      } finally {
        closer.close();
      }
    }
    {
      // append
      Closer closer = closer();
      try {
        IO.open(closer, temp, true).die().write(data);
      } finally {
        closer.close();
      }
    }
    {
      // check double
      Closer closer = closer();
      try {
        byte[] doubled = new byte[data.length * 2];
        System.arraycopy(data, 0, doubled, 0, data.length);
        System.arraycopy(data, 0, doubled, data.length, data.length);
        byte[] result = IO.access(closer, temp).doctor(BYTES);
        Assert.assertArrayEquals(doubled, result);
      } finally {
        closer.close();
      }
    }
  }

  @Test
  public void testWrap() {
    Reader reader = new StringReader("");
    Assert.assertTrue(reader == IO.reading(closer(), reader).die());
    Writer writer = new StringWriter();
    Assert.assertTrue(writer == IO.writing(closer(), writer).die());
    InputStream in = new ByteArrayInputStream(data);
    Assert.assertTrue(in == IO.in(closer(), in).die());
    OutputStream out = new ByteArrayOutputStream();
    Assert.assertTrue(out == IO.out(closer(), out).die());
  }

  @Test
  public void testFileCopy() throws IOException {
    File src = temp();
    File dest = temp();
    {// create
      Closer closer = closer();
      try {
        IO.open(closer, src).die().write(data);
      } finally {
        closer.close();
      }
    }
    {// copy
      CoupledCloser closer = Closers.coupledCloser();
      try {
        IO.open(closer.out(), dest).doctor(IO.access(closer.in(), src).drain());
      } finally {
        closer.close();
      }
    }
    {// check copy
      Closer closer = closer();
      try {
        byte[] result = IO.access(closer, dest).doctor(BYTES);
        Assert.assertArrayEquals(data, result);
      } finally {
        closer.close();
      }
    }
  }

  @Test
  public void testDataIO() throws IOException {
    final int loops = 1024;
    File temp = temp();
    {
      Closer closer = Closers.closer();
      try {
        DataOutput out = IO.open(closer, temp).data().die();
        for (int i = 0; i < loops; i++) {
          out.writeBoolean(true);
          out.writeBoolean(false);
        }
      } finally {
        closer.close();
      }
    }
    {
      Closer closer = Closers.closer();
      try {
        DataInput in = IO.access(closer, temp).data().die();
        for (int i = 0; i < loops; i++) {
          Assert.assertTrue(in.readBoolean());
          Assert.assertFalse(in.readBoolean());
        }
      } finally {
        closer.close();
      }
    }
  }
}
