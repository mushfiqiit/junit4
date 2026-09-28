package org.junit.experimental.categories;

import org.junit.runner.manipulation.Filter;
import org.junit.runners.Suite;

public class Categories extends Suite {

  public static class CategoryFilter extends Filter {

    public static CategoryFilter include(boolean matchAny, Class<?>... categories) {
      return new CategoryFilter(matchAny, categories, true, null);
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
