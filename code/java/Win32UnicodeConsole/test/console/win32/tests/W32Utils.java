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

package console.win32.tests;

import com.sun.jna.Pointer;
import com.sun.jna.ptr.IntByReference;

import console.win32.Kernel32;

/**
 * Common utility methods.
 * 
 * @author McDowell
 */
public class W32Utils {

  private static final Kernel32 KERNEL32 = Kernel32.INSTANCE;

  /**
   * @return the last error from the underlying system
   * @see Kernel32#GetLastError()
   * @see Kernel32#FormatMessageW(int, Pointer, int, int, char[], int, Pointer)
   */
  public static String getLastError() {
    int dwMessageId = KERNEL32.GetLastError();
    return getLastError(dwMessageId);
  }

  private static String getLastError(int dwMessageId) {
    char[] lpBuffer = new char[1024];
    int lenW = KERNEL32.FormatMessageW(
        Kernel32.FORMAT_MESSAGE_FROM_SYSTEM
            | Kernel32.FORMAT_MESSAGE_IGNORE_INSERTS, null,
        dwMessageId, 0, lpBuffer, lpBuffer.length, null);
    return new String(lpBuffer, 0, lenW);
  }

  /**
   * Writes the given message to the console.
   * 
   * @param hConsoleOutput
   *          the handle to the console
   * @param message
   *          the message to output
   * @see Kernel32#GetStdHandle(int)
   * @see Kernel32#WriteConsoleW(Pointer, char[], int, IntByReference, Pointer)
   */
  public static void writeToConsole(Pointer hConsoleOutput,
      String message) {
    char[] lpBuffer = message.toCharArray();
    IntByReference lpNumberOfCharsWritten = new IntByReference();
    if (!KERNEL32.WriteConsoleW(hConsoleOutput, lpBuffer,
        lpBuffer.length, lpNumberOfCharsWritten, null)) {
      String error = W32Utils.getLastError();
      throw new IllegalStateException(error);
    }
  }

  /**
   * Reads a line of text from the console.
   * 
   * @param hConsoleInput
   *          a handle to the input source
   * @return a line of text including the line terminator
   * @see Kernel32#GetStdHandle(int)
   * @see Kernel32#ReadConsoleW(Pointer, char[], int, IntByReference, Pointer)
   */
  public static String readFromConsole(Pointer hConsoleInput) {
    StringBuilder line = new StringBuilder();
    char[] lpBuffer = new char[128];
    IntByReference lpNumberOfCharsRead = new IntByReference();
    while (true) {
      if (!Kernel32.INSTANCE.ReadConsoleW(hConsoleInput,
          lpBuffer, lpBuffer.length, lpNumberOfCharsRead,
          null)) {
        String errMsg = getLastError();
        throw new IllegalStateException(errMsg);
      }
      int len = lpNumberOfCharsRead.getValue();
      if (len == 0) {
        return null;
      }
      line.append(lpBuffer, 0, len);
      if (lpBuffer[len - 1] == '\n') {
        break;
      }
    }
    return line.toString();
  }

  /**
   * Writes the data to the file handle using the given encoding.
   * 
   * @param hFile
   *          the handle to the output (e.g. stdout)
   * @param codePage
   *          a Windows code page identifier
   * @param message
   *          the data to write
   * @see Kernel32#GetStdHandle(int)
   * @see Kernel32#WriteFile(Pointer, byte[], int, IntByReference, Pointer)
   * @see #encode(int, String)
   */
  public static void writeToFile(Pointer hFile,
      int codePage, String message) {
    byte[] lpBuffer = encode(codePage, message);
    IntByReference written = new IntByReference();
    if (!KERNEL32.WriteFile(hFile, lpBuffer,
        lpBuffer.length, written, null)) {
      String error = W32Utils.getLastError();
      throw new IllegalStateException(error);
    }
  }

