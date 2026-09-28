package org.junit.internal;

import java.lang.reflect.Method;
import javax.annotation.Nullable;

public final class Throwables {

  @Nullable
  private static Method initGetSuppressed() {
    try {
      return Throwable.class.getMethod("getSuppressed");
    } catch (Throwable e) {
      return null;
    }
  }
}
