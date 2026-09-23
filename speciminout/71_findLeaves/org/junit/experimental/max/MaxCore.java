package org.junit.experimental.max;

import java.util.ArrayList;
import java.util.List;
import org.junit.runner.Description;
import org.junit.runner.Request;

public class MaxCore {

  private List<Description> findLeaves(Request request) {
    List<Description> results = new ArrayList<Description>();
    findLeaves(null, request.getRunner().getDescription(), results);
    return results;
  }

  private void findLeaves(Description parent, Description description, List<Description> results) {
    throw new java.lang.Error();
  }
}
