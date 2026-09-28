package org.junit.experimental.max;

import org.junit.runner.Description;

public class MaxCore {

  private static final String MALFORMED_JUNIT_3_TEST_CLASS_PREFIX;

  private Class<?> getMalformedTestClass(Description each) {
    try {
      return Class.forName(each.toString().replace(MALFORMED_JUNIT_3_TEST_CLASS_PREFIX, ""));
    } catch (ClassNotFoundException e) {
      return null;
    }
  }
}
