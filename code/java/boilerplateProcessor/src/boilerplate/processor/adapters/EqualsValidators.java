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

package boilerplate.processor.adapters;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import boilerplate.equals.AutoEquals;
import boilerplate.processor.logging.Message;
import boilerplate.processor.logging.MessageHandler;
import boilerplate.processor.logging.Severity;

/**
 * Class for validating annotations.
 * 
 * @author McDowell
 */
class EqualsValidators {

    public static final List<Validator> VALIDATORS = createValidators();

    private static List<Validator> createValidators() {
        Validator[] validators = { new HasEqualsMethodError(),
                new HasHashCodeMethodError(),
                new RedundantTypeAnnotationWarning(),
                new AnnotatedStaticFieldError(), new UnannotatedFieldError(),
                new NoIncludedFieldsError(), };

        List<Validator> list = Arrays.asList(validators);
        return Collections.unmodifiableList(list);
    }

    private static class HasEqualsMethodError implements Validator {
        @Override
        public boolean validate(MessageHandler messageHandler, TypeInfo typeInfo) {
            if (typeInfo.hasEqualsMethod
                    && (typeInfo.typeIsAnnotated || typeInfo
                            .hasAnnotatedFields())) {
                Message message = new Message(Severity.ERROR, typeInfo.type,
                        AutoEquals.class,
                        "Cannot process type that already implements the equals(Object) method.");
                messageHandler.log(message);
                return false;
            }
            return true;
        }
    }

    private static class HasHashCodeMethodError implements Validator {
        @Override
        public boolean validate(MessageHandler messageHandler, TypeInfo typeInfo) {
            if (typeInfo.hasHashCodeMethod
                    && (typeInfo.typeIsAnnotated || typeInfo
                            .hasAnnotatedFields())) {
                Message message = new Message(Severity.ERROR, typeInfo.type,
                        AutoEquals.class,
                        "Cannot process type that already implements the hashCode() method.");
                messageHandler.log(message);
                return false;
            }
            return true;
        }
    }

    private static class RedundantTypeAnnotationWarning implements Validator {
        @Override
        public boolean validate(MessageHandler messageHandler, TypeInfo typeInfo) {
            if (typeInfo.typeIsAnnotated && typeInfo.hasAnnotatedFields()) {
                Message message = new Message(Severity.WARN, typeInfo.type,
                        AutoEquals.class, "Redundant annotation of type.");
                messageHandler.log(message);
            }
            // warnings return true
            return true;
        }
    }

    private static class AnnotatedStaticFieldError implements Validator {
        @Override
        public boolean validate(MessageHandler messageHandler, TypeInfo typeInfo) {
            boolean valid = true;
            for (FieldInfo info : typeInfo.fields) {
                if (info.isStatic) {
                    if (info.mark != Mark.UNMARKED) {
                        String desc = String
                                .format(
                                        "Field %1$s is static. Cannot include static field. Remove annotation.",
                                        info.name);
                        Message message = new Message(Severity.ERROR,
                                typeInfo.type, AutoEquals.class, desc);
                        messageHandler.log(message);
                        valid = false;
                    }
                }
            }
            return valid;
        }
    }

    private static class UnannotatedFieldError implements Validator {
        @Override
        public boolean validate(MessageHandler messageHandler, TypeInfo typeInfo) {
            boolean valid = true;
            if (typeInfo.hasAnnotatedFields()) {
                for (FieldInfo info : typeInfo.fields) {
                    if (info.mark == Mark.UNMARKED) {
                        String desc = String.format(
                                "Field %1$s is not annotated.", info.name);
                        Message message = new Message(Severity.ERROR,
                                typeInfo.type, AutoEquals.class, desc);
                        messageHandler.log(message);
                        valid = false;
                    }
                }
            }
            return valid;
        }
    }

    private static class NoIncludedFieldsError implements Validator {
        @Override
        public boolean validate(MessageHandler messageHandler, TypeInfo typeInfo) {
            if (typeInfo.hasAnnotatedFields()) {
                for (FieldInfo info : typeInfo.fields) {
                    if ((info.mark == Mark.INCLUDE) && (!info.isStatic)) {
                        // ok
                        return true;
                    }
                }
            } else {
                for (FieldInfo info : typeInfo.fields) {
                    if (!info.isStatic) {
                        // ok
                        return true;
                    }
                }
            }
            // error
            Message message = new Message(Severity.ERROR, typeInfo.type,
                    AutoEquals.class, "At least one field must be included.");
            messageHandler.log(message);
            return false;
        }
    }

}
