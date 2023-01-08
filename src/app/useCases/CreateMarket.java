package app.useCases;

import app.entities.Market;

public class CreateMarket {
  public Market execute(String marketName, int totalBoxes) {
    if (totalBoxes <= 0) {
      throw new Error("Invalid TotalBox Value");
    }
    if (marketName == "" || marketName.length() < 50) {
      throw new Error("Invalid Market Name");
    }

    Market market = new Market(marketName, totalBoxes);
    // save on database

    // Other verifications
    return market;
  }
}
