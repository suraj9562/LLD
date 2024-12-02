package decorators;

public class CheeseTopping extends ToppingsDecorator {
    BasePizza basePizza;

    public CheeseTopping(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 30;
    }
}
