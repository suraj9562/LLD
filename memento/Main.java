package memento;

public class Main {
    public static void main(String[] args) {
        // create caretaker
        ConfigCareTaker careTaker = new ConfigCareTaker();

        // create cofiguration object
        ConfigOriginator originator = new ConfigOriginator(5, 10);

        // first snapshot
        ConfigMemento snap1 = originator.createMemento();
        careTaker.addToMemento(snap1);

        // update originator
        originator.setHeight(10);
        originator.setHeight(5);

        // second snapshot
        ConfigMemento snap2 = originator.createMemento();
        careTaker.addToMemento(snap2);

        // update originator
        originator.setHeight(20);
        originator.setHeight(10);

        // now perform undo operation to restore previous state of originator
        ConfigMemento prevState = careTaker.undo();
        originator.restoreMemento(prevState);
    }
}
