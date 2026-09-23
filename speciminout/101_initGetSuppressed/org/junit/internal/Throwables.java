package org.junit.internal;

import java.lang.reflect.Method;

public final class Throwables {

  private static Method initGetSuppressed() {
    try {
      return Throwable.class.getMethod("getSuppressed");
    } catch (Throwable e) {
      return null;
    }
  }
}
