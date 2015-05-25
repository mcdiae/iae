/*
Copyright (c) 2010 McDowell

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

package console.demo.test;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.StringReader;

import org.junit.Test;

import console.TextDevice;
import console.TextDevices;
import console.demo.GuessNumberGame;
import console.demo.GuessNumberGame.NumberSource;

public class GuessNumberGameTest {

  /**
   * JUnit4 test
   */
  @Test
  public void testGame() {
    final int answer = 4;
    final String input = "1\n9\n2\n4\n";

    NumberSource numbers = new NumberSource() {
      @Override
      public int random(int max) {
        return answer - 1;
      }
    };
    BufferedReader reader = new BufferedReader(new StringReader(input));
    TextDevice fake = TextDevices.characterDevice(reader, new PrintWriter(
        System.out, true));

    GuessNumberGame game = new GuessNumberGame(numbers, fake);
    game.play();
  }
}
