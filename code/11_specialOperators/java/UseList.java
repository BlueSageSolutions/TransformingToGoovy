package com.agiledeveloper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UseList {
  public static void main(String[] args) {
    List<Person> people = new ArrayList<Person>();

    people.add(new Person("John", "Smith", 27));
    people.add(new Person("Sara", "Smith", 27));
    people.add(new Person("Bill", "Smith", 7));
    people.add(new Person("Kate", "Smith", 6));

    printFirstNames(people);
    printFirstNames(new ArrayList<Person>());
  }

  private static void printFirstNames(List<Person> people) {
    if (people != null) {
      if (people.size() > 0) {
        System.out.printf("There are %d people.\n", people.size());
        System.out.print("Their first names are:");
        for(int i = 0; i < people.size(); i++) {
          System.out.print(people.get(i).getFirstName());
          if (i != people.size() - 1) System.out.print(", ");
        }
        System.out.println("");
        return;
      }
    }

    System.out.println("There are no people");    
  }
}
