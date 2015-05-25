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

import java.io.IOException;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.util.CheckClassAdapter;

import boilerplate.processor.adapters.EqualsAdapter;
import boilerplate.processor.adapters.ToStringAdapter;
import boilerplate.processor.binary.Binary;
import boilerplate.processor.binary.BinaryBucket;
import boilerplate.processor.logging.MessageHandler;

/**
 * Class for processing class binaries.
 * 
 * @author McDowell
 */
public class BinaryProcessor {

    private final BinaryBucket binaries;
    private final MessageHandler logger;

    public BinaryProcessor(BinaryBucket binaries, MessageHandler logger) {
        this.binaries = binaries;
        this.logger = logger;
    }

    public void processAll() throws IOException {
        for (Binary classFile : binaries) {
            processBinary(classFile);
        }
    }

    public void processBinary(Binary binary) throws IOException {
        String type = binary.getClassName();
        type = type.replace('.', '/');
        byte[] data = binary.loadBytes();

        ClassReader reader = new ClassReader(data);
        ClassWriter writer = new ClassWriter(reader, ClassWriter.COMPUTE_FRAMES);

        ClassVisitor visitor = writer;
        visitor = new CheckClassAdapter(visitor);
        // visitor = new TraceClassVisitor(visitor, new
        // PrintWriter(System.out));
        visitor = new ToStringAdapter(logger, type, visitor);
        visitor = new EqualsAdapter(logger, type, visitor);

        reader.accept(visitor, 0);

        data = writer.toByteArray();
        binary.saveBytes(data);
    }

}
