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

package demo.fluentio.examples;

import java.io.File;
import java.io.IOException;
import java.io.Writer;

import demo.fluentio.Closers;
import demo.fluentio.CoupledCloser;
import demo.fluentio.Doctors;
import demo.fluentio.IO;

public class ToUnixText2 {
  public static void main(String[] args) {
    if (args.length != 2) {
      System.err.println("Expected arguments: input.file output.file");
    }
    try {
      fluentTransform(new File(args[0]), new File(args[1]));
    } catch (IOException e) {
      System.err.println(e.getMessage());
    }
  }

  private static void fluentTransform(File src, File dest) throws IOException {
    CoupledCloser closer = Closers.coupledCloser();
    try {
      Iterable<String> lines = IO.access(closer.in(), src).buffered().utf8()
          .doctor(Doctors.LINES);

      Writer writer = IO.open(closer.out(), dest).buffered().utf8().die();

      replaceNewLines(lines, writer);
    } finally {
      closer.close();
    }
  }

  /**
   * Expanded version of fluentTransform
   */
  // private static void transformOp(File src, File dest) throws IOException {
  // CoupledCloser closer = Closers.coupledCloser();
  // try {
  // Closer in = closer.in();
  // InputDie<FileInputStream> accessed = IO.access(in, src);
  // InputDie<BufferedInputStream> bufferIn = accessed.buffered();
  // ReaderDie<InputStreamReader> readerDie = bufferIn.utf8();
  // Iterable<String> lines = readerDie.doctor(Doctors.LINES);
  // Closer out = closer.out();
  // OutputDie<FileOutputStream> opened = IO.open(out, dest);
  // OutputDie<BufferedOutputStream> bufferOut = opened.buffered();
  // WriterDie<OutputStreamWriter> writerDie = bufferOut.utf8();
  // Writer writer = writerDie.die();
  // replaceNewLines(lines, writer);
  // } finally {
  // closer.close();
  // }
  // }
  /**
   * Writes out each line with a Unix line terminator.
   */
  private static void replaceNewLines(Iterable<String> src, Writer dest)
      throws IOException {
    for (String line : src) {
      dest.write(line);
      dest.write("\n");
    }
  }
}
