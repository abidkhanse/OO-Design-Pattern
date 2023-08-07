package src.behavioral.mediator.user_chatting;

public class Main {

    public static void main(String[] args) {

        ChatMediator mediator = new ChatMediator();

        User abid = new User("Abid", mediator);
        mediator.addUser(abid);
        User sher = new User("Sher", mediator);
        mediator.addUser(sher);
        User affaf = new User("Affaf", mediator);
        mediator.addUser(affaf);



        abid.sendMessage("Hello Everyone");
        sher.sendMessage("Hello Abid");
    }
}
