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

import static demo.fluentio.InternalUtils.notNull;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * Utilities for aiding in data-related operations.
 * 
 * @author McDowell
 */
public final class Data {
  private Data() {}

  /**
   * Decorates the input argument with a type that reverses the endianness for
   * certain data types.
   * 
   * @param in
   *          the object to decorate
   * @return the decorated instance
   */
  public static DataInput reverseEndianDataInput(final DataInput in) {
    class ReverseEndianDataInput implements DataInput {
      @Override
      public boolean readBoolean() throws IOException {
        return in.readBoolean();
      }

      @Override
      public byte readByte() throws IOException {
        return in.readByte();
      }

      @Override
      public char readChar() throws IOException {
        return reverseChar(in.readChar());
      }

      @Override
      public double readDouble() throws IOException {
        return Double.longBitsToDouble(reverseLong(in.readLong()));
      }

      @Override
      public float readFloat() throws IOException {
        return Float.intBitsToFloat(reverseInt(in.readInt()));
      }

      @Override
      public void readFully(byte[] b) throws IOException {
        in.readFully(b);
      }

      @Override
      public void readFully(byte[] b, int off, int len) throws IOException {
        in.readFully(b, off, len);
      }

      @Override
      public int readInt() throws IOException {
        return reverseInt(in.readInt());
      }

      @Override
      public String readLine() throws IOException {
        return in.readLine();
      }

      @Override
      public long readLong() throws IOException {
        return reverseLong(in.readLong());
      }

      @Override
      public short readShort() throws IOException {
        return reverseShort(in.readShort());
      }

      @Override
      public String readUTF() throws IOException {
        return in.readUTF();
      }

      @Override
      public int readUnsignedByte() throws IOException {
        return in.readUnsignedByte();
      }

      @Override
      public int readUnsignedShort() throws IOException {
        return reverseShort(in.readShort()) & 0xFFFF;
      }

      @Override
      public int skipBytes(int n) throws IOException {
        return in.skipBytes(n);
      }
    }

    notNull(in);
    return new ReverseEndianDataInput();
  }

  /**
   * Decorates the input argument with a type that reverses the endianness for
   * certain data types.
   * 
   * @param out
   *          the object to decorate
   * @return the decorated instance
   */
  public static DataOutput reverseEndianDataOutput(final DataOutput out) {
    class ReverseEndianDataOutput implements DataOutput {
      @Override
      public void write(byte[] b) throws IOException {
        out.write(b);
      }

      @Override
      public void write(byte[] b, int off, int len) throws IOException {
        out.write(b, off, len);
      }

      @Override
      public void write(int b) throws IOException {
        out.write(b);
      }

      @Override
      public void writeBoolean(boolean v) throws IOException {
        out.writeBoolean(v);
      }

      @Override
      public void writeByte(int v) throws IOException {
        out.writeByte(v);
      }

      @Override
      public void writeBytes(String s) throws IOException {
        out.writeBytes(s);
      }

      @Override
      public void writeChar(int v) throws IOException {
        out.writeChar(reverseChar((char) v));
      }

      @Override
      public void writeChars(String s) throws IOException {
        for (int i = 0; i < s.length(); i++) {
          writeChar(s.charAt(i));
        }
      }

      @Override
      public void writeDouble(double v) throws IOException {
        writeLong(Double.doubleToLongBits(v));
      }

      @Override
      public void writeFloat(float v) throws IOException {
        writeInt(Float.floatToIntBits(v));
      }

      @Override
      public void writeInt(int v) throws IOException {
        out.writeInt(reverseInt(v));
      }

      @Override
      public void writeLong(long v) throws IOException {
        out.writeLong(reverseLong(v));
      }

      @Override
      public void writeShort(int v) throws IOException {
        out.writeShort(reverseShort((short) v));
      }

      @Override
      public void writeUTF(String s) throws IOException {
        out.writeUTF(s);
      }
    }

    notNull(out);
    return new ReverseEndianDataOutput();
  }

  private static int reverseInt(int n) {
    int ret = 0;
    for (int i = 0; i < 4; i++) {
      ret <<= 8;
      ret |= (n & 0xFF);
      n >>>= 8;
    }
    return ret;
  }

  private static short reverseShort(short n) {
    short ret = 0;
    for (int i = 0; i < 2; i++) {
      ret <<= 8;
      ret |= (n & 0xFF);
      n >>>= 8;
    }
    return ret;
  }

  private static char reverseChar(char n) {
    char ret = 0;
    for (int i = 0; i < 2; i++) {
      ret <<= 8;
      ret |= (n & 0xFF);
      n >>>= 8;
    }
    return ret;
  }

  private static long reverseLong(long n) {
    long ret = 0;
    for (int i = 0; i < 8; i++) {
      ret <<= 8;
      ret |= (n & 0xFF);
      n >>>= 8;
    }
    return ret;
  }
}
