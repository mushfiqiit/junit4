package org.junit.experimental.max;

import java.io.Serializable;
import java.util.Comparator;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.junit.runner.Description;

public class MaxHistory implements Serializable {

  boolean isNewTest(Description key) {
    throw new java.lang.Error();
  }

  @Nonnull
  Long getTestDuration(Description key) {
    throw new java.lang.Error();
  }

  private class TestComparator implements Comparator<Description> {

    public int compare(Description o1, Description o2) {
      if (isNewTest(o1)) {
        return -1;
      }
      if (isNewTest(o2)) {
        return 1;
      }
      int result = getFailure(o2).compareTo(getFailure(o1));
      return result != 0 ? result : getTestDuration(o1).compareTo(getTestDuration(o2));
    }

    private Long getFailure(Description key) {
      throw new java.lang.Error();
    }
  }
}
