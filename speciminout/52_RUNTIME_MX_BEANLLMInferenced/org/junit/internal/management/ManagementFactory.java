package org.junit.internal.management;

import javax.annotation.Nullable;

public class ManagementFactory {

  private static final class FactoryHolder {

    @Nullable
    static Object getBeanObject(String methodName) {
      throw new java.lang.Error();
    }
  }

  private static final class RuntimeHolder {

    private static final RuntimeMXBean RUNTIME_MX_BEAN =
        getBean(FactoryHolder.getBeanObject("getRuntimeMXBean"));

    private static final RuntimeMXBean getBean(@Nullable Object runtimeMxBean) {
      throw new java.lang.Error();
    }
  }
}
