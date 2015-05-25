/*
Copyright (c) 2012 McDowell

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
package demo.beans.test;

import static demo.beans.test.ElFields.forExpressionsIn;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import demo.beans.Delta;
import demo.faces.defer.Property;

@RunWith(Parameterized.class)
public class DeltaTest {
  private String[] params;

  public DeltaTest(String[] params) {
    this.params = params;
  }

  @Parameters
  public static Collection<Object[]> data() {
    String[] nothing = null;
    String[] zero = {};
    String[] n = { "bar", "baz" };
    Object[][] data = { { nothing }, { zero }, { n } };
    return Arrays.asList(data);
  }

  @Test
  public void delta() {
    // mock the property
    Property foo = mock(Property.class);
    when(foo.get()).thenReturn(params);
    // instantiate the test bean and set mocks
    Delta delta = forExpressionsIn(new Delta()).set("#{paramValues.foo}", foo)
        .done();
    // test the class
    int expectedCount = (params == null) ? 0 : params.length;
    assertEquals(expectedCount, delta.getFooParamCount());
  }
}
