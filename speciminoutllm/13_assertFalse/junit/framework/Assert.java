package junit.framework;

@Deprecated
public class Assert {

  public static void assertFalse(String message, boolean condition) {
    throw new java.lang.Error();
  }

  public static void assertFalse(boolean condition) {
    assertFalse(null, condition);
  }
}
