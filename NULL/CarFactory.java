public class CarFactory {
    public static Car getCar(Car.carType type) {
        switch (type) {
            case Car.carType.Normal:
                return new NormalCar();

            case Car.carType.Race:
                return new RaceCar();

            default:
                return new NullCar();
        }
    }
}
