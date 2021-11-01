package com.tattzetey.concurrent.cars;

import com.tattzetey.concurrent.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Ferrari extends Car {
  public Ferrari() {
    super();
    this.speed = 10;
  }

  @Autowired
  @Qualifier("Mike")
  public void setDriver(Person driver) {
    this.driver = driver;
  }
}
