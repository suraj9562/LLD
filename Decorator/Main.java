import decorators.BasePizza;
import decorators.CheeseTopping;
import decorators.MushroomTopping;
import decorators.SauceTopping;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza_1 = new SauceTopping(new MushroomTopping(new CheeseTopping(new VegDelightPizza())));
        System.out.println("Pizza_1 cost: " + pizza_1.cost());

        BasePizza pizza_2 = new SauceTopping(new SauceTopping(new SauceTopping(new FarmhousePizza())));
        System.out.println("Pizza_2 cost: " + pizza_2.cost());

        BasePizza pizza_3 = new MushroomTopping(new MushroomTopping(new MushroomTopping(new MargheritaPizza())));
        System.out.println("Pizza_3 cost: " + pizza_3.cost());

        BasePizza pizza_4 = new CheeseTopping(new CheeseTopping(new CheeseTopping(new VegDelightPizza())));
        System.out.println("Pizza_4 cost: " + pizza_4.cost());
    }
}
