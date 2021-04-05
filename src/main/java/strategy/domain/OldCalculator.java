package strategy.domain;

import java.util.List;

// 전략 패턴이 사용되지 않은 예
public class OldCalculator {
  /*
    전략패턴이 적용되기 전의 코드
    상황에 따라 기능의 알고리즘이 달라져 if else로 분기하고 있다.
  */
  public int calculate(boolean firstGuest, List<Item> items) {
    int sum = 0;
    for (Item item : items) {
      if (firstGuest) {
        sum += (int) (item.getPrice() * 0.9); // 첫 손님 할인
      } else if (!item.isFresh()) {
        sum += (int) (item.getPrice() * 0.8); // 덜 신선한 것 20% 할인
      } else {
        sum += item.getPrice();
      }
    }
    return sum;
  }
}
