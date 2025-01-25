package Visitor;

public interface IRoomVisitor {
    public void visit(SingleRoom singleRoom);

    public void visit(DoubleRoom doubleRoom);

    public void visit(DeluxeRoom deluxeRoom);
}
