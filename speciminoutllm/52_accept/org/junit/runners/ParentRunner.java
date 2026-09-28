package org.junit.runners;

import java.util.List;
import org.junit.ClassRule;
import org.junit.rules.TestRule;
import org.junit.runner.Runner;
import org.junit.runner.manipulation.Filterable;
import org.junit.runner.manipulation.Orderable;
import org.junit.runners.model.FrameworkMember;
import org.junit.runners.model.MemberValueConsumer;

public abstract class ParentRunner<T> extends Runner implements Filterable, Orderable {

  private static class ClassRuleCollector implements MemberValueConsumer<TestRule> {

    final List<RuleContainer.RuleEntry> entries;

    public void accept(FrameworkMember<?> member, TestRule value) {
      ClassRule rule = member.getAnnotation(ClassRule.class);
      entries.add(
          new RuleContainer.RuleEntry(
              value, RuleContainer.RuleEntry.TYPE_TEST_RULE, rule != null ? rule.order() : null));
    }
  }
}
