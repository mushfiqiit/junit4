package org.junit.experimental.max;

import java.io.Serializable;
import java.util.Map;
import org.junit.runner.Description;

public class MaxHistory implements Serializable {

  private final Map<String, Long> fFailureTimestamps;

  Long getFailureTimestamp(Description key) {
    return fFailureTimestamps.get(key.toString());
  }
}
