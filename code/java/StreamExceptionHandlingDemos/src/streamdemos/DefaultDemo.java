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

package streamdemos;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Demonstrates how this OK stream handling technique
 * can hide exceptions.
 * 
 * @author McDowell
 */
public class DefaultDemo {

	/**
	 * return a stream that throws an exception on 
	 * output and close
	 */
	private OutputStream openStream() {
		return new OutputStream() {
			@Override
			public void write(int b) throws IOException {
				System.out.println("Writing: " + b);
				System.out.println("Throwing Exception");
				throw new IOException();
			}

			@Override
			public void close() throws IOException {
				System.out.println("Stream closed");
				System.out.println("Throwing Exception");
				throw new IOException();
			}
		};
	}

	/**
	 * Writes data to a stream
	 */
	public void sendToStream(byte[] data) throws IOException {
		OutputStream stream = openStream();
		try {
			throw new RuntimeException();
			//stream.write(data);
		} finally {
			stream.close();
		}
	}

	public static void main(String[] args) {
		byte[] data = { 1 };
		DefaultDemo handler = new DefaultDemo();
		try {
			handler.sendToStream(data);
			System.out.println("OK");
		} catch (IOException e) {
			System.err.println("ERROR");
			e.printStackTrace();
		}
	}

}
