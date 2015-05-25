package demo.faces.defer.el.test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public final class Serialization {
  private Serialization() {}

  public static <T> T testPassivation(T t) {
    try {
      return round(t);
    } catch (IOException e) {
      throw new IllegalArgumentException(e);
    } catch (ClassNotFoundException e) {
      throw new IllegalArgumentException(e);
    }
  }

  private static <T> T round(T t) throws IOException, ClassNotFoundException {
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    ObjectOutputStream oos = new ObjectOutputStream(baos);
    oos.writeObject(t);
    oos.close();
    ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
    ObjectInputStream ois = new ObjectInputStream(bais);
    @SuppressWarnings("unchecked")
    T deser = (T) ois.readObject();
    return deser;
  }
}
