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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;

import demo.fluentio.Closers;
import demo.fluentio.CoupledCloser;

/**
 * A class that copies a UTF-8 file, replacing the line terminators with \n.
 * 
 * This demonstrates the raw use of {@link CoupledCloser}.
 */
public class ToUnixText {
  public static void main(String[] args) {
    if (args.length != 2) {
      System.err.println("Expected arguments: input.file output.file");
    }
    try {
      closingTransform(new File(args[0]), new File(args[1]));
    } catch (IOException e) {
      System.err.println(e.getMessage());
    }
  }

  private static void closingTransform(File src, File dest) throws IOException {
    Charset utf8 = Charset.forName("UTF-8");
    CoupledCloser closer = Closers.coupledCloser();
    try {
      InputStream in = closer.in().using(new FileInputStream(src));
      Reader reader = closer.in().using(new InputStreamReader(in, utf8));
      BufferedReader buffer = closer.in().using(new BufferedReader(reader));
      OutputStream out = closer.out().using(new FileOutputStream(dest));
      Writer writer = closer.out().using(new OutputStreamWriter(out, utf8));
      replaceNewLines(buffer, writer);
    } finally {
      closer.close();
    }
  }

  /**
   * Original (unused)
   * 
   * @see #closingTransform(File, File)
   */
  // private static void transform(File src, File dest) throws IOException {
  // Charset utf8 = Charset.forName("UTF-8");
  // InputStream in = new FileInputStream(src);
  // Closeable inputResource = in;
  // try {
  // Reader reader = new InputStreamReader(in, utf8);
  // inputResource = reader;
  // BufferedReader buffer = new BufferedReader(reader);
  // inputResource = buffer;
  // OutputStream out = new FileOutputStream(dest);
  // Closeable outputResource = out;
  // try {
  // Writer writer = new OutputStreamWriter(out, utf8);
  // outputResource = writer;
  // replaceNewLines(buffer, writer);
  // } finally {
  // outputResource.close();
  // }
  // } finally {
  // inputResource.close();
  // }
  // }
  /**
   * Writes out each line with a Unix line terminator.
   */
  private static void replaceNewLines(BufferedReader src, Writer dest)
      throws IOException {
    for (String line = src.readLine(); line != null; line = src.readLine()) {
      dest.write(line);
      dest.write("\n");
    }
  }
}
