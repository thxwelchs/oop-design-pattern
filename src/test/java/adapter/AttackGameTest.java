package adapter;

import static org.junit.jupiter.api.Assertions.*;

import adapter.domain.EnemyAttacker;
import adapter.domain.EnemyRobot;
import adapter.domain.EnemyRobotAdapter;
import adapter.domain.EnemyTank;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class AttackGameTest {
  @Test
  void game() {
    List<EnemyAttacker> attackers = Arrays.asList(
        new EnemyTank(),
        new EnemyRobotAdapter(new EnemyRobot())
    );
    attackers.forEach(this::attack);
  }

  private void attack(EnemyAttacker attacker) {
    attacker.assignDriver("Taehun");
    attacker.driveForward();
    attacker.fireWeapon();
  }
}