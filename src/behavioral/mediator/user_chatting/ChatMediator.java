package src.behavioral.mediator.user_chatting;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements Mediator{

    private List<User> chatParticipants;

    ChatMediator() {
        chatParticipants = new ArrayList<>();
    }

    void addUser(User user) {
        chatParticipants.add(user);
    }

    @Override
    public void sendMessage(User user, String message) {
        for (User participant : chatParticipants) {
            if (participant != user) {
                participant.receiveMessage(message);
            }
        }
    }
}
