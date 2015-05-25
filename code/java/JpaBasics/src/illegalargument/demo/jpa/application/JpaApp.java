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

package illegalargument.demo.jpa.application;

import illegalargument.demo.jpa.application.commands.Delete;
import illegalargument.demo.jpa.application.commands.Insert;
import illegalargument.demo.jpa.application.commands.Like;
import illegalargument.demo.jpa.application.commands.Select;
import illegalargument.demo.jpa.application.commands.SelectAll;
import illegalargument.demo.jpa.application.commands.Update;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
import java.util.TreeMap;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaApp {

  private EntityManagerFactory factory;
  private Map<String, Command> commands = new TreeMap<String, Command>();

  public JpaApp(Map<?, ?> properties) {
    factory = Persistence.createEntityManagerFactory("JpaBasics", properties);
    add(new Insert(), new SelectAll(), new Update(), new Delete(),
        new Select(), new Like());
  }

  public void close() {
    factory.close();
  }

  private void add(Command... cmds) {
    for (Command command : cmds) {
      commands.put(command.name(), command);
    }
  }

  private void printHelp() {
    System.out.println("Type 'help' for this help or 'exit' to exit");
    System.out.println("Commands:");
    for (Command command : commands.values()) {
      System.out.format("  %-10s Usage: %s%n", command.name(), command.usage());
    }
  }

  private void invoke(Command command, String[] cmds) {
    EntityManager manager = factory.createEntityManager();
    try {
      command.execute(manager, cmds);
    } catch (RuntimeException e) {
      e.printStackTrace();
    } finally {
      manager.close();
    }
  }

  public void exec() {
    printHelp();
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.print(": ");
      String line = scanner.nextLine().trim();
      String[] cmds = line.split("\\s+");
      if (cmds.length > 0) {
        if (cmds[0].equals("help")) {
          printHelp();
        } else if (cmds[0].equals("exit")) {
          return;
        } else {
          Command command = commands.get(cmds[0]);
          if (command == null) {
            System.err.println("Unknown command");
          } else {
            invoke(command, cmds);
          }
        }
      }
    }
  }

  public static void main(String[] args) {
    if (args.length == 0 || !(new File(args[0]).isFile())) {
      System.err.println("Args: orm.properties");
      System.exit(1);
    }
    Properties props = loadProperties(args[0]);
    JpaApp app = new JpaApp(props);
    try {
      app.exec();
    } finally {
      app.close();
    }
  }

  private static Properties loadProperties(String file) {
    Properties props = new Properties();
    try {
      InputStream in = new FileInputStream(file);
      try {
        props.load(in);
      } finally {
        in.close();
      }
    } catch (IOException e) {
      throw new IllegalStateException(e);
    }
    return props;
  }

}
