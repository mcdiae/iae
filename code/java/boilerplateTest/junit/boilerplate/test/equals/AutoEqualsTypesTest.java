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

package boilerplate.test.equals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import boilerplate.test.BPUtil;
import boilerplate.test.equals.AutoEqualsTypes;

public class AutoEqualsTypesTest {

    private AutoEqualsTypes o1;
    private AutoEqualsTypes o2;
    private AutoEqualsTypes o3;

    @Before
    public void setUp() {
        o1 = new AutoEqualsTypes();
        o2 = new AutoEqualsTypes();
        //for Liskov substution principle
        o3 = new AutoEqualsTypes() {/*subclass*/};

        // this type will be unequal by default
        o2.mObject = o1.mObject;
        o3.mObject = o1.mObject;
    }

    @Test
    public void testDefault() {
        Assert.assertTrue(o1.equals(o2));
        Assert.assertTrue(o1.equals(o3));
        
        BPUtil.assertEqualsContract(o1, o2, o3);
    }

    @Test
    public void testString() {
        o1.mString = "" + System.currentTimeMillis();
        Assert.assertFalse(o1.equals(o2));
        o1.mString = null;
        Assert.assertFalse(o1.equals(o2));
        o2.mString = null;
        Assert.assertTrue(o1.equals(o2));
        
        BPUtil.assertEqualsContract(o1, o2, o3);
    }

    @Test
    public void testObject() {
        o1.mObject = new Object();
        Assert.assertFalse(o1.equals(o2));
    }

    @Test
    public void testArray() {
        o1.mArray = new String[0];
        Assert.assertFalse(o1.equals(o2));
        o1.mArray = null;
        Assert.assertFalse(o1.equals(o2));
        o2.mArray = null;
        Assert.assertTrue(o1.equals(o2));
    }

    @Test
    public void testBoolean() {
        o1.mBoolean = !o1.mBoolean;
        Assert.assertFalse(o1.equals(o2));
    }

    @Test
    public void testChar() {
        o1.mChar++;
        Assert.assertFalse(o1.equals(o2));
    }

    @Test
    public void testByte() {
        o1.mByte++;
        Assert.assertFalse(o1.equals(o2));
    }

    @Test
    public void testShort() {
        o1.mShort++;
        Assert.assertFalse(o1.equals(o2));
    }

    @Test
    public void testInt() {
        o1.mInt++;
        Assert.assertFalse(o1.equals(o2));
    }

    @Test
    public void testLong() {
        o1.mLong++;
        Assert.assertFalse(o1.equals(o2));
    }

    @Test
    public void testFloat() {
        o1.mFloat++;
        Assert.assertFalse(o1.equals(o2));
    }

    @Test
    public void testDouble() {
        o1.mDouble++;
        Assert.assertFalse(o1.equals(o2));
    }

}