  /**
   * Reads a line of text from the given source, decoding as the given code
   * page.
   * 
   * @param hConsoleInput
   *          the handle to the input
   * @param codePage
   *          the code page identifier
   * @return a line of text including line terminator
   * @see Kernel32#GetStdHandle(int)
   * @see Kernel32#ReadFile(Pointer, byte[], int, IntByReference, Pointer)
   * @see #decode(int, byte[])
   */
  public static String readFromFile(Pointer hConsoleInput,
      int codePage) {
    byte[] endl = encode(codePage, "\n");
    ByteArrayBuilder out = new ByteArrayBuilder();
    byte[] lpBuffer = new byte[1];
    IntByReference lpNumberOfBytesRead = new IntByReference();
    while (true) {
      if (!KERNEL32.ReadFile(hConsoleInput, lpBuffer,
          lpBuffer.length, lpNumberOfBytesRead, null)) {
        throw new IllegalStateException(getLastError());
      }

      int lenA = lpNumberOfBytesRead.getValue();
      if (lenA == 0) {
        return null;
      }
      out.append(lpBuffer, 0, lenA);
      if (out.endsWith(endl)) {
        break;
      }
    }
    byte[] data = out.getBackingArray();
    return decode(codePage, data);
  }

  /**
   * Encodes a String into the given character encoding (codePage).
   * 
   * @param codePage
   *          the Windows code page identifier
   * @param message
   *          the input String (wchar_t*)
   * @return the encoded bytes (char*)
   * @see Kernel32#WideCharToMultiByte(int, int, char[], int, byte[], int,
   *      Pointer, Pointer)
   */
  public static byte[] encode(int codePage, String message) {
    char[] lpWideCharStr = message.toCharArray();
    int lenA = KERNEL32.WideCharToMultiByte(codePage, 0,
        lpWideCharStr, lpWideCharStr.length, null, 0, null,
        null);
    byte[] lpMultiByteStr = new byte[lenA];
    KERNEL32.WideCharToMultiByte(codePage, 0,
        lpWideCharStr, lpWideCharStr.length,
        lpMultiByteStr, lpMultiByteStr.length, null, null);
    return lpMultiByteStr;
  }

  /**
   * Decodes the input data using the given character encoding (codePage).
   * 
   * @param codePage
   *          the Windows code page identifier
   * @param lpMultiByteStr
   *          the "ANSI" String form (char*)
   * @return the decoded String (wchar_t*)
   * @see Kernel32#MultiByteToWideChar(int, int, byte[], int, char[], int)
   */
  public static String decode(int codePage,
      byte[] lpMultiByteStr) {
    int lenW = KERNEL32.MultiByteToWideChar(codePage, 0,
        lpMultiByteStr, lpMultiByteStr.length, null, 0);
    char[] lpWideCharStr = new char[lenW];
    KERNEL32.MultiByteToWideChar(codePage, 0,
        lpMultiByteStr, lpMultiByteStr.length,
        lpWideCharStr, lpWideCharStr.length);
    return new String(lpWideCharStr);
  }

  /**
   * A quick'n'dirty StringBuilder style class for byte arrays
   */
  private static class ByteArrayBuilder {

    private byte[] buffer = {};

    public void append(byte[] data, int offset, int len) {
      if (offset < 0 || len < 0) {
        throw new IllegalArgumentException();
      }
      byte[] newBuffer = new byte[buffer.length + len];
      System.arraycopy(buffer, 0, newBuffer, 0,
          buffer.length);
      System.arraycopy(data, offset, newBuffer,
          buffer.length, len);
      buffer = newBuffer;
    }

    public boolean endsWith(byte[] data) {
      if (data.length > buffer.length) {
        return false;
      }
      for (int i = 0; i < data.length; i++) {
        if (buffer[buffer.length - data.length + i] != data[i]) {
          return false;
        }
      }
      return true;
    }

    public byte[] getBackingArray() {
      return buffer;
    }

  }

}
