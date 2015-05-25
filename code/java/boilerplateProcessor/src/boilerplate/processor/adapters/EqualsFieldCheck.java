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

package boilerplate.processor.adapters;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Type;

import boilerplate.equals.AutoEquals;
import boilerplate.processor.adapters.util.FieldAdapter;

class EqualsFieldCheck extends FieldAdapter {

    private FieldInfo info;

    public EqualsFieldCheck(FieldVisitor delegate, FieldInfo info) {
        super(delegate);
        this.info = info;
    }

    @Override
    public AnnotationVisitor visitAnnotation(String desc, boolean visible) {
        final AnnotationVisitor delegate = super.visitAnnotation(desc, visible);

        if (Type.getType(AutoEquals.class).equals(Type.getType(desc))) {
            info.mark = Mark.INCLUDE;
            return new ToStringAnnotationCheck(delegate, info);
        }
        return delegate;
    }
}
