package src.behavioral.chain_of_responsibility.logging;

public class Main {

    public static void main(String[] args) {

        ILogger cLogger = new ConsoleLogger();
        ILogger fLogger = new FileLogger();
        ILogger eLogger = new EmailLogger();

        cLogger.setNext(fLogger);
        fLogger.setNext(eLogger);

        cLogger.logMessage(LogLevel.INFO, "Application is launched");
        cLogger.logMessage(LogLevel.WARNING, "Application is responding slower than normal");
        cLogger.logMessage(LogLevel.ERROR, "Application has a bug, please fix it");

    }

}
