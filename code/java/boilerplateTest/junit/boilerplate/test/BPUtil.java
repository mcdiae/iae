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

package boilerplate.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.lang.reflect.Method;

/**
 * Test utilities.
 * 
 * @author McDowell
 */
public class BPUtil {

    /**
     * Asserts that the class implements toString
     */
    public static void assertImplementsToString(Class<?> c) {
        try {
            Method m = c.getDeclaredMethod("toString", new Class[0]);
            assertNotNull(m);
        } catch (NoSuchMethodException e) {
            fail("Missing implementation: toString in " + c);
        }
    }

    /**
     * Asserts that the class implements equals and hashCode.
     */
    public static void assertImplementsEquals(Class<?> c) {
        try {
            Method m = c.getDeclaredMethod("equals",
                    new Class[] { Object.class });
            assertNotNull(m);
        } catch (NoSuchMethodException e) {
            fail("Missing implementation: equals in " + c);
        }
        try {
            Method m = c.getDeclaredMethod("hashCode", new Class[0]);
            assertNotNull(m);
        } catch (NoSuchMethodException e) {
            fail("Missing implementation: hashCode in " + c);
        }
    }

    public static void assertEqualsContract(Object o1, Object o2, Object o3) {
        if(o1 == null || o2 == null || o3 == null) {
            throw new NullPointerException();
        }
        
        //null
        assertFalse(o1.equals(null));
        
        //reflexive
        assertTrue(o1.equals(o1));
        
        //symmetric
        if(o1.equals(o2)) {
            assertTrue(o2.equals(o1));
        }
        
        //transitive
        if(o1.equals(o2) && o1.equals(o3)) {
            assertTrue(o2.equals(o3));
        }
        
        //hashCode
        if(o1.equals(o2)) {
            assertTrue(o1.hashCode() == o2.hashCode());
        }
    }
    
}
