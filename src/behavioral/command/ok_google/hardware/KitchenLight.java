package src.behavioral.command.ok_google.hardware;

public class KitchenLight {

    private final String name;

    public KitchenLight(String name){
        this.name = name;
    }

    public void on() {
        System.out.printf("%s is Switched ON %n", name);
    }

    public void off() {
        System.out.printf("%s is Switched OFF %n", name);
    }
}
