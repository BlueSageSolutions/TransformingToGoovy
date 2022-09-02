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
    //closure.delegate = mailer
    //closure()
    println("Sending email...");
  }
}



def p1 = [firstName: 'John', lastName: 'Smith', age: 500]
p1.with {
    firstName = 'Rose'
    lastName = 'Tyler'
    age = 22
    println firstName.toUpperCase()
}

println p1
