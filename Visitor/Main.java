package Visitor;

public class Main {
    public static void main(String[] args) {
        IRoomElement singleRoom = new SingleRoom();
        IRoomElement doubleRoom = new DoubleRoom();
        IRoomElement deluxeRoom = new DeluxeRoom();

        IRoomVisitor priceVisitor = new RoomPricingVisitor();
        IRoomVisitor maintenanceVisitor = new RoomMaintenanceVisitor();

        // consume price visitor
        singleRoom.accept(priceVisitor);
        System.out.println("Price of single Room"
                + ((SingleRoom) singleRoom).getRoomPrice());

        doubleRoom.accept(priceVisitor);
        System.out.println("Price of Double Room"
                + ((DoubleRoom) doubleRoom).getRoomPrice());

        deluxeRoom.accept(priceVisitor);
        System.out.println("Price of Deluxe Room"
                + ((DeluxeRoom) deluxeRoom).getRoomPrice());

        // consume maintenance visitor
        singleRoom.accept(maintenanceVisitor);
        doubleRoom.accept(maintenanceVisitor);
        deluxeRoom.accept(maintenanceVisitor);
    }
}
