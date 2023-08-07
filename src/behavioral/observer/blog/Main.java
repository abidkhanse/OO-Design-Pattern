package src.behavioral.observer.blog;

public class Main {

    public static void main(String[] args) {

        User user1 = new User("Khan");
        User user2 = new User("Sher");
        User user3 = new User("New Subscriber");

        Subject subject = new Blog();

        subject.addObserver(user1);
        subject.addObserver(user2);
        subject.notifyObserver("Breaking news: Rover has landed to Mars");

        subject.addObserver(user3);
        subject.notifyObserver("Breaking news: Twitter has X-ed");

    }
}
