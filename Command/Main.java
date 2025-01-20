package Command;

public class Main {
    public static void main(String[] args) {
        Remote remote = new Remote();
        ACConditioner ac = new ACConditioner();
        ICommand turnOnAC = new TurnOnACCommand(ac);
        ICommand turnOffAC = new TurnOffACCommand(ac);

        remote.setCommand(turnOnAC);
        remote.pressButton();

        remote.setCommand(turnOffAC);
        remote.pressButton();

        remote.undo();
    }
}
