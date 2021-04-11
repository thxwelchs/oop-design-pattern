package decorator.domain;

public class PlainPizza implements Pizza {

  public PlainPizza() {
    System.out.println("도우를 추가합니다.");
  }

  @Override
  public String getDescription() {
    return "도우";
  }

  @Override
  public double getCost() {
    return 4.00;
  }
}
