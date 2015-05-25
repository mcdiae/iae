/*
Copyright (c) 2010 McDowell

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

package demo.fluentio;

import static demo.fluentio.InternalUtils.notNull;
import static demo.fluentio.InternalUtils.typeCast;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.jar.JarInputStream;
import java.util.jar.JarOutputStream;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;


/**
 * A collection of useful {@link Doctor} implementations. The static members are
 * immutable.
 * <p>
 * Design note: some common {@code StreamBuilder} stream wrappers are provided
 * as {@code Doctor} implementations (instead of methods) because their
 * constructors throw an {@code IOException}. This allows callers to choose
 * between exception handling via {@link Doctorable#doctor(Doctor)} or
 * {@link Operable#operate(Doctor)}.
 * </p>
 * 
 * @author McDowell
 */
public final class Doctors {
  private Doctors() {}

  /**
   * Decorates the argument with unchecked exception handling. Mutability is
   * dependent on the decorated object.
   * 
   * @param <A>
   *          the resultant type
   * @param <B>
   *          the input type
   * @param checked
   *          the checked {@code Doctor}
   * @return a type that throws runtime exceptions
   */
  public static <A, B> UncheckedDoctor<A, B> unchecked(
      final Doctor<A, B> checked) {
    class UncheckedDoctorImpl implements UncheckedDoctor<A, B> {
      @Override
      public A op(B f) throws RuntimeIOException {
        try {
          return checked.op(f);
        } catch (IOException e) {
          throw new RuntimeIOException(e);
        }
      }
    }

    InternalUtils.notNull(checked);
    return new UncheckedDoctorImpl();
  }

  /**
   * Chains two operations together so that the output of the first is fed into
   * the second.
   * 
   * @param <I>
   *          the input type
   * @param <O>
   *          the resultant type
   * @param <X>
   *          the common intermediate type
   * @param first
   *          the first operation that will be invoked
   * @param second
   *          the second operation that will be invoked
   * @return the chained operations
   */
  public static <I, O, X> Doctor<O, I> chain(final Doctor<X, I> first,
      Doctor<O, ?> second) {
    final Doctor<O, X> typed = InternalUtils.typeCast(second);
    class ChainDoctor implements Doctor<O, I> {
      @Override
      public O op(I f) throws IOException {
        return typed.op(first.op(f));
      }
    }

    notNull(first);
    notNull(second);
    return new ChainDoctor();
  }

  /**
   * {@link Doctor} that adapts the {@code Scanner} to {@code Closeable}, sets
   * it in the {@link Closer}, and then returns it. If
   * {@code Scanner#ioException()} is not null, {@code Closer#close()} will
   * throw it.
   */
  public static final UncheckedDoctor<Scanner, Die<Reader>> SCANNER = new UncheckedDoctor<Scanner, Die<Reader>>() {
    @Override
    public Scanner op(final Die<Reader> f) {
      InternalUtils.notNull(f);
      final Scanner scanner = new Scanner(f.die());

      class ScannerCloseable implements Closeable {
        @Override
        public void close() throws IOException {
          scanner.close();
          if (scanner.ioException() != null) {
            throw scanner.ioException();
          }
        }
      }

      f.getCloser().using(new ScannerCloseable());
      return scanner;
    }
  };

  /**
   * {@link Doctor} that drains a {@code Reader} into a {@code String}. The
   * {@code Closer} is not used.
   */
  public static final Doctor<String, Die<Reader>> STRING = new Doctor<String, Die<Reader>>() {
    @Override
    public String op(Die<Reader> f) throws IOException {
      return Drains.drain(f.die(), new StringBuilder()).toString();
    }
  };

  /**
   * {@link Doctor} that drains an {@code InputStream} into a byte array. The
   * {@code Closer} is not used.
   */
  public static final Doctor<byte[], Die<InputStream>> BYTES = new Doctor<byte[], Die<InputStream>>() {
    @Override
    public byte[] op(Die<InputStream> src) throws IOException {
      return Drains.drain(src.die(), new ByteArrayOutputStream()).toByteArray();
    }
  };

  private static class P {
    // inner class for lazy loading
    private static final Pattern LINEDELIMITER = Pattern
        .compile("\r\n|[\n\r\u2028\u2029\u0085]");
  }

  /**
   * <p>
   * {@link Doctor} that adapts a {@code Reader} to an {@code Iterable} sequence
   * of lines. Calling the {@code java.util.Iterator} drains the {@code Reader}.
   * </p>
   * <p>
   * The following character sequences are used as line delimiters:
   * </p>
   * <ul>
   * <li>\r\n (CARRIAGE RETURN, LINE FEED)</li>
   * <li>\n (LINE FEED)</li>
   * <li>\r (CARRIAGE RETURN)</li>
   * <li>U+2028 (LINE SEPARATOR)</li>
   * <li>U+2029 (PARAGRAPH SEPARATOR)</li>
   * <li>U+0085 (NEXT LINE [NEL])</li>
   * </ul>
   */
  public static final Doctor<Iterable<String>, Die<Reader>> LINES = new Doctor<Iterable<String>, Die<Reader>>() {
    @Override
    public Iterable<String> op(Die<Reader> f) {
      final Scanner scanner = SCANNER.op(f).useDelimiter(P.LINEDELIMITER);
      return new Iterable<String>() {
        @Override
        public Iterator<String> iterator() {
          return scanner;
        }
      };
    }
  };

  public static final Doctor<InputDie<ObjectInputStream>, Die<InputStream>> OBJECT_IN = new Doctor<InputDie<ObjectInputStream>, Die<InputStream>>() {
    @Override
    public InputDie<ObjectInputStream> op(Die<InputStream> f)
        throws IOException {
      return IO.in(f.getCloser(), new ObjectInputStream(f.die()));
    }
  };

