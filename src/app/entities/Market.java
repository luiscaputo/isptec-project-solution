package app.entities;

import java.util.Random;

public class Market {
  private int id;
  private String name;
  private int totalBoxes;

  public Market(
      String name, int totalBoxes) {
    this.id = new Random().nextInt(95);
    this.name = name;
    this.totalBoxes = totalBoxes;
  }

  public int getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getTotalBoxes() {
    return this.totalBoxes;
  }

  public void setTotalBoxes(int totalBoxes) {
    this.totalBoxes = totalBoxes;
  }
}
