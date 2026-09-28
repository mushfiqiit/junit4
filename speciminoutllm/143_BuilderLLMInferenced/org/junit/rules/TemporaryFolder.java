package org.junit.rules;

import java.io.File;
import javax.annotation.Nullable;

public class TemporaryFolder extends ExternalResource {

  public static class Builder {

    @Nullable
    private File parentFolder;

    private boolean assureDeletion;

    protected Builder() {}
  }
}
