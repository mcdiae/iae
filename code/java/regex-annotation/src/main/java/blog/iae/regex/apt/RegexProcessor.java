/*
Copyright (c) 2013 McDowell

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
package blog.iae.regex.apt;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import javax.tools.Diagnostic.Kind;

import blog.iae.regex.annotation.RegexSyntax;

/**
 * An annotation processor for checking regular expression syntax on string
 * constants.
 * 
 * @see RegexSyntax
 */
public final class RegexProcessor extends AbstractProcessor {

  private ProcessingEnvironment env;

  @Override
  public synchronized void init(ProcessingEnvironment processingEnv) {
    this.env = processingEnv;
    super.init(processingEnv);
  }

  /**
   * Processes elements annotated with {@link RegexSyntax}.
   */
  @Override
  public boolean process(Set<? extends TypeElement> annotations,
      RoundEnvironment roundEnv) {
    for (Element target : roundEnv.getElementsAnnotatedWith(RegexSyntax.class)) {
      if (isVariable(target) && isFinal(target) && isStringConstant(target))
        validateExpression(target);
    }
    return true;
  }

  /**
   * Emits an error if the string is not legal regular expression syntax.
   * 
   * @see ProcessingEnvironment
   * @see Pattern
   */
  private void validateExpression(Element element) {
    VariableElement variable = (VariableElement) element;
    String pattern = variable.getConstantValue().toString();
    try {
      int flags = element.getAnnotation(RegexSyntax.class).flags();
      Pattern.compile(pattern, flags);
    } catch (PatternSyntaxException e) {
      String err = RegexSyntax.class.getName() + ": " + e.getLocalizedMessage();
      env.getMessager().printMessage(Kind.ERROR, err, element);
    }
  }

  /**
   * @return true if variable has {@code final} modifier.
   */
  private boolean isFinal(Element element) {
    if (element.getModifiers().contains(Modifier.FINAL)) {
      return true;
    }
    String err = "Fields annotated with " + RegexSyntax.class.getName()
        + " must be marked final";
    env.getMessager().printMessage(Kind.ERROR, err, element);
    return false;
  }

  /**
   * @return true if right-hand side evaluates to string constant.
   */
  private boolean isStringConstant(Element element) {
    VariableElement variable = (VariableElement) element;
    if (variable.getConstantValue() instanceof String) {
      return true;
    }
    String err = "Fields annotated with " + RegexSyntax.class.getName()
        + " must reference a string literal";
    env.getMessager().printMessage(Kind.ERROR, err, element);
    return false;
  }

  /**
   * @return true if annotated element is a variable.
   */
  private boolean isVariable(Element element) {
    if (element instanceof VariableElement) {
      return true;
    }
    String err = "Annotation " + RegexSyntax.class.getName()
        + " can only be set on variables";
    env.getMessager().printMessage(Kind.ERROR, err, element);
    return false;
  }

  @Override
  public Set<String> getSupportedAnnotationTypes() {
    return new HashSet<String>(Arrays.asList(RegexSyntax.class.getName()));
  }

  @Override
  public SourceVersion getSupportedSourceVersion() {
    return SourceVersion.latest();
  }

}
