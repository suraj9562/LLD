package Command;

public class TurnOffACCommand implements ICommand {
    ACConditioner acConditioner;

    TurnOffACCommand(ACConditioner acConditioner) {
        this.acConditioner = acConditioner;
    }

    @Override
    public void execute() {
        acConditioner.turnOff();
    }

    @Override
    public void undo() {
        acConditioner.turnON();
    }
}
