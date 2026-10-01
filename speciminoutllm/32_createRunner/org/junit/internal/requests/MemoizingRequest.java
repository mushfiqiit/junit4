package org.junit.internal.requests;

import org.junit.runner.Request;
import org.junit.runner.Runner;

abstract class MemoizingRequest extends Request {

  protected abstract Runner createRunner();
}
