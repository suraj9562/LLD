package Template;

public abstract class PaymentFlow {
    public abstract void validateRequest();

    public abstract void calculateFee();

    public abstract void debitAmount();

    public abstract void creditAmount();

    // template method
    // define the order of execution
    public final void sendMoney() {
        // step 1: validate
        this.validateRequest();

        // step 2: calculate
        this.calculateFee();

        // step 3: debit
        this.debitAmount();

        // step 4: credit
        this.creditAmount();
    }
}
