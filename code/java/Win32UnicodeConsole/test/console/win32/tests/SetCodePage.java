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

import console.win32.Kernel32;

/**
 * Sample app that can get or set code page
 * 
 * @author McDowell
 * @see Kernel32#GetConsoleCP()
 * @see Kernel32#GetConsoleOutputCP()
 * @see Kernel32#SetConsoleCP(int)
 * @see Kernel32#SetConsoleOutputCP(int)
 */
public class SetCodePage {

  private static Kernel32 KERNEL32 = Kernel32.INSTANCE;

  private static void reportCodePage() {
    System.out.println("Input CP:\t"
        + KERNEL32.GetConsoleCP());
    System.out.println("Output CP:\t"
        + KERNEL32.GetConsoleCP());
  }

  private static void setCodePage(String cp) {
    int wCodePageID;
    try {
      wCodePageID = Integer.parseInt(cp);
    } catch (NumberFormatException e) {
      System.err
          .println("Value must be MS code page identifier");
      return;
    }

    if (!KERNEL32.SetConsoleCP(wCodePageID)) {
      printLastError();
      return;
    }

    if (!KERNEL32.SetConsoleOutputCP(wCodePageID)) {
      printLastError();
      return;
    }

    reportCodePage();
    System.out.println("Changed to CP:\t" + wCodePageID);
  }

  private static void printLastError() {
    System.err.println(W32Utils.getLastError());
  }

  /**
   * @param args
   *          (optional) a code page identifier to set
   */
  public static void main(String[] args) {
    switch (args.length) {
    case 0:
      reportCodePage();
      break;
    case 1:
      setCodePage(args[0]);
      break;
    default:
      System.err.println("Wrong number of arguments");
      break;
    }
  }

}
