package junit.framework;

@Deprecated
public class Assert {

  public static void assertEquals(String message, char expected, char actual) {
    throw new java.lang.Error();
  }

  public static void assertEquals(char expected, char actual) {
    assertEquals(null, expected, actual);
  }
}
