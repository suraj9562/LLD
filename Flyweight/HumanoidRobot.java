package Flyweight;

public class HumanoidRobot implements IRobot {
    String type;
    Sprites sprites; // 2D bitmap image of robot

    HumanoidRobot(String type, Sprites sprites) {
        this.type = type;
        this.sprites = sprites;
    }

    public String getType() {
        return type;
    }

    public Sprites getSprites() {
        return sprites;
    }

    @Override
    public void display(int x, int y) {
        // represent the humanoid robot
        // on x, y coordinates
    }

}
