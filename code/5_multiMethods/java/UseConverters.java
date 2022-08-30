package com.agiledeveloper;

public class UseConverters {
  public static void callConverter(CurrencyConverter converter) {
    converter.getExchange(50);  
  }

  public static void main(String[] args) {
    callConverter(new CurrencyConverter());
    callConverter(new SimpleCurrencyConverter());
  }
}
