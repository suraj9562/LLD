package Flyweight;

public class Main {
    public static void main(String[] args) {
        IRobot dog = RobotFactory.createRobot("DOG");
        IRobot human = RobotFactory.createRobot("HUMANOID");
    }
}
