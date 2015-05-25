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

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.FilterInputStream;
import java.io.IOException;


/**
 * @author McDowell
 * @see Streams#littleEndianInputStream(DataInputStream)
 */
public final class LittleEndianInputStream extends FilterInputStream implements
    DataInput {
  private final DataInput reverser;

  LittleEndianInputStream(DataInputStream input) {
    super(input);
    reverser = Data.reverseEndianDataInput(input);
  }

  @Override
  public boolean readBoolean() throws IOException {
    return reverser.readBoolean();
  }

  @Override
  public byte readByte() throws IOException {
    return reverser.readByte();
  }

  @Override
  public char readChar() throws IOException {
    return reverser.readChar();
  }

  @Override
  public double readDouble() throws IOException {
    return reverser.readDouble();
  }

  @Override
  public float readFloat() throws IOException {
    return reverser.readFloat();
  }

  @Override
  public void readFully(byte[] b) throws IOException {
    reverser.readFully(b);
  }

  @Override
  public void readFully(byte[] b, int off, int len) throws IOException {
    reverser.readFully(b, off, len);
  }

  @Override
  public int readInt() throws IOException {
    return reverser.readInt();
  }

  @Override
  public String readLine() throws IOException {
    return reverser.readLine();
  }

  @Override
  public long readLong() throws IOException {
    return reverser.readLong();
  }

  @Override
  public short readShort() throws IOException {
    return reverser.readShort();
  }

  @Override
  public String readUTF() throws IOException {
    return reverser.readUTF();
  }

  @Override
  public int readUnsignedByte() throws IOException {
    return reverser.readUnsignedByte();
  }

  @Override
  public int readUnsignedShort() throws IOException {
    return reverser.readUnsignedShort();
  }

  @Override
  public int skipBytes(int n) throws IOException {
    return reverser.skipBytes(n);
  }
}
