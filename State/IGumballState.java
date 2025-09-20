package State;

public interface IGumballState {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
