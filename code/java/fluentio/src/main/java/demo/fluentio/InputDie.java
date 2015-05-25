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

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.zip.ZipInputStream;


public final class InputDie<T extends InputStream> extends AbstractDie<T> {
  InputDie(Closer c, T out) {
    super(c, out);
  }

  public InputDie<BufferedInputStream> buffered() {
    return IO.in(getCloser(), new BufferedInputStream(die()));
  }

  public InputDie<DataInputStream> data() {
    return IO.in(getCloser(), new DataInputStream(die()));
  }

  public InputDie<LittleEndianInputStream> littleEndian() {
    InputDie<DataInputStream> data = data();
    return IO.in(data.getCloser(), Streams.littleEndianInputStream(data.die()));
  }

  public InputDie<ZipInputStream> zip() {
    return IO.in(getCloser(), new ZipInputStream(die()));
  }

  public ReaderDie<InputStreamReader> decode(Charset charset) {
    Closer closer = getCloser();
    InputStreamReader reader = new InputStreamReader(die(), notNull(charset));
    return new ReaderDie<InputStreamReader>(closer, reader);
  }

  /**
   * Decodes the data as character data using UTF-8. No provision is made for
   * BOMs.
   */
  public ReaderDie<InputStreamReader> utf8() {
    return decode(Charset.forName("UTF-8"));
  }

  public <O extends OutputStream> Doctor<O, Die<O>> drain() {
    return Drains.inDrain(this);
  }
}
