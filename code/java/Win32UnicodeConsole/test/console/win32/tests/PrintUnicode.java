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
 * Sample app that prints Unicode (UTF-16) characters to the console.
 * 
 * @author McDowell
 * @see Kernel32#WriteConsoleW(Pointer, char[], int, IntByReference, Pointer)
 */
public class PrintUnicode {

  private static final Kernel32 KERNEL32 = Kernel32.INSTANCE;

  private static void print(int nStdHandle, String message) {
    Pointer hConsoleOutput = KERNEL32
        .GetStdHandle(nStdHandle);
    IntByReference lpMode = new IntByReference();
    if (KERNEL32.GetConsoleMode(hConsoleOutput, lpMode)) {
      W32Utils.writeToConsole(hConsoleOutput, message);
    } else {
      int codePage = Kernel32.CP_ACP; // default system ANSI CP
      W32Utils.writeToFile(hConsoleOutput, codePage,
          message);
    }
  }

  /** instead of System.out.print */
  private static void stdout(String message) {
    print(Kernel32.STD_OUTPUT_HANDLE, message);
  }

  /** instead of System.err.print */
  private static void stderr(String message) {
    print(Kernel32.STD_ERROR_HANDLE, message);
  }

  public static void main(String[] args) {
    String[] messages = { "Hello, World!",
        "Pound symbol: \u00A3", "Cyrillic Ya: \u044F" };
    for (String msg : messages) {
      stdout(msg + "\r\n");
      stderr(msg + "\r\n");
    }
  }

}
