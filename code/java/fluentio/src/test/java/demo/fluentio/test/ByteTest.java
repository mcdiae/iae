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

import static demo.fluentio.Closers.SHUT;
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
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import demo.fluentio.Closer;
import demo.fluentio.Drains;
import demo.fluentio.IO;

public class ByteTest {
  private byte[] data;

  @Before
  public void init() {
    data = testData();
  }

  @Test
  public void testBuffer() throws IOException {
    File temp = temp();
    {
      Closer closer = closer();
      try {
        IO.open(closer, temp).buffered().die().write(data);
      } finally {
        closer.close();
      }
    }
    {
      Closer closer = closer();
      try {
        byte[] result = IO.access(closer, temp).buffered().doctor(BYTES);
        Assert.assertArrayEquals(data, result);
      } finally {
        closer.close();
      }
    }
  }

  @Test
  public void testZip() throws IOException {
    File temp = temp();
    String name = "foo";
    {
      Closer closer = closer();
      try {
        ZipOutputStream zos = IO.open(closer, temp).zip().die();
        ZipEntry entry = new ZipEntry(name);
        zos.putNextEntry(entry);
        zos.write(data);
        zos.closeEntry();
      } finally {
        closer.close();
      }
    }
    {
      Closer closer = closer();
      try {
        ZipInputStream zis = IO.access(closer, temp).zip().die();
        ZipEntry entry = zis.getNextEntry();
        Assert.assertEquals(name, entry.getName());
        byte[] result = Drains.drain(zis, new ByteArrayOutputStream())
            .toByteArray();
        zis.closeEntry();
        Assert.assertArrayEquals(data, result);
      } finally {
        closer.close();
      }
    }
  }

  @Test
  public void testLittleEndian() throws IOException {
    // TODO: more comprehensive test
    final long l = 0x00FF00FF;
    final int i = 0x00FF00FF;
    final short s = 0x00FF;

    ByteArrayOutputStream buffer = new ByteArrayOutputStream();
    DataOutput out = IO.out(SHUT, buffer).littleEndian().die();
    out.writeLong(l);
    out.writeInt(i);
    out.writeShort(s);

    DataInput in = IO.in(SHUT, new ByteArrayInputStream(buffer.toByteArray()))
        .littleEndian().die();

    Assert.assertEquals(l, in.readLong());
    Assert.assertEquals(i, in.readInt());
    Assert.assertEquals(s, in.readShort());
  }
}
