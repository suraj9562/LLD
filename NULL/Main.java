public class Main {
    public static void main(String[] args) {
        Car raceCar = CarFactory.getCar(Car.carType.Race);
        System.out.println("Speed of car is " + raceCar.getSpeed());

        Car normalCar = CarFactory.getCar(Car.carType.Normal);
        System.out.println("Speed of car is " + normalCar.getSpeed());

        Car nullCar = CarFactory.getCar(Car.carType.UltraRacing);
        System.out.println("Speed of car is " + nullCar.getSpeed());
    }
}