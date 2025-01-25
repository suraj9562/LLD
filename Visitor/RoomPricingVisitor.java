package Visitor;

public class RoomPricingVisitor implements IRoomVisitor {
    @Override
    public void visit(SingleRoom singleRoom) {
        singleRoom.setRoomPrice(10);
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        doubleRoom.setRoomPrice(100);
    }

    @Override
    public void visit(DeluxeRoom deluxeRoom) {
        deluxeRoom.setRoomPrice(1000);
    }
}
