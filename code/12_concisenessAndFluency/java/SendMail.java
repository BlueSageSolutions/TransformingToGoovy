package com.agiledeveloper;

public class SendMail {
  public static void main(String[] args) {
    Mailer mailer = new Mailer();
    mailer.from("build@agiledeveloper.com");
    mailer.to("venkat@agiledeveloper.com");
    mailer.subject("build successful");
    mailer.body("details...");
    mailer.send();
  }
}