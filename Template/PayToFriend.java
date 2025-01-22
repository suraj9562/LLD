package Template;

public class PayToFriend extends PaymentFlow {
    @Override
    public void validateRequest() {
        // own logic here
        System.out.println("validateRequest of Friend has been called");
    }

    @Override
    public void calculateFee() {
        // own logic here
        System.out.println("calculateFee of Friend has been called");
    }

    @Override
    public void debitAmount() {
        // own logic here
        System.out.println("debitAmount of Friend has been called");
    }

    @Override
    public void creditAmount() {
        // own logic here
        System.out.println("creditAmount of Friend has been called");
    }
}
