/*
Copyright (c) 2011 McDowell

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

package tld.gurn.incidental.test;

import java.util.Map;

import javax.faces.webapp.UIComponentTag;

import org.junit.Assert;
import org.junit.Test;

import tld.gurn.incidental.Reflection;
import tld.gurn.incidental.Reflection.Setter;

public class ReflectionTest {

  @Test
  public void testTagReflection() {
    Map<String, Setter> setters = Reflection.setters(UIComponentTag.class);
    Assert.assertTrue(setters.size() > 0);
  }

  @Test
  public void testProperties() {
    Map<String, Class<?>> types = Reflection.getPropertyTypes(Foo.class);
    Assert.assertEquals(String.class, types.get("bar"));
  }

  public static class Foo {
    private String bar;

    public String getBar() {
      return bar;
    }

    public void setBar(String bar) {
      this.bar = bar;
    }
  }
}
