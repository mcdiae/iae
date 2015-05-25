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
import org.junit.Test;

import boilerplate.test.BPUtil;
import boilerplate.test.equals.AutoEqualsFieldImpl;

public class AutoEqualsFieldImplTest {

    @Test
    public void testImplementation() {
        BPUtil.assertImplementsEquals(AutoEqualsFieldImpl.class);

        AutoEqualsFieldImpl o1 = new AutoEqualsFieldImpl();
        AutoEqualsFieldImpl o2 = new AutoEqualsFieldImpl();
        AutoEqualsFieldImpl o3 = new AutoEqualsFieldImpl();
        BPUtil.assertEqualsContract(o1, o2, o3);

        Assert.assertFalse(o1.equals("Foo"));

        Assert.assertTrue(o1.equals(o2));
        Assert.assertTrue(o1.hashCode() == o2.hashCode());

        o2.notsignificant = "Blahblahblah" + System.currentTimeMillis();
        Assert.assertTrue(o1.equals(o2));
        Assert.assertTrue(o1.hashCode() == o2.hashCode());

        o2.significant = "Blahblahblah" + System.currentTimeMillis();
        Assert.assertFalse(o1.equals(o2));
    }

}
