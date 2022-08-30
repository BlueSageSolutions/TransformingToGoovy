package com.agiledeveloper;

public class UtilUser {
  public static void main(String[] args) {
    Util util = new Util();

    System.out.println(util.totalNumbers(1, 7, 8, 10, 23));
    System.out.println(util.totalEvenNumbers(1, 7, 8, 10, 23));
    System.out.println(util.totalOddNumbers(1, 7, 8, 10, 23));
    System.out.println(util.totalNumbersGreaterThan(new int[] {1, 7, 8, 10, 23}, 8));
  }
}
