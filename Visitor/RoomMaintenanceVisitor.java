package Visitor;

public class RoomMaintenanceVisitor implements IRoomVisitor {

    @Override
    public void visit(SingleRoom singleRoom) {
        System.out.println("Single Room is under maintenance");
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        System.out.println("Double Room is under maintenance");
    }

    @Override
    public void visit(DeluxeRoom deluxeRoom) {
        System.out.println("Deluxe Room is under maintenance");
    }
}
