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

package illegalargument.demo.ejb3.client;

import illegalargument.demo.ejb3.remote.CountCharacters;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class CountApp {

  private static final String JNDI_KEY = "illegalargument.bean.jndi.name";

  public static void main(String[] args) throws NamingException, IOException {
    if (args.length != 1) {
      System.err.println("Provide JNDI config properties as argument");
      System.exit(1);
    }
    Properties props = loadProperties(args[0]);
    String jndiName = props.getProperty(JNDI_KEY);

    String helloWorld = "Hello, World!";

    Context context = new InitialContext(props);
    CountCharacters impl = (CountCharacters) context.lookup(jndiName);
    int count = impl.countCharacters(helloWorld);
    System.out.format("String '%s' has %d chars%n", helloWorld, count);
  }

  private static Properties loadProperties(String filename) throws IOException {
    Properties props = new Properties();
    InputStream in = new FileInputStream(filename);
    try {
      props.load(in);
    } finally {
      in.close();
    }
    return props;
  }

}
