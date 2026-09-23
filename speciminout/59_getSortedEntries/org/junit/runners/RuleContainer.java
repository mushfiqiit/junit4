package org.junit.runners;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.IdentityHashMap;
import java.util.List;
import org.junit.rules.MethodRule;
import org.junit.rules.TestRule;

class RuleContainer {

  private final IdentityHashMap<Object, Integer> orderValues;

  private final List<TestRule> testRules;

  private final List<MethodRule> methodRules;

  static final Comparator<RuleEntry> ENTRY_COMPARATOR;

  private List<RuleEntry> getSortedEntries() {
    List<RuleEntry> ruleEntries = new ArrayList<RuleEntry>(methodRules.size() + testRules.size());
    for (MethodRule rule : methodRules) {
      ruleEntries.add(new RuleEntry(rule, RuleEntry.TYPE_METHOD_RULE, orderValues.get(rule)));
    }
    for (TestRule rule : testRules) {
      ruleEntries.add(new RuleEntry(rule, RuleEntry.TYPE_TEST_RULE, orderValues.get(rule)));
    }
    Collections.sort(ruleEntries, ENTRY_COMPARATOR);
    return ruleEntries;
  }

  static class RuleEntry {

    static final int TYPE_TEST_RULE = 0;

    static final int TYPE_METHOD_RULE = 0;

    RuleEntry(Object rule, int type, Integer order) {
      throw new java.lang.Error();
    }
  }
}
