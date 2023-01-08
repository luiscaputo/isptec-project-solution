package app.repositories;

public interface MarketInterface {
  public void create(String name, int totalBoxes);

  public void getMarket(int id);

  public void allMarkets();
}
