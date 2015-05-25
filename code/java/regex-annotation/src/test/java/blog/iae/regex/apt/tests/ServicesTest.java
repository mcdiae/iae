package blog.iae.regex.apt.tests;

import java.util.Iterator;
import java.util.ServiceLoader;

import javax.annotation.processing.Processor;

import org.junit.Test;

public class ServicesTest {
  @Test
  public void testServicesExist() {
    ServiceLoader<Processor> loader = ServiceLoader.load(Processor.class);
    Iterator<Processor> iterator = loader.iterator();
    while (iterator.hasNext()) {
      iterator.next();
    }
  }
}
