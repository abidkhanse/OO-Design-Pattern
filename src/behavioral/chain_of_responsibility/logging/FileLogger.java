package src.behavioral.chain_of_responsibility.logging;

public class FileLogger implements ILogger{

    private ILogger logger;

    @Override
    public void setNext(ILogger logger) {
        this.logger = logger;
    }

    @Override
    public void logMessage(LogLevel logLevel, String message) {

        if (logLevel == LogLevel.WARNING) {
            System.out.println("Warning: Saved in log file " + message);
        } else if (logger != null) {
            logger.logMessage(logLevel, message);
        }
    }

}
