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
 * Sample app that reads Unicode from the console.
 * 
 * @author McDowell
 * @see Kernel32#ReadConsoleW(Pointer, char[], int, IntByReference, Pointer)
 */
public class ReadUnicode {

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

  private static String readLine() {
    Pointer hConsoleInput = KERNEL32
        .GetStdHandle(Kernel32.STD_INPUT_HANDLE);
    IntByReference lpMode = new IntByReference();
    if (KERNEL32.GetConsoleMode(hConsoleInput, lpMode)) {
      return W32Utils.readFromConsole(hConsoleInput);
    } else {
      int codePage = Kernel32.CP_ACP; // default system ANSI CP
      return W32Utils.readFromFile(hConsoleInput, codePage);
    }
  }

  public static void main(String[] args) {
    stdout("ENTER TEXT: ");
    String line = readLine();
    stdout("You wrote: " + line);
  }

}
