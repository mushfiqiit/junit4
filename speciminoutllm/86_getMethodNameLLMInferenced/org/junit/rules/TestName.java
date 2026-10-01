package org.junit.rules;

import javax.annotation.Nullable;

public class TestName extends TestWatcher {

  @Nullable private volatile String name;

  public @Nullable String getMethodName() {
    return name;
  }
}
