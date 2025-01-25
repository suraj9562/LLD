package Visitor;

public interface IRoomElement {
    public void accept(IRoomVisitor visitor);
}
