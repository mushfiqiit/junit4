package junit.framework;

@Deprecated
public class Assert {

  public static void fail(String message) {
    throw new java.lang.Error();
  }

  public static void assertNotNull(String message, Object object) {
    throw new java.lang.Error();
  }
}
