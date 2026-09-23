package org.junit.runners;

import java.util.List;
import org.junit.runner.Runner;
import org.junit.runner.manipulation.Filterable;
import org.junit.runner.manipulation.Orderable;

public abstract class ParentRunner<T> extends Runner implements Filterable, Orderable {

  private volatile List<T> filteredChildren = null;
}
