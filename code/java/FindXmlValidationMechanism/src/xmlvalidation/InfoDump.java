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
package xmlvalidation;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;

/**
 * Main class that outputs validation information for a given XML file.
 * 
 * @author McDowell
 */
public class InfoDump {

  /**
   * @param args
   *          xml files
   */
  public static void main(String[] args) {
    if (args.length == 0) {
      System.err.println("XML files expected as arguments");
      return;
    }

    ValidationInfoFactory factory = new ValidationInfoFactory();

    try {

      for (String arg : args) {
        File file = new File(arg);
        Source source = new StreamSource(file);
        ValidationInfo info = factory
            .getValidationMechanism(source);
        print(System.out, file, info);
      }

    } catch (IOException e) {
      System.err.println("Error: " + e);
    }
  }

  private static void print(PrintStream out, File file,
      ValidationInfo info) {
    out.print("File: ");
    out.println(file);
    out.print("Root element:\t");
    out.println(info.getRootElementName());
    out.print("Namespace:\t");
    out.println(info.getNamespace());
    out.print("DTD name:\t");
    out.println(info.getDtdPublicId());
    out.print("DTD URI:\t");
    out.println(info.getDtdSystemId());
    out.print("Schema: \t");
    out.println(info.getSchemaLocation());
    out.print("No namespace schema:\t");
    out.println(info.getNoNamespaceSchemaLocation());
    out.println();
  }

}
