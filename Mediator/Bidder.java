package Mediator;

public class Bidder implements IColleague {
    String name;
    IMediator mediator;

    Bidder(String name, IMediator mediator) {
        this.name = name;
        this.mediator = mediator;
        mediator.addBidder(this);
    }

    @Override
    public void placeBid(int bidAmount) {
        mediator.placeBid(this, bidAmount);
    }

    @Override
    public void getNotification(String name, int amount) {
        System.out.println("Bidder " + name + "has placed bid of amount " + amount);
    }

    public String getName() {
        return name;
    }
}
