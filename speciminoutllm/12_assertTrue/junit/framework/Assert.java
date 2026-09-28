package junit.framework;

@Deprecated
public class Assert {

  public static void assertTrue(String message, boolean condition) {
    throw new java.lang.Error();
  }

  public static void assertTrue(boolean condition) {
    assertTrue(null, condition);
  }
}
