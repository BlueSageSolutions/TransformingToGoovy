package com.agiledeveloper;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadAFile {
  public static void main(String[] args) {
    System.out.println(readFromFile(args[0]));
  }

  private static String readFromFile(String filePath) {
    StringBuilder builder = new StringBuilder();
    try {
      BufferedReader reader = new BufferedReader(
          new FileReader(filePath));

      String aLine = null;

      try {
        while((aLine = reader.readLine()) != null) {
          builder.append(aLine + System.getProperty("line.separator"));
        }
      } catch (IOException e) {
        e.printStackTrace();
      }

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    return builder.toString();
  }
}