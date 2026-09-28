package org.junit.experimental.max;

import java.io.Serializable;
import java.util.Map;
import javax.annotation.Nullable;
import org.junit.runner.Description;

public class MaxHistory implements Serializable {

  private final Map<String, Long> fFailureTimestamps;

  @Nullable Long getFailureTimestamp(Description key) {
    return fFailureTimestamps.get(key.toString());
  }
}
