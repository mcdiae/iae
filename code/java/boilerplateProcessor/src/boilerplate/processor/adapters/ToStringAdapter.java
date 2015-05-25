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
import static org.objectweb.asm.Opcodes.ARETURN;
import static org.objectweb.asm.Opcodes.ASTORE;
import static org.objectweb.asm.Opcodes.DUP;
import static org.objectweb.asm.Opcodes.INVOKESPECIAL;
import static org.objectweb.asm.Opcodes.INVOKEVIRTUAL;
import static org.objectweb.asm.Opcodes.NEW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.ClassAdapter;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Type;

import boilerplate.processor.logging.Message;
import boilerplate.processor.logging.MessageHandler;
import boilerplate.processor.logging.Severity;
import boilerplate.tostring.AutoToString;

/**
 * Class visitor that inserts the <CODE>toString</CODE> method into annotated
 * classes.
 * 
 * @author McDowell
 * @see boilerplate.tostring.AutoToString
 */
public class ToStringAdapter extends ClassAdapter {

    private MessageHandler messageHandler;
    private TypeInfo typeInfo;

    public ToStringAdapter(MessageHandler messageHandler, String type,
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
        Type annotationType = Type.getType(AutoToString.class);
        if (type.equals(annotationType)) {
            typeInfo.typeIsAnnotated = true;
        }

        return super.visitAnnotation(name, visible);
    }

    @Override
    public MethodVisitor visitMethod(int access, String name, String desc,
            String signature, String[] exceptions) {
        boolean zeroArgs = true;
        if (desc != null) {
            Type[] types = Type.getArgumentTypes(desc);
            if (types != null && types.length > 0) {
                zeroArgs = false;
            }
        }

        if ("toString".equals(name) && zeroArgs) {
            typeInfo.hasToStringMethod = true;
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
        return new ToStringFieldCheck(delegate, info);
    }

    @Override
    public void visitEnd() {
        if (isAnnotatedAndValid()) {
            Message message = new Message(Severity.INFO, typeInfo.type,
                    AutoToString.class, "Adding toString() method.");
            messageHandler.log(message);

            addMethod();
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

        for (Validator validator : ToStringValidators.VALIDATORS) {
            if (!validator.validate(messageHandler, typeInfo)) {
                ok = false;
            }
        }

        return ok;
    }

    private void addMethod() {
        List<String> fieldNames = new ArrayList<String>(typeInfo.fields.size());
        Map<String, FieldInfo> fields = new HashMap<String, FieldInfo>(
                typeInfo.fields.size());
        boolean hasAnnotatedFields = typeInfo.hasAnnotatedFields();
        for (FieldInfo info : typeInfo.fields) {
            if (!(hasAnnotatedFields ^ info.mark == Mark.INCLUDE)) {
                fieldNames.add(info.name);
                fields.put(info.name, info);
            }
        }
        Collections.sort(fieldNames);

        MethodVisitor mv = cv.visitMethod(ACC_PUBLIC, "toString",
                "()Ljava/lang/String;", null, null);
        mv.visitCode();
        mv.visitTypeInsn(NEW, "java/lang/StringBuilder");
        mv.visitInsn(DUP);
        mv.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>",
                "()V");
        mv.visitVarInsn(ASTORE, 1);
        for (String name : fieldNames) {
            FieldInfo info = fields.get(name);
            addField(mv, info);
        }
        mv.visitVarInsn(ALOAD, 1);
        mv.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder",
                "toString", "()Ljava/lang/String;");
        mv.visitInsn(ARETURN);
        mv.visitMaxs(4, 2);
        mv.visitEnd();
    }

    private void addField(MethodVisitor mv, FieldInfo info) {
        for (BytecodeGenerator method : ToStringMethodInsertion.APPEND_METHODS) {
            if (method.matches(info.type)) {
                method.generateCode(mv, typeInfo, info);
                return;
            }
        }

        throw new IllegalStateException("Unknown type: " + info.name + " "
                + info.type);
    }

}
