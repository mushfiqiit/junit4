package org.junit.rules;

import java.io.File;

public class TemporaryFolder extends ExternalResource {

  private final File parentFolder;

  private final boolean assureDeletion;

  private File folder;

  private static final int TEMP_DIR_ATTEMPTS = 0;

  private static final String TMP_PREFIX;

  public TemporaryFolder(File parentFolder) {
    this.parentFolder = parentFolder;
    this.assureDeletion = false;
  }
}
