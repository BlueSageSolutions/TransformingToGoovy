class Mailer {
  void from(String from) {
    println("from " + from);
  }

  void to(String to) {
    println("to " + to);
  }

  void subject(String subject) {
    println("subject " + subject);
  }

  void body(String msg) {
    println("message " + msg);
  }

  static void send(closure) {
    def mailer = new Mailer()
    mailer.with closure
    println("Sending email...");
  }
}
