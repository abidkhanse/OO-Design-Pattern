package src.behavioral.state.light_switch;

public class OnState implements LightSwitchState{

    @Override
    public void switchOn() {
        System.out.println("Light is already on.");
    }

    @Override
    public void switchOff() {
        System.out.println("Light is switching off");
    }

}
