package org.junit.runners;

import org.junit.runner.Runner;

public class Suite extends ParentRunner<Runner> {

  public static Runner emptySuite() {
    throw new java.lang.Error();
  }
}
