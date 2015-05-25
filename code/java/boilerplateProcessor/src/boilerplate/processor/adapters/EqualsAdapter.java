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

import static org.objectweb.asm.Opcodes.ACC_PUBLIC;
import static org.objectweb.asm.Opcodes.ACC_STATIC;
import static org.objectweb.asm.Opcodes.ALOAD;
import static org.objectweb.asm.Opcodes.ASTORE;
import static org.objectweb.asm.Opcodes.BIPUSH;
import static org.objectweb.asm.Opcodes.CHECKCAST;
import static org.objectweb.asm.Opcodes.F_SAME;
import static org.objectweb.asm.Opcodes.ICONST_0;
import static org.objectweb.asm.Opcodes.ICONST_1;
import static org.objectweb.asm.Opcodes.IFNE;
import static org.objectweb.asm.Opcodes.IF_ACMPNE;
import static org.objectweb.asm.Opcodes.ILOAD;
import static org.objectweb.asm.Opcodes.INSTANCEOF;
import static org.objectweb.asm.Opcodes.IRETURN;
import static org.objectweb.asm.Opcodes.ISTORE;

import java.util.ArrayList;
import java.util.List;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.ClassAdapter;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Type;

import boilerplate.equals.AutoEquals;
import boilerplate.processor.logging.Message;
import boilerplate.processor.logging.MessageHandler;
import boilerplate.processor.logging.Severity;

/**
 * Class visitor that inserts <CODE>equals</CODE> and <CODE>hashCode</CODE>
 * methods into annotated classes.
 * 
 * @author McDowell
 * @see boilerplate.equals.AutoEquals
 */
public class EqualsAdapter extends ClassAdapter {

    private MessageHandler messageHandler;
    private TypeInfo typeInfo;

    public EqualsAdapter(MessageHandler messageHandler, String type,
            ClassVisitor cv) {
        super(cv);
        if (messageHandler == null || type == null) {
            throw new NullPointerException();
        }
        this.messageHandler = messageHandler;
        this.typeInfo = new TypeInfo(type);
    }

    @Override
    public AnnotationVisitor visitAnnotation(String name, boolean visible) {
        Type type = Type.getType(name);
        Type annotationType = Type.getType(AutoEquals.class);
        if (type.equals(annotationType)) {
            typeInfo.typeIsAnnotated = true;
        }

        return super.visitAnnotation(name, visible);
    }

    @Override
    public MethodVisitor visitMethod(int access, String name, String desc,
            String signature, String[] exceptions) {
        boolean zeroArgs = true;
        boolean objectArgument = false;
        if (desc != null) {
            Type[] types = Type.getArgumentTypes(desc);
            if (types != null) {
                if (types.length > 0) {
                    zeroArgs = false;
                }
                if (types.length == 1) {
                    Type objectType = Type.getType(Object.class);
                    if (types[0].equals(objectType)) {
                        objectArgument = true;
                    }
                }
            }
        }

        if ("hashCode".equals(name) && zeroArgs) {
            typeInfo.hasHashCodeMethod = true;
        } else if ("equals".equals(name) && objectArgument) {
            typeInfo.hasEqualsMethod = true;
        }

        return super.visitMethod(access, name, desc, signature, exceptions);
    }

    @Override
    public FieldVisitor visitField(int access, String name, String desc,
            String signature, Object value) {

        FieldInfo info = new FieldInfo();
        info.name = name;
        info.type = Type.getType(desc);
        info.isStatic = (access & ACC_STATIC) != 0;

        typeInfo.fields.add(info);

        final FieldVisitor delegate = super.visitField(access, name, desc,
                signature, value);
        return new EqualsFieldCheck(delegate, info);
    }

    @Override
    public void visitEnd() {
        if (isAnnotatedAndValid()) {
            Message message = new Message(Severity.INFO, typeInfo.type,
                    AutoEquals.class,
                    "Adding equals(Object) and hashCode() methods.");
            messageHandler.log(message);

            addMethods();
        }

        super.visitEnd();
    }

