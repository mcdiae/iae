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

package illegalargument.demo.jpa.application.commands;

import illegalargument.demo.jpa.application.Command;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class Delete implements Command {

  @Override
  public void execute(EntityManager manager, String[] commands) {
    if (commands.length != 2 || !commands[0].equals(name())) {
      System.err.println("ERROR! Usage: " + usage());
      return;
    }

    EntityTransaction transaction = manager.getTransaction();
    transaction.begin();
    Query query = manager
        .createQuery("DELETE FROM CITIES c WHERE c.name = :name");
    query.setParameter("name", commands[1]);
    query.executeUpdate();
    transaction.commit();
  }

  @Override
  public String name() {
    return "delete";
  }

  @Override
  public String usage() {
    return "delete NEWYORK";
  }
}
