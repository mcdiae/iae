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

import console.win32.Kernel32;

/**
 * Sample app that prints UTF-8 Unicode characters to the console.
 * 
 * @author McDowell
 * @see Kernel32#SetConsoleOutputCP(int)
 * @see Kernel32#WriteFile(Pointer, byte[], int, com.sun.jna.ptr.IntByReference,
 *      Pointer)
 */
public class PrintUtf8 {

  private static final Kernel32 KERNEL32 = Kernel32.INSTANCE;

  private static final int UTF_8 = 65001;

  public static void main(String[] args) {
    int oldOutputCodePage = KERNEL32.GetConsoleOutputCP();
    try {
      KERNEL32.SetConsoleOutputCP(UTF_8);

      Pointer stdout = KERNEL32
          .GetStdHandle(Kernel32.STD_OUTPUT_HANDLE);

      W32Utils.writeToFile(stdout, UTF_8,
          "Cyrillic Ya: \u044F\r\n");
    } finally {
      KERNEL32.SetConsoleOutputCP(oldOutputCodePage);
    }
  }

}
