package com.agiledeveloper;

public class Util {
  public int totalNumbers(int... numbers) {
    int total = 0;
    for(int number : numbers) total += number;
    return total;
  }

  public int totalEvenNumbers(int... numbers) {
    int total = 0;
    for(int number : numbers) {
      if (number % 2 == 0) total += number;
    }
    return total;
  }

  public int totalOddNumbers(int... numbers) {
    int total = 0;
    for(int number : numbers) {
      if (number % 2 != 0) total += number;
    }
    return total;
  }

  public int totalNumbersGreaterThan(int[] numbers, int pivot) {
    int total = 0;
    for(int number : numbers) {
      if (number > pivot) total += number;
    }
    return total;
  }
}