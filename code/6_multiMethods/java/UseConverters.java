
public class UseConverters {
  public static void callConverter(CurrencyConverter converter) {
    converter.getExchange(50);  
  }

  public static void main(String[] args) {
    callConverter(new CurrencyConverter());
    callConverter(new SimpleCurrencyConverter());
  }

}

  class CurrencyConverter {
    public double getExchange(double amount) {
      System.out.println("CurrencyConverter getExchange double called");
      return 0;
    }
  }

class SimpleCurrencyConverter extends CurrencyConverter {
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

