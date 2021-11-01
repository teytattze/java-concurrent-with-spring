package com.tattzetey.concurrent.cars;

import com.tattzetey.concurrent.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Audi extends Car {
  public Audi() {
    super();
    this.speed = 15;
  }

  @Autowired
  @Qualifier("Alex")
  public void setDriver(Person driver) {
    this.driver = driver;
  }
}
