package src.behavioral.state.light_switch;

public class LightSwitch {

    private LightSwitchState lightSwitchState;

    public LightSwitch() {
        lightSwitchState = new OffState();
    }

    private void setState(LightSwitchState state) {
        this.lightSwitchState = state;
    }

    public void turnOn() {
        lightSwitchState.switchOn();
        if (lightSwitchState instanceof OffState) {
            this.setState(new OnState());
        }
    }

    public void turnOff() {
        lightSwitchState.switchOff();
        if (lightSwitchState instanceof OnState) {
            this.setState(new OffState());
        }
    }

}
