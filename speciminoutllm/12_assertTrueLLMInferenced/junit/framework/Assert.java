package junit.framework;

import javax.annotation.Nullable;

@Deprecated
public class Assert {

  public static void assertTrue(@Nullable String message, boolean condition) {
    throw new java.lang.Error();
  }

  public static void assertTrue(boolean condition) {
    assertTrue(null, condition);
  }
}
