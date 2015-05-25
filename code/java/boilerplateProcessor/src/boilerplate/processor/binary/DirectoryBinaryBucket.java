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

package boilerplate.processor.binary;

import java.io.File;
import java.net.URL;
import java.util.Iterator;

/**
 * Class for recursively loading class files from a directory location.
 * 
 * @author McDowell
 */
public class DirectoryBinaryBucket implements BinaryBucket {

    private final File directory;

    public DirectoryBinaryBucket(File directory) {
        this.directory = directory;
    }

    @Override
    public Binary findBinary(String className) {
        String filename = '/' + className.replace('.', '/') + ".class";
        ClassLoader cl = getClassLoader();
        URL url = cl.getResource(filename);
        if (url != null) {
            return new UrlBinary(className, url);
        }
        File file = new File(directory, filename);
        if (file.exists()) {
            return new FileBinary(className, file);
        }
        return null;
    }

    @Override
    public Iterator<Binary> iterator() {
        return new ClassFileIterator(directory);
    }

    private ClassLoader getClassLoader() {
        ClassLoader cl = Thread.currentThread().getContextClassLoader();
        if (cl == null) {
            cl = getClass().getClassLoader();
        }
        if (cl == null) {
            cl = ClassLoader.getSystemClassLoader();
        }
        return cl;
    }

}
