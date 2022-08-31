package com.agiledeveloper;

public class UsePerson {
  public static void main(String[] args) {
    Person person = new Person("John", "Smith", 27);

    System.out.println(person.getFirstName() + " " +
      person.getLastName() + ":" + person.getAge());
  }
}
