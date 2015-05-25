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

package demo;

import junit.framework.TestCase;

//JUnit 3
public class IdMutexProviderTest extends TestCase {

public void testNPE() {
 IdMutexProvider imp = new IdMutexProvider();
 try {
   imp.getMutex(null);
   fail("Did not throw NullPointerException");
 } catch (NullPointerException e) {
 }
}

public void testSynchObject() {
 IdMutexProvider imp = new IdMutexProvider();
 // an id
 String id1a = "id1";
 // same id value; different key instance
 String id1b = new String(id1a);
 // a different id
 String id2 = "id2";

 // assert inequality of String id reference values
 assertFalse(id1a == id1b);
 assertFalse(id1a == id2);

 IdMutexProvider.Mutex m1a = imp.getMutex(id1a);
 System.out.println(m1a);
 assertNotNull(m1a);
 assertTrue(imp.getMutexCount() == 1);

 IdMutexProvider.Mutex m1b = imp.getMutex(id1b);
 System.out.println(m1b);
 assertNotNull(m1b);
 assertTrue(m1a == m1b);
 assertTrue(imp.getMutexCount() == 1);

 IdMutexProvider.Mutex m2 = imp.getMutex(id2);
 System.out.println(m2);
 assertNotNull(m2);
 assertTrue(imp.getMutexCount() == 2);
 assertFalse(m2 == m1a);
}

public void testForMemoryLeak() {
 System.out.println("Testing for memory leaks; wait...");

 IdMutexProvider imp = new IdMutexProvider();

 int creationCount = 0;
 while (true) {
   if (creationCount == Integer.MAX_VALUE) {
     fail("Memory leak");
   }

   creationCount++;
   imp.getMutex("" + creationCount);
   if (imp.getMutexCount() < creationCount) {
     // then some garbage collection has
     // removed entries from the map
     break;
   }

   // encourage the garbage collector
   if (creationCount % 10000 == 0) {
     System.out.println(creationCount);
     System.gc();
     try {
       Thread.sleep(5000);
     } catch (InterruptedException e) {
     }
   }
 }
}

}