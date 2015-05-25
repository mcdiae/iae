package demo.fluentio.examples.exceptions;

import static demo.fluentio.Closers.uncheckedCloser;
import static demo.fluentio.Doctors.GZIP_OUT;
import static java.nio.charset.Charset.forName;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.zip.GZIPOutputStream;

import demo.fluentio.IO;
import demo.fluentio.UncheckedCloser;

public class EliminatingCatch {

  public static void main(String[] args) {
    String data = "Certainly an Englishman, it was more doubtful whether Phileas Fogg was a Londoner. "
        + "He was never seen on 'Change, nor at the Bank, nor in the counting-rooms of the \"City\"; "
        + "no ships ever came into London docks of which he was the owner; "
        + "he had no public employment; "
        + "he had never been entered at any of the Inns of Court, either at the Temple, or Lincoln's Inn, or Gray's Inn; "
        + "nor had his voice ever resounded in the Court of Chancery, or in the Exchequer, or the Queen's Bench, or the Ecclesiastical Courts. "
        + "He certainly was not a manufacturer; "
        + "nor was he a merchant or a gentleman farmer. "
        + "His name was strange to the scientific and learned societies, and he never was known to take part in the sage deliberations of the Royal Institution or the London Institution, the Artisan's Association, or the Institution of Arts and Sciences. "
        + "He belonged, in fact, to none of the numerous societies which swarm in the English capital, from the Harmonic to that of the Entomologists, founded mainly for the purpose of abolishing pernicious insects.";
    System.out.format("%d chars compress to %d bytes%n", data.length(),
        gzip(data).length);
    System.out.format("%d chars compress to %d bytes%n", data.length(),
        fluentGzip(data).length);
  }

  private static byte[] gzip(String data) {
    ByteArrayOutputStream buffer = new ByteArrayOutputStream();
    try {
      OutputStream gzip = new GZIPOutputStream(buffer);
      Closeable resource = gzip;
      try {
        Writer writer = new OutputStreamWriter(gzip, forName("UTF-8"));
        resource = writer;
        writer.write(data);
      } finally {
        resource.close();
      }
    } catch (IOException e) {
      throw new IllegalStateException(e);
    }
    return buffer.toByteArray();
  }

  private static byte[] fluentGzip(String data) {
    ByteArrayOutputStream buffer = new ByteArrayOutputStream();
    UncheckedCloser closer = uncheckedCloser();
    try {
      IO.out(closer, buffer).operate(GZIP_OUT).utf8().printer().die().write(
          data);
    } finally {
      closer.close();
    }
    return buffer.toByteArray();
  }
}
