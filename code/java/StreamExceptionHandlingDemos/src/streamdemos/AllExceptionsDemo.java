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

import streamdemos.io.IOTaskHandler;

/**
 * Demonstration program that shows how to catch
 * all exceptions from an I/O operation.
 * 
 * @author McDowell
 */
public class AllExceptionsDemo extends IOTaskHandler {

	private byte[] data;

	public AllExceptionsDemo(byte[] data) {
		this.data = data;
	}

	/**
	 * return a stream that throws an exception on output and close
	 */
	private OutputStream openStream() {
		return new OutputStream() {
			@Override
			public void write(int b) throws IOException {
				throw new RuntimeException("out:write - not even an IOException");
			}

			@Override
			public void close() throws IOException {
				throw new IOException("out:close");
			}
		};
	}

	@Override
	protected void doCallback() throws IOException {
		OutputStream stream = openStream();
		registerResource(stream);

		stream.write(data);
	}

	public static void main(String[] args) {
		byte[] data = { 1 };
		AllExceptionsDemo handler = new AllExceptionsDemo(data);
		try {
			handler.run();
			System.out.println("OK");
		} catch (IOException e) {
			System.err.println("ERROR");
			e.printStackTrace();
		} catch (RuntimeException e) {
			System.err.println("ERROR");
			e.printStackTrace();
		}
	}

}
