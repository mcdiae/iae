/*
Copyright (c) 2012 McDowell

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
package blog.iae.json.utf;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

import blog.iae.json.utf.JsonUtf;

/**
 * Just an example to use in documentation
 */
public class SampleCode {

  public void save(File file) throws IOException {
    OutputStream out = new FileOutputStream(file);
    Closeable res = out;
    try {
      Writer writer = JsonUtf.newJsonWriter(out);
      res = writer;
      // write JSON
    } finally {
      res.close();
    }
  }

  public void load(File file) throws IOException {
    InputStream in = new FileInputStream(file);
    Closeable res = in;
    try {
      Reader reader = JsonUtf.newJsonReader(in);
      res = reader;
      // read JSON
    } finally {
      res.close();
    }
  }
}
