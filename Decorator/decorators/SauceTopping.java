package decorators;

public class SauceTopping extends ToppingsDecorator {
    BasePizza basePizza;

    public SauceTopping(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 20;
    }
}
