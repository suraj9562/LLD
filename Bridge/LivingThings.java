package Bridge;

public abstract class LivingThings {
    BreatheImplementor breatheImplementor;

    LivingThings(BreatheImplementor breatheImplementor) {
        this.breatheImplementor = breatheImplementor;
    }

    abstract public void breathProcess();
}
