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

package illegalargument.classversion;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Stack;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/**
 * Utility class for scanning class files for their versions.
 * 
 * @author McDowell
 */
public final class ClassScanner {

  private ClassScanner() {
  }

  /**
   * Reads the class version from a .class file input stream.
   * 
   * @param in
   *          the class binary as a stream
   * @return the version read from the class file
   * @throws IOException
   *           on an I/O exception or if the stream does not start with the
   *           magic bytes
   */
  public static ClassVersion readClassVersion(InputStream in)
      throws IOException {
    DataInputStream data = new DataInputStream(in);
    int magic = data.readInt();
    if (magic != 0xCAFEBABE) {
      throw new IOException("Invalid Java class");
    }
    int minor = 0xFFFF & data.readShort();
    int major = 0xFFFF & data.readShort();
    return new ClassVersion(major, minor);
  }

  /**
   * Reads the class version from a file. File must be a valid Java .class file.
   */
  public static ClassVersion readJavaVersion(File file)
      throws IOException {
    InputStream in = new FileInputStream(file);
    try {
      return readClassVersion(in);
    } finally {
      in.close();
    }
  }

  /**
   * Recursively walks a given directory, visiting contained classes and
   * reporting their versions.
   */
  public static void visitDirectory(final File directory,
      Visitor visitor) throws IOException {
    if (!directory.isDirectory()) {
      throw new IllegalArgumentException("Not directory: "
          + directory);
    }

    final Stack stack = new Stack();
    stack.push(directory);

    while (!stack.isEmpty()) {
      File dir = (File) stack.pop();
      File[] files = dir.listFiles();
      for (int i = 0; i < files.length; i++) {
        if (files[i].isDirectory()) {
          stack.push(files[i]);
        } else if (files[i].isFile()) {
          String name = files[i].getName();
          if (name.endsWith(".class")) {
            ClassVersion version = readJavaVersion(files[i]);
            visitor.visitClass(directory, toPath(directory,
                files[i]), version);
          }
        }
      }
    }
  }

  private static String toPath(File base, File file) {
    Stack nameStack = new Stack();
    while (!file.equals(base)) {
      nameStack.push(file.getName());
      file = file.getParentFile();
    }
    File ret = new File((String) nameStack.pop());
    while (!nameStack.isEmpty()) {
      ret = new File(ret, (String) nameStack.pop());
    }
    return ret.toString();
  }

  /**
   * Walks a given archive (e.g. a JAR file), visiting the .class files and
   * reporting their versions.
   */
  public static void visitArchive(File zipfile,
      Visitor visitor) throws IOException {
    ZipFile zip = new ZipFile(zipfile);
    try {
      Enumeration entries = zip.entries();
      while (entries.hasMoreElements()) {
        ZipEntry entry = (ZipEntry) entries.nextElement();
        if (!entry.isDirectory()
            && entry.getName().endsWith(".class")) {
          InputStream in = zip.getInputStream(entry);
          try {
            ClassVersion version = readClassVersion(in);
            visitor.visitClass(zipfile, entry.getName(),
                version);
          } finally {
            in.close();
          }
        }
      }
    } finally {
      zip.close();
    }
  }

  /**
   * Reports the .class version of a given file to the given visitor. The file
   * must be a valid class file.
   */
  public static void visitFile(File classFile,
      Visitor visitor) throws IOException {
    ClassVersion version = readJavaVersion(classFile);
    visitor.visitClass(classFile.getParentFile(), classFile
        .getName(), version);
  }

  /**
   * Returns true if the given file is a .zip or .jar file.
   */
  private static boolean isArchive(String name) {
    String[] exts = { ".jar", ".zip" };
    name = name.toLowerCase();
    for (int i = 0; i < exts.length; i++) {
      if (name.endsWith(exts[i])
          && name.length() > exts[i].length()) {
        return true;
      }
    }
    return false;
  }

  /**
   * Visits the given target and reports the class file version of any classes
   * contained within it. The target may be a class file, directory or Java
   * archive.
   */
  public static void visitTarget(File target,
      Visitor visitor) throws IOException {
    String name = target.getName();
    if (target.isDirectory()) {
      visitDirectory(target, visitor);
    } else if (name.endsWith(".class")) {
      visitFile(target, visitor);
    } else if (ClassScanner.isArchive(name)) {
      visitArchive(target, visitor);
    } else {
      throw new IOException("Invalid file: " + target);
    }
  }

  /**
   * Visitor interface for reporting class versions. Callers to
   * {@link ClassScanner} should implement this interface.
   * 
   * @author McDowell
   * @see ClassScanner
   */
  public static interface Visitor {

    /**
     * Method called for each class.
     * 
     * @param location
     *          the location passed to the visit algorithm
     * @param classFile
     *          the class file name or path relative to the location
     * @param version
     *          the class format version
     */
    public void visitClass(File location, String classFile,
        ClassVersion version);

  }

}
