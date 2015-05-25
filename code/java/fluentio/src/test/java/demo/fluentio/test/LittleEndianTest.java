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

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import demo.fluentio.IO;
import demo.fluentio.LittleEndianOutputStream;

public class LittleEndianTest {

  @Test
  public void testLitteEndian() throws IOException {
    {
      int init = 0xFF00AA00;
      int reverse = 0x00AA00FF;
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      LittleEndianOutputStream out = IO.out(SHUT, baos).data().littleEndian()
          .die();
      out.writeInt(init);
      out.close();
      Assert.assertEquals(reverse, IO.bytes(SHUT, baos.toByteArray()).data()
          .die().readInt());
      Assert.assertEquals(init, IO.bytes(SHUT, baos.toByteArray())
          .littleEndian().die().readInt());
    }
    {
      long init = 0xFAAAAAAAFF00AAAAL;
      long reverse = 0xAAAA00FFAAAAAAFAL;
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      LittleEndianOutputStream out = IO.out(SHUT, baos).data().littleEndian()
          .die();
      out.writeLong(init);
      out.close();
      Assert.assertEquals(reverse, IO.bytes(SHUT, baos.toByteArray()).data()
          .die().readLong());
      Assert.assertEquals(init, IO.bytes(SHUT, baos.toByteArray())
          .littleEndian().die().readLong());
    }
    {
      short init = (short) 0xFFA0;
      short reverse = (short) 0xA0FF;
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      LittleEndianOutputStream out = IO.out(SHUT, baos).data().littleEndian()
          .die();
      out.writeShort(init);
      out.close();
      Assert.assertEquals(reverse, IO.bytes(SHUT, baos.toByteArray()).data()
          .die().readShort());
      Assert.assertEquals(init, IO.bytes(SHUT, baos.toByteArray())
          .littleEndian().die().readShort());
    }
    {
      char init = '\uFFA0';
      char reverse = '\uA0FF';
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      LittleEndianOutputStream out = IO.out(SHUT, baos).data().littleEndian()
          .die();
      out.writeChar(init);
      out.close();
      Assert.assertEquals(reverse, IO.bytes(SHUT, baos.toByteArray()).data()
          .die().readChar());
      Assert.assertEquals(init, IO.bytes(SHUT, baos.toByteArray())
          .littleEndian().die().readChar());
    }
  }
}
