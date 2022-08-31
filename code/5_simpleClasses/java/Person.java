package com.agiledeveloper;

public class Person {
  private final String _firstName;
  private final String _lastName;
  private final int _age;

  public Person(String firstName, String lastName, int age) {
    _firstName = firstName;
    _lastName = lastName;
    _age = age;
  }

  public String getFirstName() {
    return _firstName;
  }

  public String getLastName() {
    return _lastName;
  }

  public int getAge() {
    return _age;
  }
}
