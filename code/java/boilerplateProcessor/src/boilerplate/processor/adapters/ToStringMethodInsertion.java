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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

class ToStringMethodInsertion implements Opcodes, BytecodeGenerator {

    public static List<BytecodeGenerator> APPEND_METHODS = createMethodList();

    private final Type type;
    private final String methodName;
    private final String methodSignature;

    private ToStringMethodInsertion(Type type, String methodName,
            String methodSignature) {
        this.type = type;
        this.methodName = methodName;
        this.methodSignature = methodSignature;
    }

    public void generateCode(MethodVisitor mv, TypeInfo typeInfo, FieldInfo fieldInfo) {
        mv.visitVarInsn(ALOAD, 1);
        mv.visitLdcInsn(fieldInfo.name);
        mv.visitVarInsn(ALOAD, 0);
        mv.visitFieldInsn(GETFIELD, typeInfo.type, fieldInfo.name, fieldInfo.type.getDescriptor());
        mv.visitMethodInsn(INVOKESTATIC, "boilerplate/tostring/ToStringUtils",
                methodName, methodSignature);
    }

    public boolean matches(Type type) {
        return this.type.equals(type);
    }

    private static List<BytecodeGenerator> createMethodList() {
        final Type objectType = Type.getType(Object.class);
        class ObjectMethodInsn extends ToStringMethodInsertion {
            ObjectMethodInsn() {
                super(objectType, "appendObject",
                        "(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/Object;)V");
            }

            @Override
            public boolean matches(Type type) {
                return true;
            }
        }

        BytecodeGenerator[] arr = {
                new ToStringMethodInsertion(Type.BOOLEAN_TYPE, "appendBoolean",
                        "(Ljava/lang/StringBuilder;Ljava/lang/String;Z)V"),
                new ToStringMethodInsertion(Type.BYTE_TYPE, "appendByte",
                        "(Ljava/lang/StringBuilder;Ljava/lang/String;B)V"),
                new ToStringMethodInsertion(Type.CHAR_TYPE, "appendChar",
                        "(Ljava/lang/StringBuilder;Ljava/lang/String;C)V"),
                new ToStringMethodInsertion(Type.DOUBLE_TYPE, "appendDouble",
                        "(Ljava/lang/StringBuilder;Ljava/lang/String;D)V"),
                new ToStringMethodInsertion(Type.FLOAT_TYPE, "appendFloat",
                        "(Ljava/lang/StringBuilder;Ljava/lang/String;F)V"),
                new ToStringMethodInsertion(Type.INT_TYPE, "appendInt",
                        "(Ljava/lang/StringBuilder;Ljava/lang/String;I)V"),
                new ToStringMethodInsertion(Type.LONG_TYPE, "appendLong",
                        "(Ljava/lang/StringBuilder;Ljava/lang/String;J)V"),
                new ToStringMethodInsertion(Type.SHORT_TYPE, "appendShort",
                        "(Ljava/lang/StringBuilder;Ljava/lang/String;S)V"),
                // default
                new ObjectMethodInsn(), };
        List<BytecodeGenerator> list = Arrays.asList(arr);
        return Collections.unmodifiableList(list);
    }

}
