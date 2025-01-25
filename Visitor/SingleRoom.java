package Visitor;

public class SingleRoom implements IRoomElement {

    private int roomPrice = 0;

    @Override
    public void accept(IRoomVisitor visitor) {
        visitor.visit(this);
    }

    public int getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(int roomPrice) {
        this.roomPrice = roomPrice;
    }
}
