package app.entities;

import java.util.Random;

public class Box {
  private int id;
  private int qtdClientOnQueue;
  private int qtdClientAttendedOnBox;
  private int totalTimeUsedToAttendClients;
  private float middleTimeUsedToAttendClient;

  public Box(int qtdClientOnQueue,
      int qtdClientAttendedOnBox,
      int totalTimeUsedToAttendClients,
      float middleTimeUsedToAttendClient) {
    this.id = new Random().nextInt(95);
    this.qtdClientOnQueue = qtdClientOnQueue;
    this.qtdClientAttendedOnBox = qtdClientAttendedOnBox;
    this.totalTimeUsedToAttendClients = totalTimeUsedToAttendClients;
    this.middleTimeUsedToAttendClient = middleTimeUsedToAttendClient;
  }

  public int getId() {
    return this.id;
  }

  public int getQtdClientOnQueue() {
    return this.qtdClientOnQueue;
  }

  public void setQtdClientOnQueue(int qtdClientOnQueue) {
    this.qtdClientOnQueue = qtdClientOnQueue;
  }

  public int getQtdClientAttendedOnBox() {
    return this.qtdClientAttendedOnBox;
  }

  public void setQtdClientAttendedOnBox(int qtdClientAttendedOnBox) {
    this.qtdClientAttendedOnBox = qtdClientAttendedOnBox;
  }

  public int getTotalTimeUsedToAttendClients() {
    return this.totalTimeUsedToAttendClients;
  }

  public void setTotalTimeUsedToAttendClients(int totalTimeUsedToAttendClients) {
    this.totalTimeUsedToAttendClients = totalTimeUsedToAttendClients;
  }

  public float getMiddleTimeUsedToAttendClient() {
    return this.middleTimeUsedToAttendClient;
  }

  public void setMiddleTimeUsedToAttendClient(float middleTimeUsedToAttendClient) {
    this.middleTimeUsedToAttendClient = middleTimeUsedToAttendClient;
  }
}
