package factory.with_class;

public class EmailNotification extends Notification {

    @Override
    public void notifyUser() {
        System.out.println("Sending an E-mail notification");
    }

}