
class Main {
    public static void main(String[] args) {
        Vehicle vehicle_1 = new SportsVehicle();
        vehicle_1.drive();

        Vehicle vehicle_2 = new OffRoadVehicle();
        vehicle_2.drive();

        Vehicle vehicle_3 = new GoodsVehicle();
        vehicle_3.drive();
    }
}