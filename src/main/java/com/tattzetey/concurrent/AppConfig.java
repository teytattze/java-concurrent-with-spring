package com.tattzetey.concurrent;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.tattzetey.concurrent")
public class AppConfig {

  @Bean(name = "mike")
  public Person mikeBean() {
    Person person = new Person();
    person.setName("Mike");
    return person;
  }

  @Bean(name = "alex")
  public Person alexBean() {
    Person person = new Person();
    person.setName("Alex");
    return person;
  }
}
