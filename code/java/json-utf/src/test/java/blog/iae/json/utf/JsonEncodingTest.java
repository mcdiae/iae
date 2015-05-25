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

import static blog.iae.json.utf.JsonCharsets.*;
import static java.util.Arrays.asList;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import blog.iae.json.utf.JsonCharsets;
import blog.iae.json.utf.JsonUtf;

public class JsonEncodingTest {
  @Test
  public void testDetection() throws IOException {
    List<String> samples = asList("{}", "[]", "{\"foo\":\"bar\"}");

    for (Charset enc : requiredJsonEncodings()) {
      for (String sample : samples) {
        InputStream in = new ByteArrayInputStream(sample.getBytes(enc.name()));
        in = new BufferedInputStream(in, 4);
        Charset detected = JsonUtf.detectJsonEncoding(in);
        Assert.assertEquals(enc, detected);
      }
    }
  }

  @Test
  public void testRead() throws IOException {
    String sample = "{\"foo\":1}";
    InputStream in = new ByteArrayInputStream(sample.getBytes(UTF_16LE.name()));
    Reader reader = JsonUtf.newJsonReader(in);
    int r;
    char[] cbuf = new char[sample.length()];
    StringBuilder buf = new StringBuilder();
    while ((r = reader.read(cbuf)) != -1) {
      buf.append(cbuf, 0, r);
    }
    Assert.assertEquals(sample, buf.toString());
  }

  @Test
  public void testWrite() throws IOException {
    String helloworld = "[\"\u3053\u3093\u306b\u3061\u306f\u4e16\u754c\"]";
    byte[] expected = helloworld.getBytes(JsonCharsets.UTF_8.name());
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    JsonUtf.newJsonWriter(baos).append(helloworld).close();
    byte[] encoded = baos.toByteArray();
    Assert.assertTrue(Arrays.equals(expected, encoded));
  }

  @Test
  public void testCompactJapanese() throws IOException {
    String helloworld = "[\"\u3053\u3093\u306b\u3061\u306f\u4e16\u754c\"]";
    int utf8len = helloworld.getBytes(JsonCharsets.UTF_8.name()).length;

    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    JsonUtf.newCompactJsonWriter(baos).append(helloworld).close();
    byte[] utf16 = baos.toByteArray();
    Assert.assertTrue(utf16.length < utf8len);
    String decoded = new String(utf16, JsonCharsets.UTF_16BE.name());
    Assert.assertEquals(helloworld, decoded);
  }
}
