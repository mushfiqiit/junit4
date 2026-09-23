package org.junit.internal;

public final class Throwables {

  public static Exception rethrowAsException(Throwable e) throws Exception {
    Throwables.<Exception>rethrow(e);
    return null;
  }

  @SuppressWarnings("unchecked")
  private static <T extends Throwable> void rethrow(Throwable e) throws T {
    throw new java.lang.Error();
  }
}
