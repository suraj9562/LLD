package Mediator;

public interface IMediator {
    public void addBidder(IColleague colleague);

    public void placeBid(IColleague colleague, int bidAmount);
}
