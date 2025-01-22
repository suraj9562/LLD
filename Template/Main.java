package Template;

public class Main {
    public static void main(String[] args) {
        PaymentFlow payToFriend = new PayToFriend();
        PaymentFlow payToMerchant = new PayToMerchant();

        // invoke template method
        payToFriend.sendMoney();
        payToMerchant.sendMoney();
    }
}
