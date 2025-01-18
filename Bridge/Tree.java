package Bridge;

public class Tree extends LivingThings {
    Tree(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breathProcess() {
        breatheImplementor.breathe();
    }
}
