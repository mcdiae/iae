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

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.zip.ZipOutputStream;


public final class OutputDie<T extends OutputStream> extends AbstractDie<T> {
  OutputDie(Closer c, T out) {
    super(c, out);
  }

  public OutputDie<BufferedOutputStream> buffered() {
    return IO.out(getCloser(), new BufferedOutputStream(die()));
  }

  public OutputDie<DataOutputStream> data() {
    return IO.out(getCloser(), new DataOutputStream(die()));
  }

  public OutputDie<LittleEndianOutputStream> littleEndian() {
    OutputDie<DataOutputStream> data = data();
    return IO.out(data.getCloser(), Streams
        .littleEndianOutputStream(data.die()));
  }

  public OutputDie<ZipOutputStream> zip() {
    return IO.out(getCloser(), new ZipOutputStream(die()));
  }

  public OutputDie<OutputStream> unchecked() {
    return IO.out(getCloser(), Streams.uncheckedOutputStream(die()));
  }

  /**
   * For writing character data.
   * 
   * @return an encoding {@code Writer}.
   */
  public WriterDie<OutputStreamWriter> encode(Charset charset) {
    Closer closer = getCloser();
    OutputStreamWriter writer = closer.using(new OutputStreamWriter(die(),
        notNull(charset)));
    return new WriterDie<OutputStreamWriter>(closer, writer);
  }

  /**
   * For writing character data as UTF-8.
   * 
   * @return a UTF-8 encoding {@code Writer}.
   * @see #encode(Charset)
   */
  public WriterDie<OutputStreamWriter> utf8() {
    return encode(Charset.forName("UTF-8"));
  }

  /**
   * @return a draining {@code Doctor}
   * @see Drains#readDrain(Die)
   */
  public Doctor<T, Die<InputStream>> drain() {
    return Drains.outDrain(this);
  }
}
