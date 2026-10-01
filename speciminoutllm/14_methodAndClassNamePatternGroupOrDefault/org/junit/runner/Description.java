package org.junit.runner;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

public class Description implements Serializable {

  private static final Pattern METHOD_AND_CLASS_NAME_PATTERN;

  public String toString() {
    throw new java.lang.Error();
  }

  private String methodAndClassNamePatternGroupOrDefault(
      int group, @Nullable String defaultString) {
    Matcher matcher = METHOD_AND_CLASS_NAME_PATTERN.matcher(toString());
    return matcher.matches() ? matcher.group(group) : defaultString;
  }
}
