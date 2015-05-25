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

package boilerplate.processor.logging;

/**
 * Message handler that records the number of messages with an error severity
 * that have been logged.
 * 
 * @author McDowell
 */
public class ErrorMessageCounter implements MessageHandler {

    private MessageHandler delegate;
    private int errors = 0;

    public ErrorMessageCounter(MessageHandler delegate) {
        this.delegate = delegate;
    }

    @Override
    public void log(Message message) {
        Severity sev = message.getSeverity();
        if (sev == Severity.ERROR) {
            errors++;
        }

        delegate.log(message);
    }

    public int getErrorCount() {
        return errors;
    }

}
