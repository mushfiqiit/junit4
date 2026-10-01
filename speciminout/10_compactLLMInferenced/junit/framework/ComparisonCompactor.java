package junit.framework;

import javax.annotation.Nullable;

public class ComparisonCompactor {

  private String fExpected;

  private String fActual;

  @SuppressWarnings("deprecation")
  public String compact(@Nullable String message) {
    if (fExpected == null || fActual == null || areStringsEqual()) {
      return Assert.format(message, fExpected, fActual);
    }
    findCommonPrefix();
    findCommonSuffix();
    String expected = compactString(fExpected);
    String actual = compactString(fActual);
    return Assert.format(message, expected, actual);
  }

  private String compactString(String source) {
    throw new java.lang.Error();
  }

  private void findCommonPrefix() {
    throw new java.lang.Error();
  }

  private void findCommonSuffix() {
    throw new java.lang.Error();
  }

  private boolean areStringsEqual() {
    throw new java.lang.Error();
  }
}
