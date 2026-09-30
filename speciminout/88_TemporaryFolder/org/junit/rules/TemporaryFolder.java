package org.junit.rules;

import java.io.File;
import javax.annotation.Nullable;

public class TemporaryFolder extends ExternalResource {

  private final File parentFolder;

  private final boolean assureDeletion;

  @Nullable private File folder;

  private static final int TEMP_DIR_ATTEMPTS = 0;

  private static final String TMP_PREFIX = null;

  protected TemporaryFolder(Builder builder) {
    this.parentFolder = builder.parentFolder;
    this.assureDeletion = builder.assureDeletion;
  }

  public static class Builder {

    @Nullable private File parentFolder;

    private boolean assureDeletion;
  }
}
