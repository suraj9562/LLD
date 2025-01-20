package Command;

public class TurnOnACCommand implements ICommand {
    ACConditioner acConditioner;

    TurnOnACCommand(ACConditioner acConditioner) {
        this.acConditioner = acConditioner;
    }

    @Override
    public void execute() {
        acConditioner.turnON();
    }

    @Override
    public void undo() {
        acConditioner.turnOff();
    }
}
