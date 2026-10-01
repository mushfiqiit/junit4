package org.junit.runners;

import java.util.List;
import org.junit.ClassRule;
import org.junit.rules.TestRule;
import org.junit.runner.Runner;
import org.junit.runner.manipulation.Filterable;
import org.junit.runner.manipulation.Orderable;
import org.junit.runners.model.MemberValueConsumer;
import org.junit.runners.model.TestClass;

public abstract class ParentRunner<T> extends Runner implements Filterable, Orderable {

  private final TestClass testClass;

  protected List<TestRule> classRules() {
    ClassRuleCollector collector = new ClassRuleCollector();
    testClass.collectAnnotatedMethodValues(null, ClassRule.class, TestRule.class, collector);
    testClass.collectAnnotatedFieldValues(null, ClassRule.class, TestRule.class, collector);
    return collector.getOrderedRules();
  }

  private static class ClassRuleCollector implements MemberValueConsumer<TestRule> {

    public List<TestRule> getOrderedRules() {
      throw new java.lang.Error();
    }
  }
}
