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

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import streamdemos.io.IOTaskHandler;

/**
 * Culmination of techniques described in a simulated
 * file copy application.
 * 
 * @author McDowell
 */
public class SimulatedFileCopyDemo extends IOTaskHandler {

	private File infile;
	private File outfile;

	public SimulatedFileCopyDemo(File infile, File outfile) {
		this.infile = infile;
		this.outfile = outfile;
	}

	/** return a stream that throws an exception on output and close */
	private OutputStream openOutputStream(File file) {
		return new OutputStream() {
			@Override
			public void write(int b) throws IOException {
				throw new IOException("out:write");
			}

			@Override
			public void close() throws IOException {
				throw new IOException("out:close");
			}
		};
	}

	/** return a stream that throws an exception on input and close */
	private InputStream openInputStream(File file) {
		return new InputStream() {
			@Override
			public int read() throws IOException {
				throw new RuntimeException("in:read - not even an IOException");
			}

			@Override
			public void close() throws IOException {
				throw new IOException("in:close");
			}
		};
	}

	private void copy(InputStream in, OutputStream out) throws IOException {
		byte[] buffer = new byte[1024];
		while (true) {
			int r = in.read(buffer);
			if (r <= 0) {
				break;
			}
			out.write(buffer, 0, r);
		}
	}

	@Override
	protected void doCallback() throws IOException {
		InputStream in = openInputStream(infile);
		registerResource(in);

		OutputStream out = openOutputStream(outfile);
		registerResource(out);

		copy(in, out);
	}

	public static void main(String[] args) {
		File infile = new File("infile.txt");
		File outfile = new File("outfile.txt");
		SimulatedFileCopyDemo handler = new SimulatedFileCopyDemo(infile,
				outfile);
		try {
			handler.run();
			System.out.println("OK");
		} catch (IOException e) {
			System.err.println("ERROR");
			e.printStackTrace();
		}
	}

}
