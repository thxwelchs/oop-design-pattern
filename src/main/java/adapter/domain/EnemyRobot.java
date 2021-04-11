package adapter.domain;

import java.util.Random;

public class EnemyRobot {
  Random generator = new Random();

  public void smashWithHands() {
    // 무기를 사용하여 공격하는 의미와 같지만 로봇은 손을 이용하여 공격한다.
    int attackDamage = generator.nextInt(10) + 1;
    System.out.printf("적 로봇이 손을 사용하여 %d만큼의 피해를 입혔습니다.\n", attackDamage);
  }

  public void walkForward() {
    int movement = generator.nextInt(5) + 1;
    System.out.printf("적 로봇이 %d만큼 걸어서 이동했습니다.\n", movement);
  }

  public void reactToHuman(String driverName) {
    System.out.printf("적 로봇이 %s를 짓밟습니다.\n", driverName);
  }
}