package src.behavioral.observer.blog;

public class User implements Observer{
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("\nNews update for: "+ this.name );
        System.out.println(message);
    }

}
