package com.tattzetey.concurrent;

import com.tattzetey.concurrent.cars.Audi;
import com.tattzetey.concurrent.cars.Ferrari;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Race {
  public static int raceLength = 100;

  @Autowired
  Leaderboard leaderboard;

  @Autowired
  Audi audi;

  @Autowired
  Ferrari ferrari;

  public void startRace() {
    System.out.println("Starting Race...");
    audi.start();
    ferrari.start();
    try {
      audi.join();
      ferrari.join();
    } catch (InterruptedException ex) {
      ex.printStackTrace();
    }
    System.out.println("Race Over!");
  }
}
