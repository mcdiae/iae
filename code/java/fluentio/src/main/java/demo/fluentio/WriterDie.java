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

import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.Writer;


public final class WriterDie<T extends Writer> extends AbstractDie<T> {
  WriterDie(Closer c, T w) {
    super(c, w);
  }

  private <X extends Writer> WriterDie<X> create(X x) {
    return new WriterDie<X>(getCloser(), x);
  }

  public WriterDie<BufferedWriter> buffered() {
    return create(new BufferedWriter(die()));
  }

  public WriterDie<PrintWriter> printer() {
    return create(new PrintWriter(die()));
  }

  public WriterDie<Writer> unchecked() {
    return create(Streams.uncheckedWriter(die()));
  }

  public Doctor<T, Die<Readable>> drain() {
    return Drains.writeDrain(this);
  }
}
