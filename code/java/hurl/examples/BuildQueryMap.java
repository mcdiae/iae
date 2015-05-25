import hurl.build.QueryBuilder;
import hurl.parts.Query;

import java.net.URI;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Demonstrates using the API to build a query map.
 * 
 * @author McDowell
 */
public class BuildQueryMap {
  public static void main(String[] args) {
    URI uri = URI.create("http://foo/bar?selected=cat&selected=bacon");
    Map<String, List<String>> params = getParams(uri);
    System.out.println(params.get("selected"));
  }

  private static Map<String, List<String>> getParams(URI uri) {
    Map<String, List<String>> map = new HashMap<String, List<String>>();
    Query query = QueryBuilder.create().parse(uri.getRawQuery()).build();
    for (String key : query.getParamKeys()) {
      map.put(key, query.findValues(key));
    }
    return Collections.unmodifiableMap(map);
  }
}
