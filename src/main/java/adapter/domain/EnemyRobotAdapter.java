package adapter.domain;

public class EnemyRobotAdapter implements EnemyAttacker {
  EnemyRobot robot;

  public EnemyRobotAdapter(EnemyRobot robot) {
    this.robot = robot;
  }

  @Override
  public void fireWeapon() {
    robot.smashWithHands();
  }

  @Override
  public void driveForward() {
    robot.walkForward();
  }

  @Override
  public void assignDriver(String driverName) {
    robot.reactToHuman(driverName);
  }
}
