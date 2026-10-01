package org.junit.experimental.categories;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Nullable;
import org.junit.runner.Description;
import org.junit.runner.manipulation.Filter;
import org.junit.runners.Suite;

public class Categories extends Suite {

  public static class CategoryFilter extends Filter {

    private static Set<Class<?>> categories(Description description) {
      Set<Class<?>> categories = new HashSet<Class<?>>();
      Collections.addAll(categories, directCategories(description));
      Collections.addAll(categories, directCategories(parentDescription(description)));
      return categories;
    }

    @Nullable
    private static Description parentDescription(Description description) {
      throw new java.lang.Error();
    }

    private static Class<?>[] directCategories(Description description) {
      throw new java.lang.Error();
    }
  }
}
