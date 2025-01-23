package memento;

import java.util.Stack;

public class ConfigCareTaker {
    Stack<ConfigMemento> mementos = new Stack<ConfigMemento>();

    ConfigCareTaker() {

    }

    public void addToMemento(ConfigMemento memento) {
        mementos.add(memento);
    }

    public ConfigMemento undo() {
        if (mementos.empty())
            return null;

        return mementos.pop();
    }
}
