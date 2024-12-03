package interfaces;

public interface IObservable {
    public void add(IObserver observer);

    public void remove(IObserver observer);

    public void update();

    public int getData();

    public void setData(int data);
}
