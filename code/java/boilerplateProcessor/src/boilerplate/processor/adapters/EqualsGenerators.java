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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

/**
 * Contains code for generating per-field comparisons in equals methods. This code
 * is tightly coupled with method header and tail.
 * 
 * @author McDowell
 * @see EqualsAdapter
 */
class EqualsGenerators implements Opcodes {

    public static final List<BytecodeGenerator> GENERATORS = createGeneratorList();

    private static final List<BytecodeGenerator> createGeneratorList() {
        BytecodeGenerator[] generators = {
                new Int32Generator(Type.BOOLEAN_TYPE),
                new Int32Generator(Type.CHAR_TYPE),
                new Int32Generator(Type.INT_TYPE),
                new Int32Generator(Type.SHORT_TYPE),
                new Int32Generator(Type.BYTE_TYPE), new LongGenerator(),
                new FloatGenerator(), new DoubleGenerator(),
                new ArraysGenerator(), new ObjectGenerator(), };

        List<BytecodeGenerator> list = Arrays.asList(generators);
        return Collections.unmodifiableList(list);
    }

    private static class ObjectGenerator implements BytecodeGenerator {

        @Override
        public void generateCode(MethodVisitor mv, TypeInfo typeInfo,
                FieldInfo fieldInfo) {
            // CODE:
            // if (bar == null) {
            // if (other.bar != null)
            // return false;
            // } else if (!bar.equals(other.bar))
            // return false;

            final String typeInternalName = fieldInfo.type.getInternalName();
            final String typeName = fieldInfo.type.getDescriptor();

            mv.visitVarInsn(ALOAD, 0);
            mv
                    .visitFieldInsn(GETFIELD, typeInfo.type, fieldInfo.name,
                            typeName);
            Label l2 = new Label();
            mv.visitJumpInsn(IFNONNULL, l2);
            mv.visitVarInsn(ALOAD, 2);
            mv
                    .visitFieldInsn(GETFIELD, typeInfo.type, fieldInfo.name,
                            typeName);
            Label l3 = new Label();
            mv.visitJumpInsn(IFNULL, l3);
            mv.visitInsn(ICONST_0);
            mv.visitInsn(IRETURN);
            mv.visitLabel(l2);
            mv.visitFrame(Opcodes.F_APPEND, 1, new Object[] { typeInfo.type },
                    0, null);
            mv.visitVarInsn(ALOAD, 0);
            mv
                    .visitFieldInsn(GETFIELD, typeInfo.type, fieldInfo.name,
                            typeName);
            mv.visitVarInsn(ALOAD, 2);
            mv
                    .visitFieldInsn(GETFIELD, typeInfo.type, fieldInfo.name,
                            typeName);
            mv.visitMethodInsn(INVOKEVIRTUAL, typeInternalName, "equals",
                    "(Ljava/lang/Object;)Z");
            mv.visitJumpInsn(IFNE, l3);
            mv.visitInsn(ICONST_0);
            mv.visitInsn(IRETURN);
            mv.visitLabel(l3);
            mv.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
        }

        @Override
        public boolean matches(Type type) {
            return type.getSort() == Type.OBJECT;
        }

    }

    private static class ArraysGenerator implements BytecodeGenerator {

        private Map<Type, String> primitiveMethodSignatures = initSignatures();

        private Map<Type, String> initSignatures() {
            Map<Type, String> map = new HashMap<Type, String>();
            map.put(Type.getType(boolean[].class), "([Z[Z)Z");
            map.put(Type.getType(byte[].class), "([B[B)Z");
            map.put(Type.getType(char[].class), "([C[C)Z");
            map.put(Type.getType(double[].class), "([D[D)Z");
            map.put(Type.getType(float[].class), "([F[F)Z");
            map.put(Type.getType(int[].class), "([I[I)Z");
            map.put(Type.getType(long[].class), "([J[J)Z");
            map.put(Type.getType(short[].class), "([S[S)Z");
            return map;
        }

        private String getSignature(Type type) {
            String signature = primitiveMethodSignatures.get(type);
            if (signature == null) {
                // then object array
                return "([Ljava/lang/Object;[Ljava/lang/Object;)Z";
            }
            return signature;
        }

        @Override
        public void generateCode(MethodVisitor mv, TypeInfo typeInfo,
                FieldInfo fieldInfo) {
            // CODE: if (!Arrays.equals(bar2, other.bar2)) return false;

            final String typeDescriptor = fieldInfo.type.getDescriptor();
            final String methodSig = getSignature(fieldInfo.type);

            mv.visitVarInsn(ALOAD, 0);
            mv.visitFieldInsn(GETFIELD, typeInfo.type, fieldInfo.name,
                    typeDescriptor);
            mv.visitVarInsn(ALOAD, 2);
            mv.visitFieldInsn(GETFIELD, typeInfo.type, fieldInfo.name,
                    typeDescriptor);
            mv.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "equals",
                    methodSig);
            Label l2 = new Label();
            mv.visitJumpInsn(IFNE, l2);
            mv.visitInsn(ICONST_0);
            mv.visitInsn(IRETURN);
            mv.visitLabel(l2);
            mv.visitFrame(Opcodes.F_APPEND, 1, new Object[] { typeInfo.type },
                    0, null);
        }

