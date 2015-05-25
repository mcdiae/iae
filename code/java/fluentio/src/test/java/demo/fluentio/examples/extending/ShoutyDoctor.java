package demo.fluentio.examples.extending;

import java.io.Writer;

import demo.fluentio.Die;
import demo.fluentio.Doctor;
import demo.fluentio.IO;
import demo.fluentio.WriterDie;

public class ShoutyDoctor implements
    Doctor<WriterDie<ShoutyWriter>, Die<Writer>> {
  public static ShoutyDoctor SHOUTY = new ShoutyDoctor();

  private ShoutyDoctor() {}

  @Override
  public WriterDie<ShoutyWriter> op(Die<Writer> f) {
    Writer decorated = f.die();
    ShoutyWriter writer = new ShoutyWriter(decorated);
    return IO.writing(f.getCloser(), writer);
  }
}
