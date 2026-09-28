package junit.framework;

@Deprecated
public class Assert {

  public static void assertEquals(String message, int expected, int actual) {
    throw new java.lang.Error();
  }

  public static void assertEquals(int expected, int actual) {
    assertEquals(null, expected, actual);
  }
}
