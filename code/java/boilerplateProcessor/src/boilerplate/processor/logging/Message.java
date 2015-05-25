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

import java.lang.annotation.Annotation;

/**
 * Logging message class.
 * 
 * @author McDowell
 */
public class Message {

    private final Severity severity;
    private final String javaType;
    private final Class<? extends Annotation> annotation;
    private final String description;

    public Message(Severity severity, String javaType,
            Class<? extends Annotation> annotation, String description) {
        if (severity == null || javaType == null || annotation == null
                || description == null) {
            throw new NullPointerException();
        }
        this.severity = severity;
        this.javaType = javaType;
        this.annotation = annotation;
        this.description = description;
    }

    public Severity getSeverity() {
        return severity;
    }

    public String getJavaType() {
        return javaType;
    }

    public Class<? extends Annotation> getAnnotationType() {
        return annotation;
    }

    public String getDescription() {
        return description;
    }

    public String toString() {
        final String endl = System.getProperty("line.separator");
        StringBuilder builder = new StringBuilder();
        builder.append(severity).append(": ").append(annotation.getName())
                .append(endl);
        builder.append(javaType).append(": ").append(description);
        return builder.toString();
    }

}
