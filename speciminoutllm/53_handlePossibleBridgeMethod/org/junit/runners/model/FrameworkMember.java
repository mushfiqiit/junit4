package org.junit.runners.model;

import java.util.List;

public abstract class FrameworkMember<T extends FrameworkMember<T>> implements Annotatable {

  abstract boolean isShadowedBy(T otherMember);

  T handlePossibleBridgeMethod(List<T> members) {
    for (int i = members.size() - 1; i >= 0; i--) {
      T otherMember = members.get(i);
      if (isShadowedBy(otherMember)) {
        if (otherMember.isBridgeMethod()) {
          members.remove(i);
          return otherMember;
        }
        return null;
      }
    }
    FrameworkMember<? extends T> thisMember = this;
    @SuppressWarnings("unchecked")
    T result = (T) thisMember;
    return result;
  }

  abstract boolean isBridgeMethod();
}
