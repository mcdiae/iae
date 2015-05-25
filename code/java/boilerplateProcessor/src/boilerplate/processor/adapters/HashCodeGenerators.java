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
 * Contains code for generating per-field calculations in a hashCode. This code
 * is tightly coupled with method header and tail.
 * 
 * @author McDowell
 * @see EqualsAdapter
 */
class HashCodeGenerators implements Opcodes {

    // NOTE: "const int prime = 31;" becomes literal 31 below

    public static List<BytecodeGenerator> GENERATORS = createGeneratorList();

    private static List<BytecodeGenerator> createGeneratorList() {
        BytecodeGenerator[] generators = { new IntegerGenerator(),
                new BooleanGenerator(), new ObjectGenerator(),
                new ArrayGenerator(), new DoubleGenerator(),
                new FloatGenerator(), new LongGenerator(), };

        List<BytecodeGenerator> list = Arrays.asList(generators);
        return Collections.unmodifiableList(list);
    }

    private static class DoubleGenerator implements BytecodeGenerator {

        @Override
        public void generateCode(MethodVisitor mv, TypeInfo typeInfo,
                FieldInfo fieldInfo) {
            // CODE:
            // long temp = Double.doubleToLongBits(myDouble);
            // result = prime * result + (int) (temp ^ (temp >>> 32));

            mv.visitVarInsn(ALOAD, 0);
            mv.visitFieldInsn(GETFIELD, typeInfo.type, fieldInfo.name, "D");
            mv.visitMethodInsn(INVOKESTATIC, "java/lang/Double",
                    "doubleToLongBits", "(D)J");
            mv.visitVarInsn(LSTORE, 3);
            mv.visitIntInsn(BIPUSH, 31);
            mv.visitVarInsn(ILOAD, 2);
            mv.visitInsn(IMUL);
            mv.visitVarInsn(LLOAD, 3);
            mv.visitVarInsn(LLOAD, 3);
            mv.visitIntInsn(BIPUSH, 32);
            mv.visitInsn(LUSHR);
            mv.visitInsn(LXOR);
            mv.visitInsn(L2I);
            mv.visitInsn(IADD);
            mv.visitVarInsn(ISTORE, 2);
        }

        @Override
        public boolean matches(Type type) {
            return Type.DOUBLE_TYPE.equals(type);
        }

    }

    private static class FloatGenerator implements BytecodeGenerator {

        @Override
        public void generateCode(MethodVisitor mv, TypeInfo typeInfo,
                FieldInfo fieldInfo) {
            // CODE: result = prime * result + Float.floatToIntBits(myFloat);

            mv.visitIntInsn(BIPUSH, 31);
            mv.visitVarInsn(ILOAD, 2);
            mv.visitInsn(IMUL);
            mv.visitVarInsn(ALOAD, 0);
            mv.visitFieldInsn(GETFIELD, typeInfo.type, fieldInfo.name, "F");
            mv.visitMethodInsn(INVOKESTATIC, "java/lang/Float",
                    "floatToIntBits", "(F)I");
            mv.visitInsn(IADD);
            mv.visitVarInsn(ISTORE, 2);
        }

        @Override
        public boolean matches(Type type) {
            return Type.FLOAT_TYPE.equals(type);
        }

    }

    private static class LongGenerator implements BytecodeGenerator {

        @Override
        public void generateCode(MethodVisitor mv, TypeInfo typeInfo,
                FieldInfo fieldInfo) {
            // CODE: result = prime * result + (int) (myLong ^ (myLong >>> 32));

            mv.visitIntInsn(BIPUSH, 31);
            mv.visitVarInsn(ILOAD, 2);
            mv.visitInsn(IMUL);
            mv.visitVarInsn(ALOAD, 0);
            mv.visitFieldInsn(GETFIELD, typeInfo.type, fieldInfo.name, "J");
            mv.visitVarInsn(ALOAD, 0);
            mv.visitFieldInsn(GETFIELD, typeInfo.type, fieldInfo.name, "J");
            mv.visitIntInsn(BIPUSH, 32);
            mv.visitInsn(LUSHR);
            mv.visitInsn(LXOR);
            mv.visitInsn(L2I);
            mv.visitInsn(IADD);
            mv.visitVarInsn(ISTORE, 2);
        }

        @Override
        public boolean matches(Type type) {
            return Type.LONG_TYPE.equals(type);
        }

    }

    private static class BooleanGenerator implements BytecodeGenerator {

        @Override
        public void generateCode(MethodVisitor mv, TypeInfo typeInfo,
                FieldInfo fieldInfo) {
            // CODE: result = prime * result + (myBool ? 1231 : 1237);

            mv.visitIntInsn(BIPUSH, 31);
            mv.visitVarInsn(ILOAD, 2);
            mv.visitInsn(IMUL);
            mv.visitVarInsn(ALOAD, 0);
            mv.visitFieldInsn(GETFIELD, typeInfo.type, fieldInfo.name, "Z");
            Label l0 = new Label();
            mv.visitJumpInsn(IFEQ, l0);
            mv.visitIntInsn(SIPUSH, 1231);
            Label l1 = new Label();
            mv.visitJumpInsn(GOTO, l1);
            mv.visitLabel(l0);
            mv.visitFrame(Opcodes.F_FULL, 3, new Object[] { typeInfo.type,
                    Opcodes.INTEGER, Opcodes.INTEGER }, 1,
                    new Object[] { Opcodes.INTEGER });
            mv.visitIntInsn(SIPUSH, 1237);
            mv.visitLabel(l1);
            mv.visitFrame(Opcodes.F_FULL, 3, new Object[] { typeInfo.type,
                    Opcodes.INTEGER, Opcodes.INTEGER }, 2, new Object[] {
                    Opcodes.INTEGER, Opcodes.INTEGER });
            mv.visitInsn(IADD);
            mv.visitVarInsn(ISTORE, 2);
        }

