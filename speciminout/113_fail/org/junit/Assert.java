package org.junit;

public class Assert {

  public static void fail(String message) {
    throw new java.lang.Error();
  }

  public static void fail() {
    fail(null);
  }
}
