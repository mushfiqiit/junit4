package junit.framework;

import javax.annotation.Nullable;

@Deprecated
public class Assert {

  public static void fail(@Nullable String message) {
    throw new java.lang.Error();
  }

  public static void assertNotNull(@Nullable String message, Object object) {
    throw new java.lang.Error();
  }
}
