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
import static demo.fluentio.Doctors.DETECT_BOM;
import static demo.fluentio.Doctors.GZIP_IN;
import static demo.fluentio.Doctors.GZIP_OUT;
import static demo.fluentio.Doctors.JAR_IN;
import static demo.fluentio.Doctors.JAR_OUT;
import static demo.fluentio.Doctors.LINES;
import static demo.fluentio.Doctors.STRING;
import static demo.fluentio.Doctors.bom;
import static demo.fluentio.IO.access;
import static demo.fluentio.IO.open;
import static demo.fluentio.IO.out;
import static demo.fluentio.IO.reading;
import static demo.fluentio.test.TUtils.concatenatedLines;
import static demo.fluentio.test.TUtils.lines;
import static demo.fluentio.test.TUtils.temp;
import static demo.fluentio.test.TUtils.testData;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;
import java.util.jar.JarOutputStream;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import demo.fluentio.Closer;
import demo.fluentio.Closers;
import demo.fluentio.Die;
import demo.fluentio.Doctor;
import demo.fluentio.Doctors;
import demo.fluentio.Drains;
import demo.fluentio.IO;

public class DoctorsTest {
  private byte[] data;
  private List<String> lines;

  @Before
  public void init() {
    data = testData();
    lines = lines();
  }

  @Test
  public void testGzip() throws IOException {
    File temp = temp();
    {
      Closer closer = closer();
      try {
        open(closer, temp).doctor(GZIP_OUT).die().write(data);
      } finally {
        closer.close();
      }
    }
    {
      Closer closer = closer();
      try {
        byte[] result = access(closer, temp).doctor(GZIP_IN).doctor(BYTES);
        Assert.assertArrayEquals(data, result);
      } finally {
        closer.close();
      }
    }
  }

  @Test
  public void testJar() throws IOException {
    File temp = temp();
    String name = "foo";
    {
      Closer closer = closer();
      try {
        JarOutputStream out = open(closer, temp).doctor(JAR_OUT).die();
        JarEntry entry = new JarEntry(name);
        out.putNextEntry(entry);
        out.write(data);
        out.closeEntry();
      } finally {
        closer.close();
      }
    }
    {
      Closer closer = closer();
      try {
        JarInputStream in = access(closer, temp).doctor(JAR_IN).die();
        JarEntry entry = in.getNextJarEntry();
        Assert.assertEquals(name, entry.getName());
        byte[] result = Drains.drain(in, new ByteArrayOutputStream())
            .toByteArray();
        in.closeEntry();
        Assert.assertArrayEquals(data, result);
      } finally {
        closer.close();
      }
    }
  }

  @Test
  public void testLines() {
    List<String> result = new ArrayList<String>();
    Reader src = new StringReader(concatenatedLines());
    for (String line : reading(SHUT, src).operate(LINES)) {
      result.add(line);
    }
    Assert.assertEquals(lines, result);
  }

  @Test
  public void testReadLinesFromFile() throws IOException {
    File temp = temp();
    {// write file
      Closer closer = closer();
      try {
        IO.open(closer, temp).utf8().die().write(concatenatedLines());
      } finally {
        closer.close();
      }
    }
    {// scan file
      Closer closer = closer();
      try {
        List<String> result = new ArrayList<String>();
        for (String line : access(closer, temp).utf8().doctor(LINES)) {
          result.add(line);
        }
        Assert.assertEquals(lines, result);
      } finally {
        closer.close();
      }
    }
  }

  @Test
  public void testBom() {
    {
      String data = "\uD835\uDD0A";

      Charset[] boms = { Charset.forName("UTF-16"),
          Charset.forName("x-UTF-16LE-BOM"), Charset.forName("x-UTF-32BE-BOM"),
          Charset.forName("x-UTF-32LE-BOM") };
      Charset[] noboms = { Charset.forName("UTF-8"),
          Charset.forName("UTF-16BE"), Charset.forName("UTF-16LE"),
          Charset.forName("UTF-32BE"), Charset.forName("UTF-32LE") };

      List<byte[]> encoded = new ArrayList<byte[]>();

      for (Charset encoding : boms) {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintWriter pw = out(Closers.SHUT, buffer).encode(encoding).printer()
            .die();
        pw.print(data);
        pw.flush();
        encoded.add(buffer.toByteArray());
      }

      for (Charset encoding : noboms) {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintWriter pw = out(Closers.SHUT, buffer).encode(encoding).operate(
            bom()).printer().die();
        pw.print(data);
        pw.flush();
        encoded.add(buffer.toByteArray());
      }

      for (byte[] encodedString : encoded) {
        String decoded = IO.in(Closers.SHUT,
            new ByteArrayInputStream(encodedString)).operate(DETECT_BOM)
            .operate(STRING);
        Assert.assertArrayEquals(data.toCharArray(), decoded.toCharArray());
      }
    }
    {// system encoding
      String data = "hello"; // safe
      Charset sysenc = Charset.defaultCharset();
      ByteArrayOutputStream buffer = new ByteArrayOutputStream();
      PrintWriter pw = out(Closers.SHUT, buffer).encode(sysenc).printer().die();
      pw.write(data);
      pw.close();
      String decoded = IO.in(Closers.SHUT,
          new ByteArrayInputStream(buffer.toByteArray())).operate(DETECT_BOM)
          .operate(STRING);
      Assert.assertEquals(data, decoded);
    }
  }

