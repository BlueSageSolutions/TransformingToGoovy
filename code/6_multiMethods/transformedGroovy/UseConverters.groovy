void callConverter(CurrencyConverter converter) {
    converter.getExchange(50)
}

callConverter(new CurrencyConverter())
callConverter(new SimpleCurrencyConverter())

class CurrencyConverter {
  double getExchange(double amount) {
    println "CurrencyConverter getExchange double called"
    0
  }
}

class SimpleCurrencyConverter extends CurrencyConverter {
  double getExchange(int amount) {
    println "SimpleCurrencyConverter getExchange int called"
    0
  }
}
