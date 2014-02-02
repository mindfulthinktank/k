package com.mindfulthinktank.boilerplate.utilities;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class UFiles {
  public static String readAllAsString(String path) {
    return readAllAsString(Paths.get(path));
  }

  public static String readAllAsString(Path path) {
    byte[] bytes;
    try {
      bytes = Files.readAllBytes(path);
    } catch (IOException e) {
      return null;
    }
    String content = new String(bytes);

    return content;
  }

  public static List<String> readNonEmptyLines(String path) throws IOException {
    List<String> allLines = Files.readAllLines(Paths.get(path), Charset.forName("utf8"));
    List<String> lines = new ArrayList<String>();

    for (String line : allLines) {
      if (line == null || line.length() == 0) continue;
      lines.add(line);
    }

    return lines;
  }
}
