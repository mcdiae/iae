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

public class AutoEqualsArrayTypesTest {

    private AutoEqualsArrayTypes o1;
    private AutoEqualsArrayTypes o2;
    private AutoEqualsArrayTypes o3;

    @Before
    public void setUp() {
        o1 = new AutoEqualsArrayTypes();
        o2 = new AutoEqualsArrayTypes();
        o3 = new AutoEqualsArrayTypes() {/* subclass */
        };

        // these types will be unequal by default
        o2.mObjectArray = o1.mObjectArray;
        o2.mDeepIntArray = o1.mDeepIntArray;
        o3.mObjectArray = o1.mObjectArray;
        o3.mDeepIntArray = o1.mDeepIntArray;
    }

    @Test
    public void testDefault() {
        BPUtil.assertEqualsContract(o1, o2, o3);

        Assert.assertTrue(o1.equals(o2));
        Assert.assertTrue(o1.equals(o3));
    }

    @Test
    public void testChange() {
        o1.mArray = null;
        o1.mBooleanArray = null;
        o1.mByteArray = null;
        o1.mCharArray = null;
        o1.mDeepIntArray = null;
        o1.mDoubleArray = null;
        o1.mFloatArray = null;
        o1.mIntArray = null;
        o1.mLongArray = null;
        o1.mObjectArray = null;
        o1.mShortArray = null;

        Assert.assertFalse(o1.equals(o2));
        Assert.assertFalse(o1.equals(o3));

        BPUtil.assertEqualsContract(o1, o2, o3);
    }

}
