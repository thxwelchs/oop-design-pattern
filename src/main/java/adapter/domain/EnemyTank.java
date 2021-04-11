package adapter.domain;

import java.util.Random;

public class EnemyTank implements EnemyAttacker {

  Random generator = new Random();

  @Override
  public void fireWeapon() {
    int attackDamage = generator.nextInt(10) + 1;
    System.out.printf("적 탱크가 %d만큼의 피해를 입혔습니다.\n", attackDamage);
  }

  @Override
  public void driveForward() {
    int movement = generator.nextInt(5) + 1;
    System.out.printf("적 탱크가 %d만큼 이동했습니다.\n", movement);
  }

  @Override
  public void assignDriver(String driverName) {
    System.out.printf("%s가 탱크를 운전합니다.\n", driverName);
  }
}
