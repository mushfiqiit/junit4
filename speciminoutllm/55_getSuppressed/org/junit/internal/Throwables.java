package org.junit.internal;

import java.lang.reflect.Method;
import javax.annotation.Nullable;

public final class Throwables {

  private static final Method getSuppressed = initGetSuppressed();

  @Nullable
  private static Method initGetSuppressed() {
    throw new java.lang.Error();
  }
}
