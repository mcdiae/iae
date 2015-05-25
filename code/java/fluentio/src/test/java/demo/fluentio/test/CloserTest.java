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

package demo.fluentio.test;

import static demo.fluentio.Closers.closer;

import java.io.Closeable;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import demo.fluentio.Closer;
import demo.fluentio.Closers;
import demo.fluentio.CoupledCloser;
import demo.fluentio.RuntimeIOException;
import demo.fluentio.UncheckedCloser;
import demo.fluentio.UncheckedCoupledCloser;

public class CloserTest {

  @Test
  public void testCloser() throws IOException {
    Closer closer = closer();
    // check null handling
    closer.close();

    C c = closer.using(new C());
    c.close();
    Assert.assertTrue(c.closed);
  }

  @Test
  public void testCoupledClose() throws IOException {
    CoupledCloser closer = Closers.coupledCloser();
    // check null handling
    closer.close();

    C c1 = closer.in().using(new C());
    C c2 = closer.out().using(new C());

    closer.close();
    Assert.assertTrue(c1.closed);
    Assert.assertTrue(c2.closed);
  }

  @Test
  public void testUncheckedCoupledClose() {
    UncheckedCoupledCloser closer = Closers.uncheckedCoupledCloser();
    // check null handling
    closer.close();

    C c1 = closer.in().using(new C());
    C c2 = closer.out().using(new C());

    closer.close();
    Assert.assertTrue(c1.closed);
    Assert.assertTrue(c2.closed);
  }

  @Test
  public void testRuntimeException() {
    Closeable c = new Closeable() {
      @Override
      public void close() throws IOException {
        throw new IOException();
      }
    };

    {
      UncheckedCloser closer = Closers.uncheckedCloser();
      try {
        closer.using(c);
        closer.close();
        Assert.fail("Should not get here");
      } catch (RuntimeIOException e) {
        // OK
      }
    }

    {
      UncheckedCloser closer = Closers.uncheckedCloser(Closers.closer());
      try {
        closer.using(c);
        closer.close();
        Assert.fail("Should not get here");
      } catch (RuntimeIOException e) {
        // OK
      }
    }
  }

  private static class C implements Closeable {
    boolean closed = false;

    @Override
    public void close() {
      closed = true;
    }
  }
}
