package hurl.build.test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import hurl.build.FragmentBuilder;
import hurl.build.PathBuilder;
import hurl.build.QueryBuilder;
import hurl.build.UrlDefaults;
import hurl.escape.Escaper;
import hurl.escape.prep.ProhibitedException;

import org.junit.Test;

public class UrlDefaultsTest {

  @Test
  public void testDefaults() {
    assertTrue("fragment", UrlDefaults.fragmentEscaper() == FragmentBuilder
        .create().getEscaper());
    assertTrue("query", UrlDefaults.queryEscaper() == QueryBuilder.create()
        .getEscaper());
    assertTrue("path", UrlDefaults.pathEscaper() == PathBuilder.create()
        .getEscaper());
    assertTrue("query", UrlDefaults.queryDelimiter() == QueryBuilder.create()
        .getDelimiter());
    assertTrue("path", UrlDefaults.pathDelimiter() == PathBuilder.create()
        .getDelimiter());
  }

  @Test
  public void testHtml4Fragments() {
    // must match id restrictions
    Escaper html4 = UrlDefaults.html4FragmentEscaper();

    String[] valid = { "a:::::::....-____", "abc123", "ABC123" };
    String[] invalid = { "1", ":", "-", ".", "{}", "%" };

    for (String id : valid) {
      html4.escape(id);
    }

    for (String id : invalid) {
      try {
        html4.escape(id);
        fail(id);
      } catch (ProhibitedException e) {
        // good
      }
    }
  }

}
