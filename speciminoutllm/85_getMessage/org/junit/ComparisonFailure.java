package org.junit;

public class ComparisonFailure extends AssertionError {

  private static final int MAX_CONTEXT_LENGTH = 0;

  private String fExpected;

  private String fActual;

  public String getMessage() {
    return new ComparisonCompactor(MAX_CONTEXT_LENGTH, fExpected, fActual)
        .compact(super.getMessage());
  }

  private static class ComparisonCompactor {

    public ComparisonCompactor(int contextLength, String expected, String actual) {
      throw new java.lang.Error();
    }

    public String compact(String message) {
      throw new java.lang.Error();
    }
  }
}
