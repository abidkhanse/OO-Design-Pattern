package src.creational.factory.with_class;

public class Main {

    public static void main(String[] args) {

        NotificationFactory notificationFactory = new NotificationFactory();

        Notification sms =  notificationFactory.createNotification(NotificationFactory.SMS);
        sms.notifyUser();

        Notification email = notificationFactory.createNotification(NotificationFactory.EMAIL);
        email.notifyUser();

    }

}
