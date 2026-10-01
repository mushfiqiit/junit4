package org.junit;

public class ComparisonFailure extends AssertionError {

  public ComparisonFailure(String message, String expected, String actual) {
    throw new java.lang.Error();
  }
}
