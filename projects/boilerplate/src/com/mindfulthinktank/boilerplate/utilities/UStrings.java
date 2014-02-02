package com.mindfulthinktank.boilerplate.utilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UStrings {
  public static enum StringSplitOptions {
    None,
    RemoveEmptyEntries,
  }

  public static List<String> split(String string, String pattern) {
    return split(string, pattern, StringSplitOptions.None);
  }

  public static List<String> split(String string, String pattern, StringSplitOptions options) {

    String[] parts = string.split(pattern);
    if (options == StringSplitOptions.None) return Arrays.asList(parts);

    List<String> pieces = new ArrayList<String>();

    for (String part : parts) {
      if (part == null || part.length() == 0) continue;
      pieces.add(part);
    }

    return pieces;
  }
}
