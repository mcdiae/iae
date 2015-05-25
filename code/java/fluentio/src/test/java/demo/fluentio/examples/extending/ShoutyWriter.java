package demo.fluentio.examples.extending;

import java.io.IOException;
import java.io.Writer;

public class ShoutyWriter extends Writer {
  private final Writer decorated;

  public ShoutyWriter(Writer decorated) {
    this.decorated = decorated;
  }

  @Override
  public void close() throws IOException {
    decorated.close();
  }

  @Override
  public void flush() throws IOException {
    decorated.flush();
  }

  @Override
  public void write(char[] cbuf, int off, int len) throws IOException {
    for (int i = off, end = off + len; i < end; i++) {
      decorated.write(Character.toUpperCase(cbuf[i]));
    }
  }
}
