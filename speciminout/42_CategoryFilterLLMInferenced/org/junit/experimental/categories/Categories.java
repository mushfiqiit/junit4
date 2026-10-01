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

    private CategoryFilter(
        boolean matchAnyIncludes,
        @Nullable Class<?>[] inclusions,
        boolean matchAnyExcludes,
        @Nullable Class<?>[] exclusions) {
      includedAny = matchAnyIncludes;
      excludedAny = matchAnyExcludes;
      included = createSet(inclusions);
      excluded = createSet(exclusions);
    }
  }

  private static Set<Class<?>> createSet(@Nullable Class<?>[] classes) {
    throw new java.lang.Error();
  }
}
