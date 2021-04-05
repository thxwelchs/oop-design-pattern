package strategy.view;

import strategy.domain.CalculatingPrice;

public class CalculatorResultView {

  public static void showJoiningGuest(int guestOrder) {
    System.out.printf("%d번째 사용자가 입장했습니다.\n", guestOrder);
  }

  public static void showCalculatedPrice(CalculatingPrice calculatedPrice) {
    System.out.printf("%d번째 사용자의 계산 결과는 %d입니다.\n", calculatedPrice.getGuestOrder(), calculatedPrice.getPrice());
  }
}