  public static final Doctor<OutputDie<ObjectOutputStream>, Die<OutputStream>> OBJECT_OUT = new Doctor<OutputDie<ObjectOutputStream>, Die<OutputStream>>() {
    @Override
    public OutputDie<ObjectOutputStream> op(Die<OutputStream> f)
        throws IOException {
      return IO.out(f.getCloser(), new ObjectOutputStream(f.die()));
    }
  };

  public static final Doctor<InputDie<GZIPInputStream>, Die<InputStream>> GZIP_IN = new Doctor<InputDie<GZIPInputStream>, Die<InputStream>>() {
    @Override
    public InputDie<GZIPInputStream> op(Die<InputStream> f) throws IOException {
      return IO.in(f.getCloser(), new GZIPInputStream(f.die()));
    }
  };

  public static final Doctor<OutputDie<GZIPOutputStream>, Die<OutputStream>> GZIP_OUT = new Doctor<OutputDie<GZIPOutputStream>, Die<OutputStream>>() {
    @Override
    public OutputDie<GZIPOutputStream> op(Die<OutputStream> f)
        throws IOException {
      return IO.out(f.getCloser(), new GZIPOutputStream(f.die()));
    }
  };

  public static <O extends OutputStream, OO extends Die<O>> Doctor<OutputDie<GZIPOutputStream>, OO> gzipOut() {
    return typeCast(GZIP_OUT);
  }

  public static final Doctor<InputDie<JarInputStream>, Die<InputStream>> JAR_IN = new Doctor<InputDie<JarInputStream>, Die<InputStream>>() {
    @Override
    public InputDie<JarInputStream> op(Die<InputStream> f) throws IOException {
      return IO.in(f.getCloser(), new JarInputStream(f.die()));
    }
  };

  public static final Doctor<OutputDie<JarOutputStream>, Die<OutputStream>> JAR_OUT = new Doctor<OutputDie<JarOutputStream>, Die<OutputStream>>() {
    @Override
    public OutputDie<JarOutputStream> op(Die<OutputStream> f)
        throws IOException {
      return IO.out(f.getCloser(), new JarOutputStream(f.die()));
    }
  };

  private static final String BOM_CHAR = "\uFEFF";

  /**
   * Writes the Unicode byte order mark character (U+FEFF) and returns a new
   * {@code closer.WriterDie}.
   */
  public static <T extends Writer> Doctor<WriterDie<T>, WriterDie<T>> bom() {
    class BomDoctor implements Doctor<WriterDie<T>, WriterDie<T>> {
      @Override
      public WriterDie<T> op(WriterDie<T> f) throws IOException {
        T writer = f.die();
        writer.write(BOM_CHAR);
        return IO.writing(f.getCloser(), writer);
      }
    }

    return new BomDoctor();
  }

  private static class BOMS {
    // inner class for lazy loading
    /** Order is significant. */
    private static final List<Charset> ENCODINGS = Arrays.asList(c("UTF-32BE"),
        c("UTF-32LE"), c("UTF-8"), c("UTF-16BE"), c("UTF-16LE"));
    private static final List<byte[]> BOMS = boms(new ArrayList<byte[]>(
        ENCODINGS.size()));

    private static Charset c(String charsetName) {
      return Charset.forName(charsetName);
    }

    private static List<byte[]> boms(List<byte[]> list) {
      for (Charset charset : ENCODINGS) {
        list.add(encodedBom(charset));
      }
      return list;
    }

    private static byte[] encodedBom(Charset charset) {
      ByteArrayOutputStream out = new ByteArrayOutputStream();
      PrintWriter pw = IO.out((Closer) Closers.SHUT, (OutputStream) out)
          .encode(charset).printer().die();
      pw.write(BOM_CHAR);
      pw.close();
      return out.toByteArray();
    }
  }

  /**
   * <p>
   * Detects the encoding of a character data by the presence of the Unicode
   * byte order mark at the start of the stream. Usage of this class as a
   * general encoding discovery method is discouraged - ideally, use it on
   * character-based file formats where the BOM is required. Always prefer a
   * known encoding via {@link InputDie#decode(Charset)}.
   * </p>
   * <ul>
   * <li>If the BOM is present for a supported Unicode encoding, that encoding
   * is used.</li>
   * <li>If the BOM is absent, {@link Charset#defaultCharset()} is used.</li>
   * </ul>
   * <p>
   * Supported encodings: UTF-8, UTF-16BE, UTF-16LE, UTF-32BE, UTF-32LE.
   * </p>
   * 
   * @see InputStreamReader#getEncoding()
   */
  public static final Doctor<ReaderDie<InputStreamReader>, InputDie<InputStream>> DETECT_BOM = new Doctor<ReaderDie<InputStreamReader>, InputDie<InputStream>>() {
    @Override
    public ReaderDie<InputStreamReader> op(InputDie<InputStream> f)
        throws IOException {
      Closer closer = f.getCloser();
      InputStream buffer = closer.using(new BufferedInputStream(f.die()));
      Charset encoding = getEncoding(buffer);
      return IO.reading(closer, new InputStreamReader(buffer, encoding));
    }

    private Charset getEncoding(InputStream in) throws IOException {
      charsetLoop: for (int i = 0, len = BOMS.BOMS.size(); i < len; i++) {
        byte[] bom = BOMS.BOMS.get(i);
        in.mark(bom.length);
        for (byte b : bom) {
          if ((0xFF & b) != in.read()) {
            in.reset();
            continue charsetLoop;
          }
        }
        return BOMS.ENCODINGS.get(i);
      }
      return Charset.defaultCharset();
    }
  };
}
