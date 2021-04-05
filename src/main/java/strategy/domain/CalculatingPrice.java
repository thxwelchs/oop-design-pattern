package strategy.domain;

public class CalculatingPrice {
  private int guestOrder;
  private int price;

  public CalculatingPrice(int guestOrder, int price) {
    this.guestOrder = guestOrder;
    this.price = price;
  }

  public int getGuestOrder() {
    return guestOrder;
  }

  public int getPrice() {
    return price;
  }
}
