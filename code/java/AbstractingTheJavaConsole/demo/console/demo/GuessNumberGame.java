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

package console.demo;

import java.util.Random;

import console.TextDevice;
import console.TextDevices;

/**
 * A simple text-entry game.
 * 
 * @author McDowell
 */
public class GuessNumberGame {
  private final TextDevice io;
  private final NumberSource numbers;

  public GuessNumberGame(NumberSource numbers, TextDevice io) {
    this.numbers = numbers;
    this.io = io;
  }

  public void play() {
    int max = 10;
    int n = numbers.random(10) + 1;
    io.printf("Guess a number between 1 and %d%n", max);
    for (int i = 0;; i++) {
      int guess = readNumber();
      if (guess > n) {
        io.printf("Lower!%n");
      } else if (guess < n) {
        io.printf("Higher!%n");
      } else {
        io.printf("Won in %d moves%n", i);
        break;
      }
    }
  }

  private int readNumber() {
    while (true) {
      try {
        return Integer.parseInt(io.readLine());
      } catch (NumberFormatException e) {}
    }
  }

  public static void main(String[] args) {
    final Random ran = new Random();
    NumberSource numbers = new NumberSource() {
      @Override
      public int random(int max) {
        return ran.nextInt(max);
      }
    };
    new GuessNumberGame(numbers, TextDevices.defaultTextDevice()).play();
  }

  public static interface NumberSource {
    public int random(int max);
  }
}
