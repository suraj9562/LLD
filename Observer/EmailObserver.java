import interfaces.IObservable;
import interfaces.IObserver;

public class EmailObserver implements IObserver {
    IObservable observable;
    String email;

    public EmailObserver(String email, IObservable observable) {
        this.observable = observable;
        this.email = email;
    }

    @Override
    public void fNotify() {
        int stock = observable.getData();
        System.out.println("Email Observer Invoker; sending mail to " + email);
        if (stock > 0) {
            System.out.println("product xyz in back in stock: " + stock);
        } else {
            System.out.println("product xyz in goes out of stock");
        }
    }
}
