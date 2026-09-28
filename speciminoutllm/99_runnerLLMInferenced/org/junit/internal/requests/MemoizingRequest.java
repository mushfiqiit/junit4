package org.junit.internal.requests;

import javax.annotation.Nullable;
import org.junit.runner.Request;
import org.junit.runner.Runner;

abstract class MemoizingRequest extends Request {

  private volatile @Nullable Runner runner;
}
