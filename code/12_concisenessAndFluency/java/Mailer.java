package com.agiledeveloper;

public class Mailer {
  public void from(String from) {
    System.out.println("from " + from);
  }

  public void to(String to) {
    System.out.println("to " + to);
  }

  public void subject(String subject) {
    System.out.println("subject " + subject);
  }

  public void body(String msg) {
    System.out.println("message " + msg);
  }

  public void send() {
    System.out.println("Sending email...");
  }
}