  @Test
  public void testBytes() {
    byte[] data = "Hello, World!".getBytes(Charset.forName("UTF-8"));
    byte[] result = IO.in(Closers.SHUT, new ByteArrayInputStream(data))
        .operate(BYTES);
    Assert.assertArrayEquals(data, result);
  }

  @Test
  public void testSerialization() throws IOException, ClassNotFoundException {
    int arg1 = 32;
    String arg2 = "foo";
    File temp = temp();
    {
      Closer closer = Closers.closer();
      try {
        ObjectOutputStream out = IO.open(closer, temp).doctor(
            Doctors.OBJECT_OUT).die();
        out.writeInt(arg1);
        out.writeObject(arg2);
      } finally {
        closer.close();
      }
    }
    {
      Closer closer = Closers.closer();
      try {
        ObjectInputStream in = IO.access(closer, temp)
            .doctor(Doctors.OBJECT_IN).die();
        Assert.assertEquals(arg1, in.readInt());
        Assert.assertEquals(arg2, in.readObject());
      } finally {
        closer.close();
      }
    }
  }

  @Test
  public void testByteDrains() {
    {
      ByteArrayInputStream in = new ByteArrayInputStream(data);
      Die<ByteArrayOutputStream> out = IO.out(Closers.SHUT,
          new ByteArrayOutputStream());
      Doctor<ByteArrayOutputStream, ? extends Die<? extends InputStream>> drain = Drains
          .outDrain(out);
      ByteArrayOutputStream result = IO.in(SHUT, in).operate(drain);
      Assert.assertArrayEquals(data, result.toByteArray());
    }
    {
      ByteArrayInputStream in = new ByteArrayInputStream(data);
      ByteArrayOutputStream out = new ByteArrayOutputStream();
      byte[] result = IO.in(SHUT, in).operate(IO.out(SHUT, out).drain())
          .toByteArray();
      Assert.assertArrayEquals(data, result);
    }
    {
      ByteArrayOutputStream out = new ByteArrayOutputStream();
      Die<ByteArrayInputStream> in = IO
          .in(SHUT, new ByteArrayInputStream(data));
      Doctor<ByteArrayOutputStream, Die<ByteArrayOutputStream>> drain = Drains
          .inDrain(in);
      byte[] result = IO.out(SHUT, out).operate(drain).toByteArray();
      Assert.assertArrayEquals(data, result);
    }
    {
      ByteArrayOutputStream out = new ByteArrayOutputStream();
      Doctor<ByteArrayOutputStream, Die<ByteArrayOutputStream>> drain = Drains
          .byteDrain(data);
      byte[] result = IO.out(SHUT, out).operate(drain).toByteArray();
      Assert.assertArrayEquals(data, result);
    }
    {
      ByteArrayInputStream in = new ByteArrayInputStream(data);
      ByteArrayOutputStream out = new ByteArrayOutputStream();
      Doctor<ByteArrayOutputStream, Die<ByteArrayOutputStream>> drain = IO.in(
          SHUT, in).drain();
      byte[] result = IO.out(SHUT, out).operate(drain).toByteArray();
      Assert.assertArrayEquals(data, result);
    }
  }

  @Test
  public void testCharDrains() {
    String data = concatenatedLines();
    {
      Reader in = new StringReader(data);
      final StringBuilder builder = new StringBuilder();
      Die<Appendable> appendable = new Die<Appendable>() {
        @Override
        public Closer getCloser() {
          return SHUT;
        }

        @Override
        public Appendable die() {
          return builder;
        }
      };
      String result = IO.reading(SHUT, in).operate(
          Drains.writeDrain(appendable)).toString();
      Assert.assertEquals(data, result);
    }
    {
      Reader in = new StringReader(data);
      Writer out = new StringWriter();
      String result = IO.reading(SHUT, in).operate(
          IO.writing(SHUT, out).drain()).toString();
      Assert.assertEquals(data, result);
    }
    {
      Reader in = new StringReader(data);
      Writer out = new StringWriter();
      String result = IO.writing(SHUT, out).operate(
          Drains.readDrain(IO.reading(SHUT, in))).toString();
      Assert.assertEquals(data, result);
    }
    {
      StringBuilder in = new StringBuilder(data);
      Writer out = new StringWriter();
      String result = IO.writing(SHUT, out).operate(Drains.charDrain(in))
          .toString();
      Assert.assertEquals(data, result);
    }
    {
      Writer out = new StringWriter();
      String result = IO.writing(SHUT, out).operate(Drains.charDrain(data))
          .toString();
      Assert.assertEquals(data, result);
    }
    {
      Reader in = new StringReader(data);
      Writer out = new StringWriter();
      String result = IO.writing(SHUT, out).operate(
          IO.reading(SHUT, in).drain()).toString();
      Assert.assertEquals(data, result);
    }
  }

  @Test
  public void testTyping() {
    Die<OutputStream> bin = IO.out(SHUT, new ByteArrayOutputStream()).cast();
    Doctors.unchecked(GZIP_OUT).op(bin);
  }
}
