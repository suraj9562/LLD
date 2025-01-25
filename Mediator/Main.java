package Mediator;

public class Main {
    public static void main(String[] args) {
        IMediator auctionMediator = new AuctionMediator();

        // bidders
        IColleague bidder_1 = new Bidder("A", auctionMediator);
        IColleague bidder_2 = new Bidder("B", auctionMediator);
        IColleague bidder_3 = new Bidder("C", auctionMediator);

        // place bids
        bidder_1.placeBid(10);
        bidder_2.placeBid(20);
        bidder_3.placeBid(30);
        bidder_1.placeBid(40);
        bidder_3.placeBid(50);
        bidder_2.placeBid(60);
    }
}
