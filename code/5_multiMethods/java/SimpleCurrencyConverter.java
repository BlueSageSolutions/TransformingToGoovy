package com.agiledeveloper;

public class SimpleCurrencyConverter extends CurrencyConverter {
  @Override public double getExchange(double amount) {
    System.out.println("SimpleCurrencyConverter getExchange double called");
    System.out.println("routing...");
    getExchange((int)(amount));
    return 0;
  }

  public double getExchange(int amount) {
    System.out.println("SimpleCurrencyConverter getExchange int called");
    return 0;
  }
}
