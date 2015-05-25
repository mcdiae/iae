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

import static demo.fluentio.InternalUtils.typeCast;

import java.io.Closeable;
import java.io.IOException;


/**
 * Abstract base class for {@link Die} implementations.
 * 
 * @author McDowell
 * 
 * @param <T>
 *          the type encapsulated by this {@link Die}
 */
public abstract class AbstractDie<T extends Closeable> implements Die<T>,
    Doctorable, Operable {
  private final T resource;
  private final Closer closer;

  protected AbstractDie(Closer closer, T resource) {
    this.closer = InternalUtils.notNull(closer);
    this.resource = closer.using(InternalUtils.notNull(resource));
  }

  @Override
  public T die() {
    return resource;
  }

  @Override
  public Closer getCloser() {
    return closer;
  }

  @Override
  public <X> X doctor(Doctor<X, ?> doctor) throws IOException {
    Doctor<X, Die<T>> doc = typeCast(doctor);
    return doc.op(this);
  }

  @Override
  public <X> X operate(Doctor<X, ?> doctor) throws RuntimeIOException {
    Doctor<X, Die<T>> doc = typeCast(doctor);
    return Doctors.unchecked(doc).op(this);
  }

  /**
   * TODO: this is a hack
   * 
   * @param <X>
   *          the type to be cast to
   * @return this
   */
  @SuppressWarnings("unchecked")
  public <X> X cast() {
    return (X) this;
  }
}
