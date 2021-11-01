package com.tattzetey.concurrent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

    Race race = context.getBean("race", Race.class);
    race.startRace();

    context.close();
  }

}
