import interfaces.IObservable;
import interfaces.IObserver;

public class MobileObserver implements IObserver {
    IObservable observable;
    String contact;

    public MobileObserver(String contact, IObservable observable) {
        this.observable = observable;
        this.contact = contact;
    }

    @Override
    public void fNotify() {
        int stock = observable.getData();
        System.out.println("Mobile Observer Invoked; contacting to " + contact);
        if (stock > 0) {
            System.out.println("product xyz in back in stock: " + stock);
        } else {
            System.out.println("product xyz in goes out of stock");
        }
    }
}
