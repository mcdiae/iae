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

package demo.fluentio.test;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@org.junit.Ignore
class TUtils {

  private TUtils() {}

  public static String testChars() {
    StringBuilder buffer = new StringBuilder();
    for (int i = 0; i < 1000; i++) {
      buffer.append("Hello, World!\r\n\uD835\uDD0A");
    }
    return buffer.toString();
  }

  public static byte[] testData() {
    return testChars().getBytes(Charset.forName("UTF-8"));
  }

  public static File temp() throws IOException {
    File temp = File.createTempFile(TUtils.class.getName(), ".txt");
    temp.deleteOnExit();
    return temp;
  }

  public static List<String> lines() {
    List<String> lines = new ArrayList<String>();
    for (int i = 0; i < 1000; i++) {
      lines.add(" Hello " + i);
    }
    return Collections.unmodifiableList(lines);
  }

  public static String concatenatedLines() {
    StringWriter writer = new StringWriter();
    PrintWriter pw = new PrintWriter(writer);
    for (String line : lines()) {
      pw.println(line);
    }
    pw.flush();
    return writer.toString();
  }
}
