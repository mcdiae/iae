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

package streamdemos.io;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A generic I/O operation handler.
 * 
 * @author McDowell
 */
public abstract class IOTaskHandler {

	private List<Throwable> errorList = null;

	private boolean runtimeErrors = false;

	private List<Closeable> resources = null;

	private boolean hasRun = false;

	private List<Throwable> getErrorList() {
		if (errorList == null) {
			errorList = new ArrayList<Throwable>();
		}
		return errorList;
	}

	private List<Closeable> getResourceList() {
		if (resources == null) {
			resources = new ArrayList<Closeable>();
		}
		return resources;
	}

	/**
	 * Callers should invoke the handler via this method.
	 */
	public final void run() throws IOException {
		if (hasRun) {
			throw new IllegalStateException("Closed");
		}
		hasRun = true;

		try {
			runCallbackAndClose();
		} finally {
			if (errorList != null) {
				if (runtimeErrors) {
					throw new CompositeRuntimeException(errorList);
				} else {
					throw new CompositeIOException(errorList);
				}

			}
		}
	}

	private void runCallbackAndClose() {
		try {
			// perform the task
			doCallback();
		} catch (IOException e) {
			getErrorList().add(e);
		} catch (RuntimeException e) {
			runtimeErrors = true;
			getErrorList().add(e);
		} finally {
			// do cleanup resources
			close();
		}
	}

	private void close() {
		if (resources == null) {
			return;
		}

		for (Closeable resource : resources) {
			try {
				resource.close();
			} catch (IOException e) {
				getErrorList().add(e);
			} catch (RuntimeException e) {
				runtimeErrors = true;
				getErrorList().add(e);
			}
		}
	}

	/**
	 * All streams should be registered via this method. Streams will be closed
	 * in reverse order to the one they were added.
	 */
	protected void registerResource(Closeable resource) {
		if (resource == null) {
			throw new NullPointerException();
		}
		getResourceList().add(0, resource);
	}

	/**
	 * I/O operations should be implemented in this method. This method should
	 * only be invoked by IOTaskHandler.
	 */
	protected abstract void doCallback() throws IOException;

}
