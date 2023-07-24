package src.behavioral.chain_of_responsibility.logging;

public class EmailLogger implements ILogger{

    private ILogger logger;

    @Override
    public void setNext(ILogger logger) {
        this.logger = logger;
    }

    @Override
    public void logMessage(LogLevel logLevel, String message) {

        if (logLevel == LogLevel.ERROR) {

            System.out.println("Critical: " + message);
            System.out.println("Email has sent to relevant department");

        }
    }
}
