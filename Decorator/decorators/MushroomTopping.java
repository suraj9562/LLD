package decorators;

public class MushroomTopping extends ToppingsDecorator {
    BasePizza basePizza;

    public MushroomTopping(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 10;
    }
}
