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
 * Application that tests the console mode.
 * 
 * @author McDowell
 * @see Kernel32#GetConsoleMode(Pointer, IntByReference)
 */
public class ConsoleMode {

  private static final Kernel32 KERNEL32 = Kernel32.INSTANCE;

  public static void main(String[] args) {
    Pointer hConsoleHandle = KERNEL32
        .GetStdHandle(Kernel32.STD_OUTPUT_HANDLE);
    IntByReference lpMode = new IntByReference();
    if (KERNEL32.GetConsoleMode(hConsoleHandle, lpMode)) {
      System.out.println("Console mode: "
          + lpMode.getValue());
    } else {
      System.err.println("Can't get console mode; reason: "
          + W32Utils.getLastError());
    }
  }

}
