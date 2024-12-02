import strategies.NormalDriveStrategy;

public class OffRoadVehicle extends Vehicle {
    OffRoadVehicle() {
        super(new NormalDriveStrategy());
    }
}
