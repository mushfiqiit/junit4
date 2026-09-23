package junit.framework;

public class ComparisonFailure extends AssertionFailedError {

  private static final int MAX_CONTEXT_LENGTH = 0;

  private String fExpected;

  private String fActual;

  public String getMessage() {
    return new ComparisonCompactor(MAX_CONTEXT_LENGTH, fExpected, fActual)
        .compact(super.getMessage());
  }
}
