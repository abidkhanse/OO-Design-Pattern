package singleton.thread_not_safe.logging;

public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.info("This is a Singleton Application with thread safety");
    }
}
