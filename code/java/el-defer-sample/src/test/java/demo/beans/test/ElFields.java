package demo.beans.test;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import demo.faces.defer.el.EL;

/**
 * An simple reflection-based field value injector for unit testing.
 * 
 * @author McDowell
 * @param <T>
 *          the type to inject into
 */
public final class ElFields<T> {
  private final T t;
  private final Map<String, Field> fields = new HashMap<String, Field>();

  private ElFields(T t) {
    this.t = t;
    for (Field field : t.getClass().getDeclaredFields()) {
      EL el = field.getAnnotation(EL.class);
      fields.put(el.value(), field);
    }
  }

  /**
   * Factory method.
   * 
   * @param target
   *          the instance into which to inject values
   * @return a new injector instance
   */
  public static <T> ElFields<T> forExpressionsIn(T target) {
    return new ElFields<T>(target);
  }

  /**
   * Sets a field on the wrapped instance
   * 
   * @param expression
   *          the annotated field EL expression
   * @param value
   *          the value to inject (may be null)
   * @return this
   */
  public ElFields<T> set(String expression, Object value) {
    Field field = fields.get(expression);
    if (field == null) {
      throw new IllegalArgumentException(expression);
    }
    field.setAccessible(true);
    try {
      field.set(t, value);
    } catch (IllegalAccessException e) {
      throw new IllegalStateException(e);
    }
    return this;
  }

  /**
   * @return the wrapped instance
   */
  public T done() {
    return t;
  }
}
