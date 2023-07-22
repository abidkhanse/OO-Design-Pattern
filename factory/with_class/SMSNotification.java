package factory.with_class;

public class SMSNotification extends Notification {

    @Override
    public void notifyUser()
    {
        System.out.println("Sending an SMS notification");
    }
}