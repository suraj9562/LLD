package Bridge;

public class Fish extends LivingThings {
    Fish(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breathProcess() {
        breatheImplementor.breathe();
    }
}
