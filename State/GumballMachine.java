package State;

public class GumballMachine {
    IGumballState soldOutState;
    IGumballState noQuarterState;
    IGumballState hasQuarterState;
    IGumballState soldState;

    IGumballState state = soldOutState;
    int count = 0;

    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(IGumballState state) {
        this.state = state;
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }

    public IGumballState getNoQuarterState() {
        return this.noQuarterState;
    }

    public IGumballState getSoldOutState() {
        return this.soldOutState;
    }

    public IGumballState getHasQuarterState() {
        return this.hasQuarterState;
    }

    public IGumballState getSoldState() {
        return this.soldState;
    }

    public int getGumballCount() {
        return count;
    }
}
