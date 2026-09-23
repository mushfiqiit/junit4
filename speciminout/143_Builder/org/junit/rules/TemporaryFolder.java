package org.junit.rules;

import java.io.File;

public class TemporaryFolder extends ExternalResource {

  public static class Builder {

    private File parentFolder;

    private boolean assureDeletion;

    protected Builder() {}
  }
}
