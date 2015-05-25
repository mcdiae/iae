package demo.fluentio.examples.extending;

import static demo.fluentio.Closers.SHUT;
import static demo.fluentio.examples.extending.ShoutyDoctor.SHOUTY;
import static java.nio.charset.Charset.defaultCharset;

import java.io.PrintWriter;

import demo.fluentio.IO;

public class Shouter {
  public static void main(String[] args) {
    PrintWriter shouter = IO.out(SHUT, System.out).encode(defaultCharset())
        .operate(SHOUTY).printer().die();

    shouter.println("Would you like to play a game?");
    shouter.flush();
  }
}
