package com.agiledeveloper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UseList {
  public static void main(String[] args) {
    List<String> groceries = new ArrayList<String>();

    groceries.add("Milk");
    groceries.add("Sugar");
    groceries.add("Bread");

    System.out.println("Last item in the list: " +
      groceries.get(groceries.size() - 1));

    System.out.println("List of items:");
    for(int i = 0; i < groceries.size(); i++) {
      System.out.println(i + 1 + "\t" + groceries.get(i));
    }

    System.out.println("Sorted items");

    String[] items = new String[groceries.size()];
    groceries.toArray(items);
    Arrays.sort(items);

    for(String item : items) {
      System.out.println(item);
    }

    System.out.print("The items are: ");
    System.out.print(groceries.get(0));
    for(int i = 1; i < groceries.size(); i++) {
      System.out.print(", " + groceries.get(i));
    }
  }
}
