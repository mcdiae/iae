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

package boilerplate.processor.adapters.util;

import org.objectweb.asm.AnnotationVisitor;

/**
 * Default annotation visitor implementation.
 * 
 * @author McDowell
 */
public class AnnotationAdapter implements AnnotationVisitor {

    private AnnotationVisitor delegate;

    public AnnotationAdapter(AnnotationVisitor delegate) {
        this.delegate = delegate;
    }

    @Override
    public void visit(String name, Object value) {
        delegate.visit(name, value);
    }

    @Override
    public AnnotationVisitor visitAnnotation(String name, String desc) {
        return delegate.visitAnnotation(name, desc);
    }

    @Override
    public AnnotationVisitor visitArray(String name) {
        return delegate.visitArray(name);
    }

    @Override
    public void visitEnd() {
        delegate.visitEnd();
    }

    @Override
    public void visitEnum(String name, String desc, String value) {
        delegate.visitEnum(name, desc, value);
    }

}
