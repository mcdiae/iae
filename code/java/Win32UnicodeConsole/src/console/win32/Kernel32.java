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

package console.win32;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.IntByReference;

/**
 * <a href="https://jna.dev.java.net/">JNA</a> interface.
 * 
 * This interface was designed and tested on Windows XP. All methods map to
 * WIN32 API functions.
 * 
 * @author McDowell
 * @see #INSTANCE
 */
public interface Kernel32 extends Library {

  /**
   * Interface instance. Not thread safe.
   */
  public static Kernel32 INSTANCE = (Kernel32) Native
      .loadLibrary("Kernel32", Kernel32.class);

  /** @see #ReadFile(Pointer, byte[], int, IntByReference, Pointer) */
  public static int ERROR_HANDLE_EOF = 38;

  /** @see #GetStdHandle(int) */
  public static int STD_INPUT_HANDLE = -10;

  /** @see #GetStdHandle(int) */
  public static int STD_OUTPUT_HANDLE = -11;

  /** @see #GetStdHandle(int) */
  public static int STD_ERROR_HANDLE = -12;

  /**
   * @see #FormatMessageW(int, Pointer, int, int, char[], int, Pointer)
   */
  public static int FORMAT_MESSAGE_FROM_SYSTEM = 4096;

  /**
   * @see #FormatMessageW(int, Pointer, int, int, char[], int, Pointer)
   */
  public static int FORMAT_MESSAGE_IGNORE_INSERTS = 512;

  /**
   * @see Kernel32#WideCharToMultiByte(int, int, char[], int, byte[], int,
   *      Pointer, Pointer)
   */
  public static int CP_ACP = 0;

  /**
   * <a
   * href="http://msdn.microsoft.com/en-us/library/ms683231.aspx">GetStdHandle</a>
   */
  public Pointer GetStdHandle(int nStdHandle);

  /**
   * <a
   * href="http://msdn.microsoft.com/en-us/library/ms687401(VS.85).aspx">WriteConsoleW</a>
   */
  public boolean WriteConsoleW(Pointer hConsoleOutput,
      char[] lpBuffer, int nNumberOfCharsToWrite,
      IntByReference lpNumberOfCharsWritten,
      Pointer lpReserved);

  /**
   * <a
   * href="http://msdn.microsoft.com/en-us/library/aa365747(VS.85).aspx">WriteFile</a>
   */
  public boolean WriteFile(Pointer hFile, byte[] lpBuffer,
      int nNumberOfBytesToWrite,
      IntByReference lpNumberOfBytesWritten,
      Pointer lpOverlapped);

  /**
   * <a
   * href="http://msdn.microsoft.com/en-us/library/ms683162(VS.85).aspx">GetConsoleCP</a>
   */
  public int GetConsoleCP();

  /**
   * <a
   * href="http://msdn.microsoft.com/en-us/library/ms686013(VS.85).aspx">SetConsoleCP</a>
   */
  public boolean SetConsoleCP(int wCodePageID);

  /**
   * <a
   * href="http://msdn.microsoft.com/en-us/library/ms683169(VS.85).aspx">GetConsoleOutputCP</a>
   */
  public int GetConsoleOutputCP();

  /**
   * <a
   * href="http://msdn.microsoft.com/en-us/library/ms686036(VS.85).aspx">SetConsoleOutputCP</a>
   */
  public boolean SetConsoleOutputCP(int wCodePageID);

  /**
   * <a
   * href="http://msdn.microsoft.com/en-us/library/ms683167(VS.85).aspx">GetConsoleMode</a>
   */
  public boolean GetConsoleMode(Pointer hConsoleHandle,
      IntByReference lpMode);

  /**
   * <a
   * href="http://msdn.microsoft.com/en-us/library/dd319072(VS.85).aspx">MultiByteToWideChar</a>
   */
  public int MultiByteToWideChar(int CodePage, int dwFlags,
      byte[] lpMultiByteStr, int cbMultiByte,
      char[] lpWideCharStr, int cchWideChar);

  /**
   * <a
   * href="http://msdn.microsoft.com/en-us/library/dd374130(VS.85).aspx">WideCharToMultiByte</a>
   */
  public int WideCharToMultiByte(int CodePage, int dwFlags,
      char[] lpWideCharStr, int cchWideChar,
      byte[] lpMultiByteStr, int cbMultiByte,
      Pointer lpDefaultChar, Pointer lpUsedDefaultChar);

  /**
   * <a
   * href="http://msdn.microsoft.com/en-us/library/ms684958.aspx">ReadConsoleW</a>
   */
  public boolean ReadConsoleW(Pointer hConsoleInput,
      char[] lpBuffer, int nNumberOfCharsToRead,
      IntByReference lpNumberOfCharsRead,
      Pointer pInputControl);

  /**
   * <a
   * href="http://msdn.microsoft.com/en-us/library/aa365467(VS.85).aspx">ReadFile</a>
   */
  public boolean ReadFile(Pointer hFile, byte[] lpBuffer,
      int nNumberOfBytesToRead,
      IntByReference lpNumberOfBytesRead,
      Pointer lpOverlapped);

  /**
   * <a
   * href="http://msdn.microsoft.com/en-us/library/ms679360(VS.85).aspx">GetLastError</a>
   */
  public int GetLastError();

  /**
   * <a
   * href="http://msdn.microsoft.com/en-us/library/ms679351(VS.85).aspx">FormatMessage</a>
   */
  public int FormatMessageW(int dwFlags, Pointer lpSource,
      int dwMessageId, int dwLanguageId, char[] lpBuffer,
      int nSize, Pointer Arguments);

}
