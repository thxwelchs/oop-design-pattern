package strategy.domain;

public class LastGuestDiscountStrategy implements DiscountStrategy {

  @Override
  public int getDiscountPrice(Item item) {
    return (int) (item.getPrice() * 0.8);
  }
}
