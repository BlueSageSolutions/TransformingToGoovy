package com.agiledeveloper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunCommand {
  public static void main(String[] args) {
    try {
      Process process = Runtime.getRuntime().exec("ls -la /");

      BufferedReader reader = new BufferedReader(
          new InputStreamReader(process.getInputStream()));

      String stdOut = null;

      while((stdOut = reader.readLine()) != null) {
        System.out.println(stdOut);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}