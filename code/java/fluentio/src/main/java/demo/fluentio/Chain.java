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

/**
 * This class can be used to chain multiple operations together.
 * 
 * Immutability is dependent on the underlying {@link Doctor} implementations.
 * 
 * @author McDowell
 * 
 * @param <A>
 *          the output type
 * @param <B>
 *          the input type
 * @see Doctors#chain(Doctor, Doctor)
 */
public final class Chain<A, B> {
  private final Doctor<A, B> doctor;

  private Chain(Doctor<A, B> doctor) {
    this.doctor = doctor;
  }

  /**
   * Creates an new chain with another link.
   * 
   * @param <T>
   *          the new output type
   * @param doctor
   *          the link
   * @return a new chain
   */
  public <T> Chain<T, B> link(Doctor<T, ?> doctor) {
    Doctor<T, B> chained = Doctors.chain(this.doctor, doctor);
    return new Chain<T, B>(chained);
  }

  /**
   * Creates the first link in a chain.
   * 
   * @param <A>
   *          an intermediate type
   * @param <B>
   *          the input type
   * @param first
   *          the input end of the chain
   * @return the chain
   */
  public static <A, B> Chain<A, B> chain(Doctor<A, B> first) {
    return new Chain<A, B>(first);
  }

  /**
   * Returns the chain as a {@link Doctor}.
   * 
   * @return the chained operations
   */
  public Doctor<A, B> chained() {
    return doctor;
  }
}
