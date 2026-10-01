package org.junit.rules;

import java.io.File;
import javax.annotation.Nullable;

public class TemporaryFolder extends ExternalResource {

  @Nullable private final File parentFolder;

  private final boolean assureDeletion;

  @Nullable private File folder;

  private static final int TEMP_DIR_ATTEMPTS = 0;

  private static final String TMP_PREFIX;

  public TemporaryFolder(@Nullable File parentFolder) {
    this.parentFolder = parentFolder;
    this.assureDeletion = false;
  }
}
