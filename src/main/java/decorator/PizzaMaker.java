package decorator;

import decorator.domain.Mozzarella;
import decorator.domain.Pizza;
import decorator.domain.PlainPizza;
import decorator.domain.TomatoSauce;

public class PizzaMaker {

  public static void main(String[] args) {
    Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));

    System.out.println("재료: " + basicPizza.getDescription());
    System.out.println("가격: " + basicPizza.getCost());
  }
}
