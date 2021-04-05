package strategy;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import strategy.domain.Item;
import strategy.domain.OldCalculator;

class OldCalculatorTest {

  OldCalculator calculator;
  List<Item> items;

  @BeforeEach
  void setUp() {
    this.calculator = new OldCalculator();
    items = Arrays.asList(
        new Item("item1", 1000),
        new Item("item2", 2000),
        new Item("item3", 3000),
        new Item("item4", 4000)
    );
  }

  @Test
  @DisplayName("첫 손님의 할인은 90% 가격으로 적용된다.")
  void 첫손님의할인() {
    int sum = calculator.calculate(true, items);
    assertThat(sum).isEqualTo(9000);
  }
}