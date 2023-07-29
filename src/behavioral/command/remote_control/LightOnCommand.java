package src.behavioral.command.remote_control;

public class LightOnCommand implements Command{

    private final Light light;
    LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
