package org.junit.experimental.categories;

import java.util.Set;
import org.junit.experimental.categories.Categories.CategoryFilter;

public final class ExcludeCategories extends CategoryFilterFactory {

  private static class ExcludesAny extends CategoryFilter {

    public ExcludesAny(Set<Class<?>> categories) {
      super(true, null, true, categories);
    }
  }
}
