package org.junit.rules;

import java.io.File;
import java.io.IOException;

public class TemporaryFolder extends ExternalResource {

  public File newFolder(String... paths) throws IOException {
    if (paths.length == 0) {
      throw new IllegalArgumentException("must pass at least one path");
    }
    File root = getRoot();
    for (String path : paths) {
      if (new File(path).isAbsolute()) {
        throw new IOException("folder path \'" + path + "\' is not a relative path");
      }
    }
    File relativePath = null;
    File file = root;
    boolean lastMkdirsCallSuccessful = true;
    for (String path : paths) {
      relativePath = new File(relativePath, path);
      file = new File(root, relativePath.getPath());
      lastMkdirsCallSuccessful = file.mkdirs();
      if (!lastMkdirsCallSuccessful && !file.isDirectory()) {
        if (file.exists()) {
          throw new IOException("a file with the path \'" + relativePath.getPath() + "\' exists");
        } else {
          throw new IOException(
              "could not create a folder with the path \'" + relativePath.getPath() + "\'");
        }
      }
    }
    if (!lastMkdirsCallSuccessful) {
      throw new IOException(
          "a folder with the path \'" + relativePath.getPath() + "\' already exists");
    }
    return file;
  }

  public File getRoot() {
    throw new java.lang.Error();
  }
}
