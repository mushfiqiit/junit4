package org.junit.runners;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.TestClass;

public class Parameterized extends Suite {

  private static class RunnersFactory {

    @SuppressWarnings("unchecked")
    private static List<Object> allParameters(TestClass testClass, FrameworkMethod parametersMethod)
        throws Throwable {
      Object parameters = parametersMethod.invokeExplosively(null);
      if (parameters instanceof List) {
        return (List<Object>) parameters;
      } else if (parameters instanceof Collection) {
        return new ArrayList<Object>((Collection<Object>) parameters);
      } else if (parameters instanceof Iterable) {
        List<Object> result = new ArrayList<Object>();
        for (Object entry : ((Iterable<Object>) parameters)) {
          result.add(entry);
        }
        return result;
      } else if (parameters instanceof Object[]) {
        return Arrays.asList((Object[]) parameters);
      } else {
        throw parametersMethodReturnedWrongType(testClass, parametersMethod);
      }
    }

    private static Exception parametersMethodReturnedWrongType(
        TestClass testClass, FrameworkMethod parametersMethod) throws Exception {
      throw new java.lang.Error();
    }
  }
}
