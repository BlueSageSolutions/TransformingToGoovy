package com.agiledeveloper;

import java.util.Date;

public class MultiLine {
  public static void main(String[] args) {
    String msg = "This is an important announcement sent ";
    msg += "to all employees on " + new Date() + " ";
    msg += "there will be a fire alarm test on next Monday at 11AM.";
    msg += "Please be advised that...";

    System.out.println(msg);

    StringBuilder sb = new StringBuilder();
    sb.append("This is an important announcement sent ");
    sb.append("to all employees on ");
    sb.append(new Date());
    sb.append(" ");
    sb.append("there will be a fire alarm test on next Monday at 11AM.");
    sb.append("Please be advised that...");
    System.out.println(sb.toString());
  }
}