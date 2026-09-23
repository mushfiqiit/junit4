package org.junit.experimental.max;

import java.io.Serializable;
import java.util.Map;
import org.junit.runner.Description;

public class MaxHistory implements Serializable {

  private final Map<String, Long> fDurations;

  Long getTestDuration(Description key) {
    return fDurations.get(key.toString());
  }
}
