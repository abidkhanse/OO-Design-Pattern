package src.behavioral.mediator_pattern.user_chatting;

public class User {
    private String name;
    private Mediator mediator;

    public User(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public void sendMessage(String message) {
        System.out.println(this.name + " sending message: " + message);
        mediator.sendMessage(this, message);
    }

    public void receiveMessage(String message) {
        System.out.printf("%s received message: %s%n", name, message);
    }
}
