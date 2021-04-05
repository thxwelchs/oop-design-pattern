package strategy;

import java.util.Arrays;
import java.util.List;
import strategy.controller.CalculatorController;
import strategy.domain.CalculatingPrice;
import strategy.domain.Cart;
import strategy.domain.Item;
import strategy.view.CalculatorResultView;

public class Application {
  public static void main(String[] args) {
    CalculatorController calculatorController = new CalculatorController();
    List<Item> items = Arrays.asList(
        new Item("item1", 1000),
        new Item("item2", 2000),
        new Item("item3", 3000),
        new Item("item4", 4000)
    );

    int firstGuest = 1;
    CalculatorResultView.showJoiningGuest(firstGuest);
    calculatorController.onFirstGuestButtonClick();
    int firstGuestCalculatedPrice = calculatorController.onCalculationButtonClick(new Cart(firstGuest, items));
    CalculatorResultView.showCalculatedPrice(new CalculatingPrice(firstGuest, firstGuestCalculatedPrice));

    int lastGuest = 2;
    CalculatorResultView.showJoiningGuest(lastGuest);
    calculatorController.onLastGuestButtonClick();
    int lastGuestCalculatedPrice = calculatorController.onCalculationButtonClick(new Cart(lastGuest, items));
    CalculatorResultView.showCalculatedPrice(new CalculatingPrice(lastGuest, lastGuestCalculatedPrice ));
  }
}
