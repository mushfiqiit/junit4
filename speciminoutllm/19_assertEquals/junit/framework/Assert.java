package junit.framework;

@Deprecated
public class Assert {

  public static void assertEquals(String message, long expected, long actual) {
    throw new java.lang.Error();
  }

  public static void assertEquals(long expected, long actual) {
    assertEquals(null, expected, actual);
  }
}
