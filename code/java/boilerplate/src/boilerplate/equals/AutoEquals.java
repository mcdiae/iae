/*
Copyright (c) 2008 McDowell

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

package boilerplate.equals;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Annotation marker for implementing Java equality contract.
 * <P>
 * When the processor is run on a class marked with this annotation, it attempts
 * to insert <CODE>equals(Object)</CODE> and <CODE>hashCode()<CODE>
 * methods in the form described in
 * <A href="http://java.sun.com/docs/books/effective/">Effective Java, Second Edition</A>.
 * <UL>
 * <LI>It is an error to mark a class with this annotation if it already implements either method.</LI>
 * <LI>It is an error to mark a type that does not declare non-static member fields.</LI>
 * <LI>It is an error to mark a static field.</LI>
 * </UL>
 * <P>
 * To consider all non-static member fields in the comparison, mark the type.
 * To exclude some fields, mark all non-static fields and use the <CODE>include</CODE>
 * element.
 * 
 * @see boilerplate.processor.Processor
 * @author McDowell
 */
@Target( { ElementType.TYPE, ElementType.FIELD })
public @interface AutoEquals {

    /**
     * If the annotation is set on a field and this element is false, the field
     * is not used in the generated methods. At least one member field must have
     * this element set to true.
     */
    boolean include() default true;

}
