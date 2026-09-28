package org.junit.experimental.categories;

import java.util.Set;
import javax.annotation.Nullable;
import org.junit.runner.manipulation.Filter;
import org.junit.runners.Suite;

public class Categories extends Suite {

  public static class CategoryFilter extends Filter {

    protected CategoryFilter(
        boolean matchAnyIncludes,
        Set<Class<?>> includes,
        boolean matchAnyExcludes,
        @Nullable Set<Class<?>> excludes) {
      throw new java.lang.Error();
    }
  }
}
