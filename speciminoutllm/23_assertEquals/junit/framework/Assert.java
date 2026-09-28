package junit.framework;

@Deprecated
public class Assert {

  public static void assertEquals(String message, short expected, short actual) {
    throw new java.lang.Error();
  }

  public static void assertEquals(short expected, short actual) {
    assertEquals(null, expected, actual);
  }
}
