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

package boilerplate.test.tostring;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import boilerplate.test.BPUtil;
import boilerplate.test.tostring.AutoToStringTypes;

public class AutoToStringTypesTest {

    AutoToStringTypes impl;
    String stringForm;

    @Before
    public void setUp() {
        impl = new AutoToStringTypes();
        stringForm = impl.toString();
    }

    @Test
    public void testImplemented() {
        BPUtil.assertImplementsToString(AutoToStringTypes.class);
    }

    @Test
    public void testMembers() {
        // TODO
        Assert.assertTrue(stringForm.contains(impl.mString));
    }

}
