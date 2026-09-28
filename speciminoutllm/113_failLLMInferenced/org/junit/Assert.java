package org.junit;

import javax.annotation.Nullable;

public class Assert {

  public static void fail(@Nullable String message) {
    throw new java.lang.Error();
  }

  public static void fail() {
    fail(null);
  }
}
