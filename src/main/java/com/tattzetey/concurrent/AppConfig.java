package com.tattzetey.concurrent;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.tattzetey.concurrent")
public class AppConfig {

  @Bean(name = "Mike")
  public Person mikeBean() {
    return new Person("Mike");
  }

  @Bean(name = "Alex")
  public Person alexBean() {
    return new Person("Alex");
  }
}
