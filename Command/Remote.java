package Command;

import java.util.Stack;

public class Remote {
    ICommand command;
    Stack<ICommand> commands = new Stack<ICommand>();

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
        commands.add(command);
    }

    public void undo() {
        if (!commands.isEmpty()) {
            ICommand command = commands.pop();
            command.undo();
        }
    }
}
