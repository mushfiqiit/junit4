package org.junit;

import javax.annotation.Nullable;

public class ComparisonFailure extends AssertionError {

  private static class ComparisonCompactor {

    private final String expected;

    private final String actual;

    public String compact(@Nullable String message) {
      if (expected == null || actual == null || expected.equals(actual)) {
        return Assert.format(message, expected, actual);
      } else {
        DiffExtractor extractor = new DiffExtractor();
        String compactedPrefix = extractor.compactPrefix();
        String compactedSuffix = extractor.compactSuffix();
        return Assert.format(
            message,
            compactedPrefix + extractor.expectedDiff() + compactedSuffix,
            compactedPrefix + extractor.actualDiff() + compactedSuffix);
      }
    }

    private class DiffExtractor {

      private DiffExtractor() {
        throw new java.lang.Error();
      }

      public String expectedDiff() {
        throw new java.lang.Error();
      }

      public String actualDiff() {
        throw new java.lang.Error();
      }

      public String compactPrefix() {
        throw new java.lang.Error();
      }

      public String compactSuffix() {
        throw new java.lang.Error();
      }
    }
  }
}
