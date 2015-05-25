/*
Copyright (c) 2009 McDowell

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

package illegalargument.character;

import java.awt.Image;
import java.awt.Window;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Icons {

  private static Image I16 = load("icon16.png");
  private static Image I32 = load("icon32.png");
  private static Image I64 = load("icon64.png");

  private static List<Image> ICONS = Arrays.asList(I16, I32, I64);

  private static Image load(String name) {
    String path = "/" + Icons.class.getPackage().getName().replace('.', '/')
        + '/' + name;
    URL url = Icons.class.getResource(path);
    if (url == null) {
      throw new IllegalStateException("Can't find " + path);
    }
    return new ImageIcon(url).getImage();
  }

  public static void setIcon(JFrame frame) {
    try {
      // Java 1.6
      Method m = Window.class.getMethod("setIconImages", List.class);
      m.invoke(frame, ICONS);
    } catch (NoSuchMethodException e) {
      // failsafe
    } catch (IllegalAccessException e) {
      // failsafe
    } catch (InvocationTargetException e) {
      // failsafe
    }
    frame.setIconImage(I16);
  }

}
