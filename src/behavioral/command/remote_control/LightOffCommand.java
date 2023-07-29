package src.behavioral.command.remote_control;

public class LightOffCommand implements Command {

    private final Light light;
    LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
