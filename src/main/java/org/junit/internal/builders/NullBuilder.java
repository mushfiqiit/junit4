package org.junit.internal.builders;

import org.junit.runner.Runner;
import org.junit.runners.model.RunnerBuilder;
import javax.annotation.Nullable;

public class NullBuilder extends RunnerBuilder {
    @Nullable @Override
    public Runner runnerForClass(Class<?> each) throws Throwable {
        return null;
    }
}
