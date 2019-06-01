package stepik.Robot;


public class GoRobot {
    public static void main(String[] args) {
    }

    public static void moveRobot(Robot robot, int toX, int toY) {

        Robot.Direction DirectionX = robot.getX() > toX ? Robot.Direction.LEFT : Robot.Direction.RIGHT;
        Robot.Direction DirectionY = robot.getY() > toY ? Robot.Direction.DOWN : Robot.Direction.UP;

        while (robot.getDirection() != DirectionX) {
            robot.turnRight();
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        while (robot.getDirection() != DirectionY) {
            robot.turnRight();
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

}
