package Command;

public class ACConditioner {
    boolean isON;
    int temperature;

    public void turnON() {
        isON = true;
        System.out.println("AC is turned on");
    }

    public void turnOff() {
        isON = false;
        System.out.println("AC is turned off");
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("temperature is set to " + temperature);
    }
}
