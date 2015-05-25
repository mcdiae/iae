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

package beans.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TableBean {

  private static final String BLACK_SPADE_SUIT = "\u2660";
  private static final String WHITE_HEART_SUIT = "\u2661";
  private static final String WHITE_DIAMOND_SUIT = "\u2662";
  private static final String BLACK_CLUB_SUIT = "\u2663";

  private static final List<String> SUITS = Arrays.asList(BLACK_SPADE_SUIT,
      WHITE_HEART_SUIT, WHITE_DIAMOND_SUIT, BLACK_CLUB_SUIT);

  private static final List<String> RANKS = Arrays.asList("A", "2", "3", "4",
      "5", "6", "7", "8", "9", "10", "J", "Q", "K");

  public List<List<String>> getCards() {
    List<List<String>> cards = new ArrayList<List<String>>();
    for (String suit : SUITS) {
      List<String> aSuit = new ArrayList<String>();
      for (String rank : RANKS) {
        aSuit.add(suit + " " + rank);
      }
      cards.add(aSuit);
    }
    return cards;
  }

}
