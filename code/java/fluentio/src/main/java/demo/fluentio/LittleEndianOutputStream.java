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

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;


/**
 * 
 * @author McDowell
 * @see Streams#littleEndianOutputStream(DataOutputStream)
 */
public class LittleEndianOutputStream extends FilterOutputStream implements
    DataOutput {
  private final DataOutput reverser;

  LittleEndianOutputStream(DataOutputStream out) {
    super(out);
    reverser = Data.reverseEndianDataOutput(out);
  }

  @Override
  public void writeBoolean(boolean v) throws IOException {
    reverser.writeBoolean(v);
  }

  @Override
  public void writeByte(int v) throws IOException {
    reverser.writeByte(v);
  }

  @Override
  public void writeBytes(String s) throws IOException {
    reverser.writeBytes(s);
  }

  @Override
  public void writeChar(int v) throws IOException {
    reverser.writeChar(v);
  }

  @Override
  public void writeChars(String s) throws IOException {
    reverser.writeChars(s);
  }

  @Override
  public void writeDouble(double v) throws IOException {
    reverser.writeDouble(v);
  }

  @Override
  public void writeFloat(float v) throws IOException {
    reverser.writeFloat(v);
  }

  @Override
  public void writeInt(int v) throws IOException {
    reverser.writeInt(v);
  }

  @Override
  public void writeLong(long v) throws IOException {
    reverser.writeLong(v);
  }

  @Override
  public void writeShort(int v) throws IOException {
    reverser.writeShort(v);
  }

  @Override
  public void writeUTF(String s) throws IOException {
    reverser.writeUTF(s);
  }
}
