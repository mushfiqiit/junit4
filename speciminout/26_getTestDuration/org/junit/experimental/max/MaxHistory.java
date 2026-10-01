package org.junit.experimental.max;

import java.io.Serializable;
import java.util.Map;
import javax.annotation.Nonnull;
import org.junit.runner.Description;

public class MaxHistory implements Serializable {

  private final Map<String, Long> fDurations = null;

  @Nonnull
  Long getTestDuration(Description key) {
    return fDurations.get(key.toString());
  }
}
