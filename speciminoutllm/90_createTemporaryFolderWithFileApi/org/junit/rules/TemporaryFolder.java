package org.junit.rules;

import java.io.File;
import java.io.IOException;

public class TemporaryFolder extends ExternalResource {

  private static final int TEMP_DIR_ATTEMPTS = 0;

  private static final String TMP_PREFIX;

  private static File createTemporaryFolderWithFileApi(File parentFolder) throws IOException {
    File createdFolder = null;
    for (int i = 0; i < TEMP_DIR_ATTEMPTS; ++i) {
      String suffix = ".tmp";
      File tmpFile = File.createTempFile(TMP_PREFIX, suffix, parentFolder);
      String tmpName = tmpFile.toString();
      String folderName = tmpName.substring(0, tmpName.length() - suffix.length());
      createdFolder = new File(folderName);
      if (createdFolder.mkdir()) {
        tmpFile.delete();
        return createdFolder;
      }
      tmpFile.delete();
    }
    throw new IOException(
        "Unable to create temporary directory in: "
            + parentFolder.toString()
            + ". Tried "
            + TEMP_DIR_ATTEMPTS
            + " times. "
            + "Last attempted to create: "
            + createdFolder.toString());
  }
}
