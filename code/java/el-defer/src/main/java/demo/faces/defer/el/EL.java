/*
Copyright (c) 2012 McDowell

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
package demo.faces.defer.el;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.enterprise.util.Nonbinding;
import javax.inject.Qualifier;

/**
 * An EL expression. Use this expression in conjunction with
 * {@link javax.inject.Inject} in a CDI container.
 * 
 * Example:
 * 
 * {@code @Inject @EL("# foo}") private Property fooRef;}
 * 
 * @see ElProducer
 * @author McDowell
 */
@Retention(RUNTIME)
@Qualifier
@Target({ FIELD, PARAMETER, METHOD, TYPE })
public @interface EL {
  /**
   * The EL expression
   * 
   * @return an expression (e.g. "#{foo}")
   */
  @Nonbinding
  String value();

  /**
   * The type to coerce the resolved value to. Defaults to Object.
   * 
   * @return the type
   */
  @Nonbinding
  Class<?> coerce() default Object.class;
}
