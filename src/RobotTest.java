import java.util.Arrays;

public class RobotTest {
    public static void main(String[] args) {
        Robot robot1 = new Robot(0, -20, Direction.LEFT);
//        hereIsRobotNow(robot1);
//        robot1.turnLeft();
//        hereIsRobotNow(robot1);
//        robot1.stepForward();
        System.out.print("Start Position -> ");
        hereIsRobotNow(robot1);
        moveRobot(robot1, -10, 20);
    }
    public static void hereIsRobotNow(Robot robot) {
        System.out.print("Robot Here: ");
        System.out.print("X =\t" + robot.getX());
        System.out.print("\tY =\t" + robot.getY());
        System.out.print("\tDir =\t" + robot.getDirection() + "\n");
    }

    public static void moveRobot(Robot robot, int x, int y) {
        Direction goodXDir;
        Direction goodYDir;

        if (x - robot.getX() > 0) {
            goodXDir = Direction.RIGHT;
        } else {
            goodXDir = Direction.LEFT;
        }
        if (y - robot.getY() > 0) {
            goodYDir = Direction.UP;
        } else {
            goodYDir = Direction.DOWN;
        }

        while (goodXDir != robot.getDirection()) {
            robot.turnLeft();
        }
        while (x - robot.getX() != 0) {
            robot.stepForward();
        }

        while (goodYDir != robot.getDirection()) {
            robot.turnLeft();
        }
        while (y - robot.getY() != 0) {
            robot.stepForward();
        }
    }
}
