package src.behavioral.chain_of_responsibility.logging;

public class ConsoleLogger implements ILogger{
    private ILogger logger;

    @Override
    public void setNext(ILogger logger) {
        this.logger = logger;
    }

    @Override
    public void logMessage(LogLevel logLevel, String message) {
        if (logLevel == LogLevel.INFO) {
            System.out.println("Console: " + message);
        } else if (logger != null) {
            logger.logMessage(logLevel, message);
        }
    }
}
