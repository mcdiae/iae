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

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;

final class JsonWriter extends Writer {
  private Writer writer;
  private final OutputStream stream;
  private StringBuilder buffer;
  private final int bufferSize;
  private final CodingErrorAction codingErrorAction;

  public JsonWriter(OutputStream stream, int bufferSize,
      CodingErrorAction codingErrorAction) {
    this.bufferSize = bufferSize;
    this.stream = stream;
    this.codingErrorAction = codingErrorAction;
  }

  @Override
  public void write(char[] cbuf, int off, int len) throws IOException {
    if (writer == null) {
      int buffered = (buffer == null) ? 0 : buffer.length();
      if (len + buffered >= bufferSize) {
        CharSequence cs = CharBuffer.wrap(cbuf);
        if (buffer != null) {
          cs = new ChainSequence(buffer, cs);
        }
        initWriter(cs);
      } else {
        if (buffer == null) {
          buffer = new StringBuilder();
          buffer.append(cbuf, off, len);
        }
      }
    } else {
      writer.write(cbuf, off, len);
    }
  }

  @Override
  public void flush() throws IOException {
    if (writer == null) {
      initWriter((buffer == null) ? "" : buffer);
    }
  }

  @Override
  public void close() throws IOException {
    if (writer == null) {
      initWriter((buffer == null) ? "" : buffer);
    }
    writer.close();
  }

  private void initWriter(CharSequence cs) throws IOException {
    CharsetEncoder encoder = chooseEncoding(cs).newEncoder()
        .onMalformedInput(codingErrorAction)
        .onUnmappableCharacter(codingErrorAction);
    writer = new OutputStreamWriter(stream, encoder);
    writer.append(cs);
    buffer = null;
  }

  private Charset chooseEncoding(CharSequence csq) {
    long utf16 = csq.length() * 2L;
    long utf8 = 0;
    for (int i = 0, len = csq.length(); i < len; i++) {
      char ch = csq.charAt(i);
      if (Character.isHighSurrogate(ch)) {
        if (i < len - 1) {
          char low = csq.charAt(++i);
          int cp = Character.toCodePoint(ch, low);
          utf8 += utf8Len(cp);
        }
      } else {
        utf8 += utf8Len(ch);
      }
    }
    return (utf8 <= utf16) ? JsonCharsets.UTF_8 : JsonCharsets.UTF_16BE;
  }

  private int utf8Len(int codePoint) {
    if (codePoint <= 0x7F || (codePoint >= 0xD800 && codePoint <= 0xDFFF)) {
      return 1;
    } else if (codePoint <= 0x7FF) {
      return 2;
    } else if (codePoint <= 0xFFFF) {
      return 3;
    } else if (codePoint <= 0x1FFFFF) {
      return 4;
    } else if (codePoint <= 0x3FFFFFF) {
      return 5;
    } else if (codePoint <= 0x7FFFFFFF) {
      return 6;
    }
    return 1;
  }
}

class ChainSequence implements CharSequence {
  private final CharSequence cs1, cs2;

  public ChainSequence(CharSequence cs1, CharSequence cs2) {
    this.cs1 = cs1;
    this.cs2 = cs2;
  }

  public char charAt(int index) {
    int len1 = cs1.length();
    if (index > len1) {
      cs2.charAt(index - len1);
    }
    return cs1.charAt(index);
  }

  public int length() {
    return cs1.length() + cs2.length();
  }

  public CharSequence subSequence(int start, int end) {
    throw new UnsupportedOperationException();
  }
}