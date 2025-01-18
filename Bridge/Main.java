package Bridge;

public class Main {
    public static void main(String[] args) {
        BreatheImplementor waterImpl = new WaterBreatheImpl();
        BreatheImplementor treeImpl = new TreeBreatheImpl();
        BreatheImplementor landImpl = new LandBreatheImplementation();

        LivingThings dog = new Dog(landImpl);
        LivingThings tree = new Tree(treeImpl);
        LivingThings fish = new Fish(waterImpl);

        dog.breathProcess();
        tree.breathProcess();
        fish.breathProcess();
    }
}
