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

import static demo.fluentio.Doctors.BYTES;
import static demo.fluentio.Doctors.GZIP_IN;
import static demo.fluentio.Doctors.GZIP_OUT;

import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.junit.Assert;
import org.junit.Test;

import demo.fluentio.Buffers;
import demo.fluentio.Chain;
import demo.fluentio.Closers;
import demo.fluentio.Die;
import demo.fluentio.Doctor;
import demo.fluentio.Drains;
import demo.fluentio.IO;
import demo.fluentio.OutputDie;
import demo.fluentio.UncheckedCloser;

public class ChainsTest {

  private final Doctor<OutputDie<BufferedOutputStream>, Die<OutputStream>> COMPRESSOR = Chain
      .chain(GZIP_OUT).link(Buffers.outBuffer(1024)).chained();

  private final Doctor<byte[], Die<InputStream>> DECOMPRESSOR = Chain.chain(
      GZIP_IN).link(Buffers.inBuffer(1024)).link(BYTES).chained();

  @Test
  public void testChains() {
    byte[] data = TUtils.testData();

    ByteArrayOutputStream buffer = new ByteArrayOutputStream();
    UncheckedCloser closer = Closers.uncheckedCloser();
    IO.out(closer, buffer).operate(COMPRESSOR).operate(Drains.byteDrain(data));
    closer.close();
    byte[] compressed = buffer.toByteArray();

    byte[] result = IO.in(closer, new ByteArrayInputStream(compressed))
        .operate(DECOMPRESSOR);

    Assert.assertArrayEquals(data, result);
  }
}
