package com.tattzetey.concurrent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Leaderboard {
  HashMap<String, Integer> leaderboardHashMap = new HashMap<String, Integer>();
  List<String> result = new ArrayList<String>();

  public synchronized void updateLeaderboard(String name, int distance) {
    this.leaderboardHashMap.put(name, distance);
    printLeaderboard();
  }

  private void addDriverToResult(String name) {
    boolean isNameContained = this.result.contains(name);
    if (!isNameContained) {
      this.result.add(name);
    }
  }

  private void printLeaderboard() {
    System.out.println("------------ LEADER BOARD ------------");
    for (String key : this.leaderboardHashMap.keySet()) {
      if (this.leaderboardHashMap.get(key) < Race.raceLength) {
        System.out.println("    " + key + "-----" + this.leaderboardHashMap.get(key));
      } else {
        this.addDriverToResult(key);
        System.out.println("    " + key + "-----" + (this.result.indexOf(key) + 1) + "no");
      }
    }
    System.out.println("");
  }
}
