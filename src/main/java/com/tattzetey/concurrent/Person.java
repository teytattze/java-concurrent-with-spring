package com.tattzetey.concurrent;

public class Person {
  String name;

  public Person() {}

  public Person(String name) {
    this.name = name;
  }

  public void setName(String name) {
      this.name = name;
  }

  public String getName() {
    return this.name;
  }
}
