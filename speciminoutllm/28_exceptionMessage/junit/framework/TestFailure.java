package junit.framework;

public class TestFailure {

  public Throwable thrownException() {
    throw new java.lang.Error();
  }

  public String exceptionMessage() {
    return thrownException().getMessage();
  }
}
