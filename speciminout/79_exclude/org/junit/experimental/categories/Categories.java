package org.junit.experimental.categories;

import org.junit.runner.manipulation.Filter;
import org.junit.runners.Suite;

public class Categories extends Suite {

  public static class CategoryFilter extends Filter {

    public static CategoryFilter exclude(boolean matchAny, Class<?>... categories) {
      return new CategoryFilter(true, null, matchAny, categories);
    }

    private CategoryFilter(
        boolean matchAnyIncludes,
        Class<?>[] inclusions,
        boolean matchAnyExcludes,
        Class<?>[] exclusions) {
      throw new java.lang.Error();
    }
  }
}
