package singleton.logging;

public class Logger {
    private static volatile Logger logger;

    public static synchronized Logger getInstance() {

        if (logger == null) {
            logger = new Logger();
        }

        return logger;
    }

    public void info(String message) {
        System.out.println("Log.info: " + message);
    }

    public void error(String message) {
        System.out.println("Log.error: " + message);
    }

}
