package junit.runner;

import javax.annotation.Nullable;
import junit.framework.Test;
import junit.framework.TestListener;

public abstract class BaseTestRunner implements TestListener {

  @Nullable
  public Test getTest(String suiteClassName) {
    throw new java.lang.Error();
  }

  public String extractClassName(String className) {
    throw new java.lang.Error();
  }
}
