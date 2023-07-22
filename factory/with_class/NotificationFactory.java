package factory.with_class;

public class NotificationFactory {

    public static final String SMS = "sms";
    public static final String EMAIL = "email";

    public Notification createNotification(String channel) {

        return switch (channel.toUpperCase()) {
            case "SMS" -> new SMSNotification();
            case "EMAIL" -> new EmailNotification();
            default -> null;
        };

    }

}
