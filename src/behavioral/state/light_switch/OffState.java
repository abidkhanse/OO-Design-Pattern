package src.behavioral.state.light_switch;

public class OffState implements LightSwitchState{

    @Override
    public void switchOn() {
        System.out.println("Light is switching on");
    }

    @Override
    public void switchOff() {
        System.out.println("Light is already off");
    }

}
