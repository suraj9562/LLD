import interfaces.IObservable;
import interfaces.IObserver;

public class Main {
    public static void main(String[] args) {
        IObservable observable = new Product();

        IObserver observer1 = new EmailObserver("abc@gmail.com", observable);
        // IObserver observer2 = new EmailObserver("9970967795", observable);

        observable.add(observer1);
        // observable.add(observer2);

        observable.setData(0);
        observable.setData(10);
    }
}
