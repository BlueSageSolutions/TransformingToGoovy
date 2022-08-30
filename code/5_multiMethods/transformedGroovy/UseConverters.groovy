void callConverter(CurrencyConverter converter) {
    converter.getExchange(50)
}

callConverter(new CurrencyConverter())
callConverter(new SimpleCurrencyConverter())