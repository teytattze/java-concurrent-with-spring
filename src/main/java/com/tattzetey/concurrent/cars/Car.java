package com.tattzetey.concurrent.cars;

import com.tattzetey.concurrent.Leaderboard;
import com.tattzetey.concurrent.Person;
import com.tattzetey.concurrent.Race;

import org.springframework.beans.factory.annotation.Autowired;

public class Car extends Thread {
  int distance;
  int speed;
  Person driver;

  @Autowired
  Leaderboard leaderboard;

  @Override
  public void run() {
    this.distance = 0;

    while (this.distance < Race.raceLength) {

      this.distance += this.speed;

      leaderboard.updateLeaderboard(this.driver.getName(), this.distance);

      try {
        sleep(1000);
      } catch (Exception ex) {
        ex.printStackTrace();
      }

    }
  }
}
