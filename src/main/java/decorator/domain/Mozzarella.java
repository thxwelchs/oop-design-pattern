package decorator.domain;

public class Mozzarella extends ToppingDecorator {
  public Mozzarella(Pizza newPizza) {
    super(newPizza);
    System.out.println("모짜렐라를 추가합니다.");
  }

  @Override
  public String getDescription() {
    return super.getDescription() + ", 모짜렐라";
  }

  @Override
  public double getCost() {
    return super.getCost() + .50;
  }
}
