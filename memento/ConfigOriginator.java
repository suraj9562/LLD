package memento;

public class ConfigOriginator {
    int height;
    int width;

    ConfigOriginator(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public ConfigMemento createMemento() {
        return new ConfigMemento(height, width);
    }

    public void restoreMemento(ConfigMemento memento) {
        this.height = memento.getHeight();
        this.width = memento.getWidth();
    }
}