    /**
     * Tests to see if the target is annotated and if it is, that it is
     * annotated correctly.
     * 
     * @return true if the adding the toString method can proceed
     */
    private boolean isAnnotatedAndValid() {
        boolean ok = true;
        boolean hasAnnotatedFields = typeInfo.hasAnnotatedFields();

        if ((!hasAnnotatedFields) && (!(typeInfo.typeIsAnnotated))) {
            // then not annotated
            return false;
        }

        for (Validator validator : EqualsValidators.VALIDATORS) {
            if (!validator.validate(messageHandler, typeInfo)) {
                ok = false;
            }
        }

        return ok;
    }

    private void addMethods() {
        // find included fields
        List<FieldInfo> fields = new ArrayList<FieldInfo>(typeInfo.fields
                .size());
        if (typeInfo.hasAnnotatedFields()) {
            for (FieldInfo info : typeInfo.fields) {
                if (info.mark == Mark.INCLUDE) {
                    fields.add(info);
                }
            }
        } else {
            fields = typeInfo.fields;
        }

        // inject methods
        addEqualsMethod(fields);
        addHashCodeMethod(fields);
    }

    private void addEqualsMethod(List<FieldInfo> fields) {
        // CODE: public boolean equals(Object obj) {
        MethodVisitor mv = cv.visitMethod(ACC_PUBLIC, "equals",
                "(Ljava/lang/Object;)Z", null, null);
        mv.visitCode();

        // CODE: if (this == obj) return true;
        mv.visitVarInsn(ALOAD, 0);
        mv.visitVarInsn(ALOAD, 1);
        Label l0 = new Label();
        mv.visitJumpInsn(IF_ACMPNE, l0);
        mv.visitInsn(ICONST_1);
        mv.visitInsn(IRETURN);
        mv.visitLabel(l0);
        mv.visitFrame(F_SAME, 0, null, 0, null);

        // CODE: if (!(obj instanceof Foo)) return false;
        mv.visitVarInsn(ALOAD, 1);
        mv.visitTypeInsn(INSTANCEOF, typeInfo.type);
        Label l1 = new Label();
        mv.visitJumpInsn(IFNE, l1);
        mv.visitInsn(ICONST_0);
        mv.visitInsn(IRETURN);
        mv.visitLabel(l1);
        mv.visitFrame(F_SAME, 0, null, 0, null);

        // CODE: final Foo other = (Foo) obj;
        mv.visitVarInsn(ALOAD, 1);
        mv.visitTypeInsn(CHECKCAST, typeInfo.type);
        mv.visitVarInsn(ASTORE, 2);

        for (FieldInfo info : fields) {
            addTest(mv, info);
        }

        // CODE: return true; }
        mv.visitInsn(ICONST_1);
        mv.visitInsn(IRETURN);
        mv.visitMaxs(1, 2);
        mv.visitEnd();
    }

    private void addTest(MethodVisitor mv, FieldInfo fieldInfo) {
        for (BytecodeGenerator generator : EqualsGenerators.GENERATORS) {
            if (generator.matches(fieldInfo.type)) {
                generator.generateCode(mv, typeInfo, fieldInfo);
                return;
            }
        }

        throw new IllegalStateException("Unknown type: " + fieldInfo.name + " "
                + fieldInfo.type);
    }

    private void addHashCodeMethod(List<FieldInfo> fields) {
        // CODE: public int hashCode() {
        MethodVisitor mv = cv.visitMethod(ACC_PUBLIC, "hashCode", "()I", null,
                null);
        mv.visitCode();

        // CODE: final int prime = 31;
        mv.visitIntInsn(BIPUSH, 31);
        mv.visitVarInsn(ISTORE, 1);
        mv.visitInsn(ICONST_1);

        // CODE: int result = 1;
        mv.visitVarInsn(ISTORE, 2);

        for (FieldInfo fieldInfo : fields) {
            addCalculation(mv, fieldInfo);
        }

        // CODE: return result; }
        mv.visitVarInsn(ILOAD, 2);
        mv.visitInsn(IRETURN);
        mv.visitMaxs(1, 3);
        mv.visitEnd();
    }

    private void addCalculation(MethodVisitor mv, FieldInfo fieldInfo) {
        for (BytecodeGenerator generator : HashCodeGenerators.GENERATORS) {
            if (generator.matches(fieldInfo.type)) {
                generator.generateCode(mv, typeInfo, fieldInfo);
                return;
            }
        }

        throw new IllegalStateException("Unknown type: " + fieldInfo.name + " "
                + fieldInfo.type);
    }

}
