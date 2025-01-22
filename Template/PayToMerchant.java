package Template;

public class PayToMerchant extends PaymentFlow {
    @Override
    public void validateRequest() {
        // own logic here
        System.out.println("validateRequest of Merchant has been called");
    }

    @Override
    public void calculateFee() {
        // own logic here
        System.out.println("calculateFee of Merchant has been called");
    }

    @Override
    public void debitAmount() {
        // own logic here
        System.out.println("debitAmount of Merchant has been called");
    }

    @Override
    public void creditAmount() {
        // own logic here
        System.out.println("creditAmount of Merchant has been called");
    }
}
