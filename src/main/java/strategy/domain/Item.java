package strategy.domain;

import java.time.LocalDateTime;

public class Item {
  private static final int FRESH_DAY_CONDITION = 10;

  private String name;
  private int price;
  private LocalDateTime created;

  public Item(String name, int price) {
    this.name = name;
    this.price = price;
    this.created = LocalDateTime.now();
  }

  public int getPrice() {
    return price;
  }

  public boolean isFresh() {
    LocalDateTime cutOfFreshDate = LocalDateTime.now().minusDays(FRESH_DAY_CONDITION);
    return created.isAfter(cutOfFreshDate);
  }
}
