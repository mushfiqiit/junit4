package org.junit.internal.requests;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.junit.runner.Request;
import org.junit.runner.Runner;
import javax.annotation.Nullable;

abstract class MemoizingRequest extends Request {
    private final Lock runnerLock = new ReentrantLock();
    @Nullable
    private volatile Runner runner;

    @Override
    public final Runner getRunner() {
        if (runner == null) {
            runnerLock.lock();
            try {
                if (runner == null) {
                    runner = createRunner();
                }
            } finally {
                runnerLock.unlock();
            }
        }
        return runner;
    }

    /** Creates the {@link Runner} to return from {@link #getRunner()}. Called at most once. */
    @Nullable
    protected abstract Runner createRunner();
}
