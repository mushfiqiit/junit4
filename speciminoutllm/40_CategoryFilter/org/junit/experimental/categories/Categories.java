package org.junit.experimental.categories;

import java.util.Set;
import javax.annotation.Nullable;
import org.junit.runner.manipulation.Filter;
import org.junit.runners.Suite;

public class Categories extends Suite {

  public static class CategoryFilter extends Filter {

    private final Set<Class<?>> included;

    private final Set<Class<?>> excluded;

    private final boolean includedAny;

    private final boolean excludedAny;

    protected CategoryFilter(
        boolean matchAnyIncludes,
        @Nullable Set<Class<?>> includes,
        boolean matchAnyExcludes,
        @Nullable Set<Class<?>> excludes) {
      includedAny = matchAnyIncludes;
      excludedAny = matchAnyExcludes;
      included = copyAndRefine(includes);
      excluded = copyAndRefine(excludes);
    }

    private static Set<Class<?>> copyAndRefine(Set<Class<?>> classes) {
      throw new java.lang.Error();
    }
  }
}
