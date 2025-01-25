package Mediator;

import java.util.ArrayList;
import java.util.List;

public class AuctionMediator implements IMediator {

    List<IColleague> bidders;

    AuctionMediator() {
        bidders = new ArrayList<IColleague>();
    }

    @Override
    public void addBidder(IColleague colleague) {
        bidders.add(colleague);
    }

    @Override
    public void placeBid(IColleague colleague, int bidAmount) {
        for (IColleague it : bidders) {
            if(!it.getName().equals(colleague.getName())){
                it.getNotification(colleague.getName(), bidAmount);
            }
        }
    }
}
