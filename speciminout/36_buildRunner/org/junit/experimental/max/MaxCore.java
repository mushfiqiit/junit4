package org.junit.experimental.max;

import javax.annotation.Nullable;
import junit.framework.TestSuite;
import org.junit.internal.runners.JUnit38ClassRunner;
import org.junit.runner.Description;
import org.junit.runner.Request;
import org.junit.runner.Runner;
import org.junit.runners.Suite;

public class MaxCore {

  private static final String MALFORMED_JUNIT_3_TEST_CLASS_PREFIX = null;

  private Runner buildRunner(Description each) {
    if (each.toString().equals("TestSuite with 0 tests")) {
      return Suite.emptySuite();
    }
    if (each.toString().startsWith(MALFORMED_JUNIT_3_TEST_CLASS_PREFIX)) {
      return new JUnit38ClassRunner(new TestSuite(getMalformedTestClass(each)));
    }
    Class<?> type = each.getTestClass();
    if (type == null) {
      throw new RuntimeException("Can't build a runner from description [" + each + "]");
    }
    String methodName = each.getMethodName();
    if (methodName == null) {
      return Request.aClass(type).getRunner();
    }
    return Request.method(type, methodName).getRunner();
  }

  @Nullable
  private Class<?> getMalformedTestClass(Description each) {
    throw new java.lang.Error();
  }
}
