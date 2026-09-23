package org.junit.rules;

import java.io.File;

public class TemporaryFolder extends ExternalResource {

  private final File parentFolder;

  private final boolean assureDeletion = false;

  private File folder;

  private static final int TEMP_DIR_ATTEMPTS = 0;

  private static final String TMP_PREFIX;

  public TemporaryFolder() {
    this((File) null);
  }

  public TemporaryFolder(File parentFolder) {
    throw new java.lang.Error();
  }
}
