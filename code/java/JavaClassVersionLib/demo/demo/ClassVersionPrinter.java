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

package demo;

import illegalargument.classversion.ClassScanner;
import illegalargument.classversion.ClassVersion;
import illegalargument.classversion.JavaVersion;

import java.io.File;
import java.io.IOException;

/**
 * Demo app that prints the class version of given class files.
 * 
 * @author McDowell
 */
public class ClassVersionPrinter {

  /**
   * Provide class directories, class archives and/or class files as arguments.
   */
  public static void main(String[] args) throws IOException {
    if (args.length == 0) {
      System.err
          .println("Provide Java archives, directories and/or class files as arguments");
      System.exit(1);
    }

    ClassScanner.Visitor visitor = new ClassScanner.Visitor() {
      public void visitClass(File location,
          String classFile, ClassVersion version) {
        System.out.println(location + "\t" + classFile
            + "\t" + version + "\t"
            + JavaVersion.forClassVersion(version));
      }
    };

    for (int i = 0; i < args.length; i++) {
      try {
        File file = new File(args[i]);
        ClassScanner.visitTarget(file, visitor);
      } catch (IOException e) {
        System.err.println("Error on " + args[0]);
        e.printStackTrace();
        System.exit(2);
      }
    }
  }

}
