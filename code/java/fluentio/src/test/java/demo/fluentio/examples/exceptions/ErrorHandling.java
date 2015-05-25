package demo.fluentio.examples.exceptions;

import static java.nio.charset.Charset.forName;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;

import demo.fluentio.Closer;
import demo.fluentio.Closers;
import demo.fluentio.IO;
import demo.fluentio.RuntimeIOException;

public class ErrorHandling {
  private static void writeTraceToFile(File file, Throwable t)
      throws IOException {
    OutputStream out = new FileOutputStream(file, true);
    Closeable resource = out;
    try {
      Writer writer = new OutputStreamWriter(out, forName("UTF-8"));
      resource = writer;
      PrintWriter pw = new PrintWriter(writer);
      resource = pw;
      t.printStackTrace(pw);
      if (pw.checkError()) {
        throw new IOException("Some I/O error happened. "
            + "I have no idea which one.");
      }
    } finally {
      resource.close();
    }
  }

  private static void writeTraceToFileHandled(File file, Throwable t)
      throws IOException {
    Closer closer = Closers.closer();
    try {
      PrintWriter pw = IO.open(closer, file, true).utf8().unchecked().printer()
          .die();
      t.printStackTrace(pw);
    } catch (RuntimeIOException e) {
      throw e.getIOException();
    } finally {
      closer.close();
    }
  }

  public static void main(String[] args) throws IOException {
    File log = new File("ErrorHandling.log");
    Exception error = new Exception("Just testing");
    try {
      writeTraceToFile(log, error);
      writeTraceToFileHandled(log, error);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
