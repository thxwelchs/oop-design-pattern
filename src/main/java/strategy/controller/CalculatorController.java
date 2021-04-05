package strategy.controller;

import strategy.domain.Calculator;
import strategy.domain.Cart;
import strategy.domain.DiscountStrategy;
import strategy.domain.FirstGuestDiscountStrategy;
import strategy.domain.LastGuestDiscountStrategy;

public class CalculatorController {
  private DiscountStrategy strategy;

  public void onFirstGuestButtonClick() {
    strategy = new FirstGuestDiscountStrategy();
  }

  public void onLastGuestButtonClick() {
    strategy = new LastGuestDiscountStrategy();
  }

  public int onCalculationButtonClick(Cart cart) {
    Calculator calculator = new Calculator(strategy);
    return calculator.calculate(cart.getItems());
  }
}
