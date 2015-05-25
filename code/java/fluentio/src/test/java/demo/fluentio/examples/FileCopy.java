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

import static demo.fluentio.Closers.coupledCloser;
import static demo.fluentio.IO.access;
import static demo.fluentio.IO.open;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

import demo.fluentio.CoupledCloser;
import demo.fluentio.Doctor;

/**
 * Simple file copy demo.
 * 
 * @author McDowell
 */
public class FileCopy {
  public static void main(String[] args) throws IOException {
    if (args.length != 2) {
      System.err.println("args: input output");
    }
    copy(new File(args[0]), new File(args[1]));
  }

  private static void copy(File src, File dest) throws IOException {
    CoupledCloser closer = coupledCloser();
    try {
      Doctor<OutputStream, ?> drainBytesOp = access(closer.in(), src).drain();
      open(closer.out(), dest).doctor(drainBytesOp);
    } finally {
      closer.close();
    }
  }
}
