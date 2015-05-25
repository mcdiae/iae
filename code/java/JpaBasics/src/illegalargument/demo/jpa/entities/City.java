/*
Copyright (c) 2009 McDowell

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

package illegalargument.demo.jpa.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity(name = "CITIES")
@NamedQueries(value = {
    @NamedQuery(name = City.QUERY_SELECTALL, query = "SELECT c FROM CITIES c ORDER BY c.name"),
    @NamedQuery(name = City.QUERY_SELECTNAME, query = "SELECT c FROM CITIES c WHERE c.name = :name"),
    @NamedQuery(name = City.QUERY_SELECTLIKE, query = "SELECT c FROM CITIES c WHERE c.name LIKE :name") })
public class City implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String QUERY_SELECTALL = "SelectAll";
  public static final String QUERY_SELECTNAME = "SelectName";
  public static final String QUERY_SELECTLIKE = "SelectLike";

  @Id
  @Column(name = "NAME")
  private String name;

  @Column(name = "POPULATION")
  private int population;

  // getters and setters elided

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPopulation() {
    return population;
  }

  public void setPopulation(int population) {
    this.population = population;
  }

  public String toString() {
    return name + " (population " + population + ")";
  }

}
