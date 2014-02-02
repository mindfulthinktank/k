package com.mindfulthinktank.boilerplate.utilities;

public class UConvert {
  public static Boolean toBoolean(String text) {
    return Boolean.parseBoolean(text);
  }
  
  public static Character toCharacter(String text) {
    return text.charAt(0);
  }
  
  public static Float toFloat(String text) {
    return Float.parseFloat(text);
  }
  
  public static Integer toInteger(String text) {
    return Integer.parseInt(text);
  }

  public static Void toVoid(String text) {
    return null;
  }
  
  public static String toString(String text) {
    return text;
  }
}
