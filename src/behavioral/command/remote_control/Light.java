package src.behavioral.command.remote_control;

public class Light {
    private final String name;

    Light(String name) {
        this.name = name;
    }
    public void on() {
        System.out.println(name + " Light is switched ON");
    }

    public void off() {
        System.out.println(name + " Light is switched OFF");
    }
}
