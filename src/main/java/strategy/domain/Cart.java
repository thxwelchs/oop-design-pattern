package strategy.domain;

import java.util.List;

public class Cart {
  int guestOrder;
  List<Item> items;

  public Cart(int guestOrder, List<Item> items) {
    this.guestOrder = guestOrder;
    this.items = items;
  }

  public List<Item> getItems() {
    return items;
  }
}
