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

package boilerplate.processor;

import java.io.File;
import java.io.IOException;

import boilerplate.processor.binary.BinaryBucket;
import boilerplate.processor.binary.DirectoryBinaryBucket;
import boilerplate.processor.logging.DefaultMessageHandler;
import boilerplate.processor.logging.ErrorMessageCounter;
import boilerplate.processor.logging.MessageHandler;

/**
 * Main class for processing annotations.
 * 
 * @author McDowell
 */
public class Processor {

    /**
     * This method takes a single argument, a directory containing compiled
     * <CODE>.class</CODE> files.
     * 
     * @param args
     *            the directory to process
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Missing argument: directory");
            System.exit(1);
        }

        try {
            File directory = new File(args[0]);
            if (!directory.isDirectory()) {
                System.err.println("Directory not found: " + directory);
                System.exit(2);
            }

            MessageHandler logger = new DefaultMessageHandler();
            ErrorMessageCounter errorDetector = new ErrorMessageCounter(logger);

            BinaryBucket binaries = new DirectoryBinaryBucket(directory);
            BinaryProcessor processor = new BinaryProcessor(binaries,
                    errorDetector);
            processor.processAll();

            int errorCount = errorDetector.getErrorCount();
            if (errorCount > 0) {
                // TODO: formatting
                System.err.println(errorCount + " errors");
                System.exit(10);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(3);
        }
    }

}
