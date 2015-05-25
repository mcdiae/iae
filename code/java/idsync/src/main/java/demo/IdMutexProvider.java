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

import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/**
 * Code from the post <a href=
 * "http://illegalargumentexception.blogspot.co.uk/2008/04/java-synchronizing-on-transient-id.html"
 * >Java: synchronizing on an ID</a>
 * 
 * @author McDowell
 */
public class IdMutexProvider {

  private final Map mutexMap = new WeakHashMap();

  /** Get a mutex object for the given (non-null) id. */
  public Mutex getMutex(String id) {
    if (id == null) {
      throw new NullPointerException();
    }

    Mutex key = new MutexImpl(id);
    synchronized (mutexMap) {
      WeakReference ref = (WeakReference) mutexMap.get(key);
      if (ref == null) {
        mutexMap.put(key, new WeakReference(key));
        return key;
      }
      Mutex mutex = (Mutex) ref.get();
      if (mutex == null) {
        mutexMap.put(key, new WeakReference(key));
        return key;
      }
      return mutex;
    }
  }

  /** Get the number of mutex objects being held */
  public int getMutexCount() {
    synchronized (mutexMap) {
      return mutexMap.size();
    }
  }

  public static interface Mutex {}

  private static class MutexImpl implements Mutex {
    private final String id;

    protected MutexImpl(String id) {
      this.id = id;
    }

    public boolean equals(Object o) {
      if (o == null) {
        return false;
      }
      if (this.getClass() == o.getClass()) {
        return this.id.equals(o.toString());
      }
      return false;
    }

    public int hashCode() {
      return id.hashCode();
    }

    public String toString() {
      return id;
    }
  }

}