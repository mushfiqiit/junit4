package org.junit.rules;

import java.io.File;
import java.io.IOException;
import javax.annotation.Nullable;

public class TemporaryFolder extends ExternalResource {

  @Nullable private final File parentFolder;

  @Nullable private File folder;

  public void create() throws IOException {
    folder = createTemporaryFolderIn(parentFolder);
  }

  private static File createTemporaryFolderIn(@Nullable File parentFolder) throws IOException {
    throw new java.lang.Error();
  }
}
