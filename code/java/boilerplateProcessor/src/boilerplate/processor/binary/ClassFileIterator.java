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
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

class ClassFileIterator implements Iterator<Binary> {

    private File directory;
    private Iterator<Binary> files;

    public ClassFileIterator(File directory) {
        this.directory = directory;
    }

    private Iterator<Binary> getFiles() {
        if (files == null) {
            final List<Binary> list = new ArrayList<Binary>();
            final Stack<String> namespace = new Stack<String>();

            FileFilter filter = new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    if (pathname.isDirectory()) {
                        namespace.push(pathname.getName());
                        try {
                            pathname.listFiles(this);
                        } finally {
                            namespace.pop();
                        }
                    } else if (pathname.getName().endsWith(".class")) {
                        String name = toClassName(namespace, pathname);
                        list.add(new FileBinary(name, pathname));
                    }
                    return false;
                }

                private String toClassName(Collection<String> namespace,
                        File file) {
                    StringBuilder builder = new StringBuilder();
                    for (String pack : namespace) {
                        if (builder.length() > 0) {
                            builder.append('.');
                        }
                        builder.append(pack);
                    }
                    if (builder.length() > 0) {
                        builder.append('.');
                    }
                    String name = file.getName();
                    builder.append(name, 0, name.length() - ".class".length());
                    return builder.toString();
                }
            };
            directory.listFiles(filter);
            files = list.iterator();
        }
        return files;
    }

    @Override
    public boolean hasNext() {
        return getFiles().hasNext();
    }

    @Override
    public Binary next() {
        return getFiles().next();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

}
