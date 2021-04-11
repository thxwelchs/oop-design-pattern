package decorator.domain;

public class TomatoSauce extends ToppingDecorator {

  public TomatoSauce(Pizza newPizza) {
    super(newPizza);

    System.out.println("토마토 소스를 추가합니다.");
  }

  @Override
  public String getDescription() {
    return super.getDescription() + ", 토마토소스";
  }

  @Override
  public double getCost() {
    return super.getCost() + .35;
  }
}
