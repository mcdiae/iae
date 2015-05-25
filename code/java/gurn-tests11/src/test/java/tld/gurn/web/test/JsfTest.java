package tld.gurn.web.test;

import java.net.URL;

import org.jsoup.nodes.Document;

public interface JsfTest {
  public URL getPage();

  public void test(Document document);
}
