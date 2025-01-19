package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    public static Map<String, IRobot> robotMap = new HashMap();

    public static IRobot createRobot(String type) {
        if (robotMap.containsKey(type)) {
            return robotMap.get(type);
        } else {
            if (type == "HUMANOID") {
                Sprites sprites = new Sprites();
                IRobot humanoid = new HumanoidRobot(type, sprites);
                robotMap.put(type, humanoid);
                return humanoid;
            } else if (type == "DOG") {
                Sprites sprites = new Sprites();
                IRobot dogRobot = new DogRobot(type, sprites);
                robotMap.put(type, dogRobot);
                return dogRobot;
            }
        }

        return null;
    }
}