        @Override
        public boolean matches(Type type) {
            return type.getSort() == Type.ARRAY;
        }

    }

    private static class Int32Generator implements BytecodeGenerator {

        private final Type type;

        protected Int32Generator(Type type) {
            this.type = type;
        }

        @Override
        public void generateCode(MethodVisitor mv, TypeInfo typeInfo,
                FieldInfo fieldInfo) {
            // CODE: if (myBool != other.myBool) return false;

            final String typeDescriptor = fieldInfo.type.getDescriptor();

            mv.visitVarInsn(ALOAD, 0);
            mv.visitFieldInsn(GETFIELD, typeInfo.type, fieldInfo.name,
                    typeDescriptor);
            mv.visitVarInsn(ALOAD, 2);
            mv.visitFieldInsn(GETFIELD, typeInfo.type, fieldInfo.name,
                    typeDescriptor);
            Label l2 = new Label();
            mv.visitJumpInsn(IF_ICMPEQ, l2);
            mv.visitInsn(ICONST_0);
            mv.visitInsn(IRETURN);
            mv.visitLabel(l2);
            mv.visitFrame(Opcodes.F_APPEND, 1, new Object[] { typeInfo.type },
                    0, null);
        }

        @Override
        public boolean matches(Type type) {
            return this.type.equals(type);
        }

    }

    private static class LongGenerator implements BytecodeGenerator {

        @Override
        public void generateCode(MethodVisitor mv, TypeInfo typeInfo,
                FieldInfo fieldInfo) {
            mv.visitVarInsn(ALOAD, 0);
            mv.visitFieldInsn(GETFIELD, typeInfo.type, fieldInfo.name, "J");
            mv.visitVarInsn(ALOAD, 2);
            mv.visitFieldInsn(GETFIELD, typeInfo.type, fieldInfo.name, "J");
            mv.visitInsn(LCMP);
            Label l2 = new Label();
            mv.visitJumpInsn(IFEQ, l2);
            mv.visitInsn(ICONST_0);
            mv.visitInsn(IRETURN);
            mv.visitLabel(l2);
            mv.visitFrame(Opcodes.F_APPEND, 1, new Object[] { typeInfo.type },
                    0, null);
        }

        @Override
        public boolean matches(Type type) {
            return Type.LONG_TYPE.equals(type);
        }

    }

    private static class FloatGenerator implements BytecodeGenerator {

        @Override
        public void generateCode(MethodVisitor mv, TypeInfo typeInfo,
                FieldInfo fieldInfo) {
            // CODE:
            // if (Float.floatToIntBits(myFloat) != Float
            // .floatToIntBits(other.myFloat))
            // return false;

            mv.visitVarInsn(ALOAD, 0);
            mv.visitFieldInsn(GETFIELD, typeInfo.type, fieldInfo.name, "F");
            mv.visitMethodInsn(INVOKESTATIC, "java/lang/Float",
                    "floatToIntBits", "(F)I");
            mv.visitVarInsn(ALOAD, 2);
            mv.visitFieldInsn(GETFIELD, typeInfo.type, fieldInfo.name, "F");
            mv.visitMethodInsn(INVOKESTATIC, "java/lang/Float",
                    "floatToIntBits", "(F)I");
            Label l3 = new Label();
            mv.visitJumpInsn(IF_ICMPEQ, l3);
            mv.visitInsn(ICONST_0);
            mv.visitInsn(IRETURN);
            mv.visitLabel(l3);
            mv.visitFrame(Opcodes.F_APPEND, 1, new Object[] { typeInfo.type },
                    0, null);
        }

        @Override
        public boolean matches(Type type) {
            return Type.FLOAT_TYPE.equals(type);
        }

    }

    private static class DoubleGenerator implements BytecodeGenerator {

        @Override
        public void generateCode(MethodVisitor mv, TypeInfo typeInfo,
                FieldInfo fieldInfo) {
            // CODE:
            // if (Double.doubleToLongBits(myDouble) != Double
            // .doubleToLongBits(other.myDouble))
            // return false;

            mv.visitVarInsn(ALOAD, 0);
            mv.visitFieldInsn(GETFIELD, typeInfo.type, fieldInfo.name, "D");
            mv.visitMethodInsn(INVOKESTATIC, "java/lang/Double",
                    "doubleToLongBits", "(D)J");
            mv.visitVarInsn(ALOAD, 2);
            mv.visitFieldInsn(GETFIELD, typeInfo.type, fieldInfo.name, "D");
            mv.visitMethodInsn(INVOKESTATIC, "java/lang/Double",
                    "doubleToLongBits", "(D)J");
            mv.visitInsn(LCMP);
            Label l2 = new Label();
            mv.visitJumpInsn(IFEQ, l2);
            mv.visitInsn(ICONST_0);
            mv.visitInsn(IRETURN);
            mv.visitLabel(l2);
            mv.visitFrame(Opcodes.F_APPEND, 1, new Object[] { typeInfo.type },
                    0, null);
        }

        @Override
        public boolean matches(Type type) {
            return Type.DOUBLE_TYPE.equals(type);
        }

    }

}
