import java.util.ArrayList;
import java.util.List;

import interfaces.IObservable;
import interfaces.IObserver;

public class Product implements IObservable {
    List<IObserver> observers = new ArrayList<IObserver>();
    int stock = 0;

    @Override
    public void add(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public int getData() {
        return stock;
    }

    @Override
    public void remove(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void setData(int data) {
        if (stock == 0) {
            stock = data;
            update();
        }
    }

    @Override
    public void update() {
        for (IObserver iObserver : observers) {
            iObserver.fNotify();
        }
    }
}
