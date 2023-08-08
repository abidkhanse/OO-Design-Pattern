package src.behavioral.state.light_switch;

public class Main {

    public static void main(String[] args) {

        LightSwitch lightSwitch = new LightSwitch();

        lightSwitch.turnOn();
        lightSwitch.turnOff();
        lightSwitch.turnOn();
        lightSwitch.turnOn();
        lightSwitch.turnOff();
        lightSwitch.turnOff();

    }
}
