package org.junit.internal.builders;

import org.junit.Ignore;
import org.junit.runner.Runner;
import org.junit.runners.model.RunnerBuilder;
import javax.annotation.Nullable;

public class IgnoredBuilder extends RunnerBuilder {
    @Nullable @Override
    public Runner runnerForClass(Class<?> testClass) {
        if (testClass.getAnnotation(Ignore.class) != null) {
            return new IgnoredClassRunner(testClass);
        }
        return null;
    }
}
