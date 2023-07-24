package src.behavioral.chain_of_responsibility.logging;

public interface ILogger {
    void setNext(ILogger logger);
    void logMessage(LogLevel logLevel, String message);
}
