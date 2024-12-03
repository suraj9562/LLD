package Plans;

public abstract class Plan {
    int rate;

    public abstract void getRate();

    public void calculateBill(int units) {
        System.out.println(units * rate);
    }
}
