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

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * Object representing a class file from a URL location.
 * 
 * @author McDowell
 */
public class UrlBinary implements Binary {

    private final String name;
    private final URL url;

    protected UrlBinary(String name, URL url) {
        this.url = url;
        this.name = name;
    }

    /**
     * Returns false.
     */
    @Override
    public boolean canWrite() {
        return false;
    }

    @Override
    public String getClassName() {
        return name;
    }

    @Override
    public URL getUrl() {
        return url;
    }

    @Override
    public byte[] loadBytes() throws IOException {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        URL url = getUrl();
        InputStream in = url.openStream();
        try {
            byte[] barr = new byte[1024];
            while (true) {
                int r = in.read(barr);
                if (r <= 0) {
                    break;
                }
                buffer.write(barr, 0, r);
            }
        } finally {
            in.close();
        }
        return buffer.toByteArray();
    }

    @Override
    public void saveBytes(byte[] bytes) throws IOException {
        throw new UnsupportedOperationException();
    }

}
