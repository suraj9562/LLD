package Flyweight;

public class DogRobot implements IRobot {

    String type;
    Sprites sprites; // 2D bitmap image of robot

    DogRobot(String type, Sprites sprites) {
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
        // represent the Dog robot
        // on x, y coordinates
    }
}
