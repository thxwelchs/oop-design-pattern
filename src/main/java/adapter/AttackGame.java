package adapter;

import adapter.domain.EnemyAttacker;
import adapter.domain.EnemyRobot;
import adapter.domain.EnemyRobotAdapter;
import adapter.domain.EnemyTank;
import java.util.Arrays;
import java.util.List;

public class AttackGame {
  public static void main(String[] args) {
    List<EnemyAttacker> attackers = Arrays.asList(
        new EnemyTank(),
        new EnemyRobotAdapter(new EnemyRobot())
    );

    attackers.forEach(AttackGame::attack);
  }

  private static void attack(EnemyAttacker attacker) {
    attacker.assignDriver("Taehun");
    attacker.driveForward();
    attacker.fireWeapon();
  }
}