        @Override
        public boolean matches(Type type) {
            return Type.BOOLEAN_TYPE.equals(type);
        }

    }

    /**
     * Generator for int, byte, char, short.
     * 
     * @author McDowell
     */
    private static class IntegerGenerator implements BytecodeGenerator {

        @Override
        public void generateCode(MethodVisitor mv, TypeInfo typeInfo,
                FieldInfo fieldInfo) {
            // CODE: result = prime * result + myNumber;

            mv.visitIntInsn(BIPUSH, 31);
            mv.visitVarInsn(ILOAD, 2);
            mv.visitInsn(IMUL);
            mv.visitVarInsn(ALOAD, 0);
            mv.visitFieldInsn(GETFIELD, typeInfo.type, fieldInfo.name,
                    fieldInfo.type.getDescriptor());
            mv.visitInsn(IADD);
            mv.visitVarInsn(ISTORE, 2);
        }

        @Override
        public boolean matches(Type type) {
            switch (type.getSort()) {
            case Type.BYTE:
                return true;
            case Type.CHAR:
                return true;
            case Type.INT:
                return true;
            case Type.SHORT:
                return true;
            default:
                return false;
            }
        }

    }

    private static class ObjectGenerator implements BytecodeGenerator {

        @Override
        public void generateCode(MethodVisitor mv, TypeInfo typeInfo,
                FieldInfo fieldInfo) {
            // CODE: result = prime * result + ((bar == null) ? 0 :
            // bar.hashCode());

            final String typeDescriptor = fieldInfo.type.getDescriptor();
            final String internalName = fieldInfo.type.getInternalName();

            mv.visitIntInsn(BIPUSH, 31);
            mv.visitVarInsn(ILOAD, 2);
            mv.visitInsn(IMUL);
            mv.visitVarInsn(ALOAD, 0);
            mv.visitFieldInsn(GETFIELD, typeInfo.type, fieldInfo.name,
                    typeDescriptor);
            Label l0 = new Label();
            mv.visitJumpInsn(IFNONNULL, l0);
            mv.visitInsn(ICONST_0);
            Label l1 = new Label();
            mv.visitJumpInsn(GOTO, l1);
            mv.visitLabel(l0);
            mv.visitFrame(Opcodes.F_FULL, 3, new Object[] { typeInfo.type,
                    Opcodes.INTEGER, Opcodes.INTEGER }, 1,
                    new Object[] { Opcodes.INTEGER });
            mv.visitVarInsn(ALOAD, 0);
            mv.visitFieldInsn(GETFIELD, typeInfo.type, fieldInfo.name,
                    typeDescriptor);
            mv.visitMethodInsn(INVOKEVIRTUAL, internalName, "hashCode", "()I");
            mv.visitLabel(l1);
            mv.visitFrame(Opcodes.F_FULL, 3, new Object[] { typeInfo.type,
                    Opcodes.INTEGER, Opcodes.INTEGER }, 2, new Object[] {
                    Opcodes.INTEGER, Opcodes.INTEGER });
            mv.visitInsn(IADD);
            mv.visitVarInsn(ISTORE, 2);
        }

        @Override
        public boolean matches(Type type) {
            return Type.OBJECT == type.getSort();
        }

    }

    private static class ArrayGenerator implements BytecodeGenerator {

        private Map<Type, String> primitiveMethodSignatures = initSignatures();

        private Map<Type, String> initSignatures() {
            Map<Type, String> map = new HashMap<Type, String>();
            map.put(Type.getType(boolean[].class), "([Z)I");
            map.put(Type.getType(byte[].class), "([B)I");
            map.put(Type.getType(char[].class), "([C)I");
            map.put(Type.getType(double[].class), "([D)I");
            map.put(Type.getType(float[].class), "([F)I");
            map.put(Type.getType(int[].class), "([I)I");
            map.put(Type.getType(long[].class), "([J)I");
            map.put(Type.getType(short[].class), "([S)I");
            return map;
        }

        private String getSignature(Type type) {
            String sig = primitiveMethodSignatures.get(type);
            if (sig == null) {
                return "([Ljava/lang/Object;)I";
            }
            return sig;
        }

        @Override
        public void generateCode(MethodVisitor mv, TypeInfo typeInfo,
                FieldInfo fieldInfo) {
            // CODE: result = prime * result + Arrays.hashCode(bar2);

            final String typeDescriptor = fieldInfo.type.getDescriptor();
            final String methodSignature = getSignature(fieldInfo.type);

            mv.visitIntInsn(BIPUSH, 31);
            mv.visitVarInsn(ILOAD, 2);
            mv.visitInsn(IMUL);
            mv.visitVarInsn(ALOAD, 0);
            mv.visitFieldInsn(GETFIELD, typeInfo.type, fieldInfo.name,
                    typeDescriptor);
            mv.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "hashCode",
                    methodSignature);
            mv.visitInsn(IADD);
            mv.visitVarInsn(ISTORE, 2);
        }

        @Override
        public boolean matches(Type type) {
            return Type.ARRAY == type.getSort();
        }

    }

}
