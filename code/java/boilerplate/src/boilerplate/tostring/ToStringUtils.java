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

package boilerplate.tostring;

import java.util.Arrays;

/**
 * Utility methods for generated <CODE>toString</CODE> implementations.
 * 
 * @author McDowell
 */
public class ToStringUtils {

    /**
     * Appends an object to the buffer. If the value is an array type, a list of
     * values is appended.
     * 
     * @param buffer
     *            buffer to which value will be appended
     * @param name
     *            field name
     * @param value
     *            value object
     */
    public static final void appendObject(StringBuilder buffer, String name,
            Object value) {
        buffer.append(name);
        buffer.append("={");
        if (value != null && value.getClass().isArray()) {
            appendArray(buffer, value);
        } else {
            buffer.append(value);
        }
        buffer.append("} ");
    }

    private static final void appendArray(StringBuilder buffer, Object o) {
        if (o.getClass() == boolean[].class) {
            String s = Arrays.toString((boolean[]) o);
            buffer.append(s);
            return;
        }
        if (o.getClass() == byte[].class) {
            String s = Arrays.toString((byte[]) o);
            buffer.append(s);
            return;
        }
        if (o.getClass() == char[].class) {
            String s = Arrays.toString((char[]) o);
            buffer.append(s);
            return;
        }
        if (o.getClass() == double[].class) {
            String s = Arrays.toString((double[]) o);
            buffer.append(s);
            return;
        }
        if (o.getClass() == float[].class) {
            String s = Arrays.toString((float[]) o);
            buffer.append(s);
            return;
        }
        if (o.getClass() == int[].class) {
            String s = Arrays.toString((int[]) o);
            buffer.append(s);
            return;
        }
        if (o.getClass() == long[].class) {
            String s = Arrays.toString((long[]) o);
            buffer.append(s);
            return;
        }
        if (o.getClass() == short[].class) {
            String s = Arrays.toString((short[]) o);
            buffer.append(s);
            return;
        }
        if (o instanceof Object[]) {
            String s = Arrays.deepToString((Object[]) o);
            buffer.append(s);
            return;
        }
        throw new IllegalArgumentException();
    }

    public static final void appendShort(StringBuilder stringBuilder,
            String key, short value) {
        appendInt(stringBuilder, key, value);
    }

    public static final void appendInt(StringBuilder stringBuilder, String key,
            int value) {
        stringBuilder.append(key);
        stringBuilder.append("=");
        stringBuilder.append(value);
        stringBuilder.append(" ");
    }

    public static final void appendLong(StringBuilder stringBuilder,
            String key, long value) {
        stringBuilder.append(key);
        stringBuilder.append("=");
        stringBuilder.append(value);
        stringBuilder.append(" ");
    }

    public static final void appendFloat(StringBuilder stringBuilder,
            String key, float value) {
        appendDouble(stringBuilder, key, value);
    }

    public static final void appendDouble(StringBuilder stringBuilder,
            String key, double value) {
        stringBuilder.append(key);
        stringBuilder.append("=");
        stringBuilder.append(value);
        stringBuilder.append(" ");
    }

    /**
     * Appends the value in the form <CODE>0xFF</CODE>.
     * 
     * @param stringBuilder
     *            the buffer
     * @param key
     *            the field name
     * @param value
     *            the field value
     */
    public static final void appendByte(StringBuilder stringBuilder,
            String key, byte value) {
        char high = toChar((value & 0xF0) >> 4);
        char low = toChar(value & 0x0F);
        stringBuilder.append(key);
        stringBuilder.append("=0x");
        stringBuilder.append(high);
        stringBuilder.append(low);
        stringBuilder.append(" ");
    }

    /**
     * @param nibble
     *            a half-byte
     * @return the hex representation of the value
     */
    private static final char toChar(int nibble) {
        if (nibble < 10) {
            return (char) (nibble + '0');
        } else {
            return (char) (nibble - 10 + 'A');
        }
    }

    public static final void appendChar(StringBuilder stringBuilder,
            String key, char value) {
        stringBuilder.append(key);
        stringBuilder.append("=");
        stringBuilder.append(value);
        stringBuilder.append(" ");
    }

    public static final void appendBoolean(StringBuilder stringBuilder,
            String key, boolean value) {
        stringBuilder.append(key);
        stringBuilder.append("=");
        stringBuilder.append(value);
        stringBuilder.append(" ");
    }

}
