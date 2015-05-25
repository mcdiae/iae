package tld.gurn.web.test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestJetty {

  private static final int TEN_SECONDS = 10 * 1000;

  @Parameters
  public static Collection<Object[]> getPageTests() throws IOException,
      URISyntaxException {
    List<Object[]> tests = new ArrayList<Object[]>();

    URL home = new URL("http://localhost:8080/gurn-tests11/indexfaces.faces");
    Document doc = Jsoup.parse(home, TEN_SECONDS);
    for (Element anchor : doc.getElementsByTag("a")) {
      String href = anchor.attr("href");
      URL page = home.toURI()
          .resolve(href)
          .toURL();
      tests.add(new Object[] { page });
    }

    return tests;
  }

  private final URL page;

  public TestJetty(URL page) {
    this.page = page;
  }

  @Test
  public void testLoadPage() throws IOException {
    System.out.println("Loading " + page);
    Jsoup.parse(page, TEN_SECONDS);
  }
}
