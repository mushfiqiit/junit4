package org.junit.experimental.categories;

import java.util.Set;
import org.junit.experimental.categories.Categories.CategoryFilter;

public final class IncludeCategories extends CategoryFilterFactory {

  private static class IncludesAny extends CategoryFilter {

    public IncludesAny(Set<Class<?>> categories) {
      super(true, categories, true, null);
    }
  }
}
