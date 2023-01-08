package app.entities;

import java.util.Random;

public class Client {
  private int id;
  private int qtdProducts;

  public Client(
      int qtdProducts) {
    this.id = new Random().nextInt(95);
    this.qtdProducts = qtdProducts;
  }

  public int getId() {
    return this.id;
  }

  public int getQtdProducts() {
    return this.qtdProducts;
  }

  public void setQtdProducts(int qtdProducts) {
    this.qtdProducts = qtdProducts;
  }
}
