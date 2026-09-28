package junit.framework;

import javax.annotation.Nullable;

public class TestFailure {

  public Throwable thrownException() {
    throw new java.lang.Error();
  }

  public @Nullable String exceptionMessage() {
    return thrownException().getMessage();
  }
}
