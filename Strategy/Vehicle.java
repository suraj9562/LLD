import strategies.IDriveStrategy;

public class Vehicle {
    IDriveStrategy driveStrategy;

    Vehicle(IDriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        driveStrategy.drive();
    }
}
