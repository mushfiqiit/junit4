package junit.framework;

@Deprecated
public class Assert {

  public static void assertNotSame(String message, Object expected, Object actual) {
    throw new java.lang.Error();
  }

  public static void assertNotSame(Object expected, Object actual) {
    assertNotSame(null, expected, actual);
  }
}
