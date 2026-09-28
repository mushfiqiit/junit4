package org.junit.experimental.max;

import java.io.Serializable;
import java.util.Map;
import javax.annotation.Nullable;
import org.junit.runner.Description;

public class MaxHistory implements Serializable {

  private final Map<String, Long> fDurations;

  @Nullable
  Long getTestDuration(Description key) {
    return fDurations.get(key.toString());
  }
}
