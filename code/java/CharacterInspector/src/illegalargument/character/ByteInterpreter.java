/*
Copyright (c) 2009 McDowell

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

package illegalargument.character;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class ByteInterpreter {

  private String data;
  private byte[] bytes;
  private boolean valid;

  public String getData() {
    return data;
  }

  public void setData(String data) {
    data = stripWhitespaceAndCommas(data);
    this.data = data;
    valid = false;
    bytes = null;

    if (data.length() % 2 != 0) {
      return;
    }
    byte[] bytes = new byte[data.length() / 2];
    for (int i = 0; i < data.length(); i += 2) {
      try {
        String oneByte = data.substring(i, i + 2);
        bytes[i / 2] = (byte) Integer.parseInt(oneByte, 16);
      } catch (NumberFormatException e) {
        return;
      }
    }

    this.data = data;
    this.bytes = bytes;
    valid = true;
  }

  public byte[] getBytes() {
    return bytes;
  }

  public boolean isValid() {
    return valid;
  }

  public String asString(Charset charset) {
    String enc = charset.name();
    try {
      return new String(bytes, enc);
    } catch (UnsupportedEncodingException e) {
      throw new RuntimeException(e);
    }
  }

  private String stripWhitespaceAndCommas(String str) {
    StringBuilder builder = new StringBuilder(str.length());
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (!(Character.isWhitespace(ch) || ch == ',')) {
        builder.append(ch);
      }
    }
    return builder.toString();
  }

}
