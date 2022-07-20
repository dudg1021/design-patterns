package Behavior_Mode.Chain;

/**
 * @class: Main
 * @description:
 * @author: dudg
 * @create: 2022-07-19 16:43
 */
public class Main {

    private static AbstractLogger getChainOfLoggers() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    /**
     * 责任链模式：为请求创建一个接收者对象的单向链（每个接收者都会包含对另一个接收者的引用），请求在链上传递每一个对象根据命令进行处理。
     * 避免请求发送者与接收者耦合，让多个对象都有可能接手请求，将这些对象连成一条链并沿着链传递请求，直到有对象处理为止。
     * @param args
     */
    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
        System.out.println();
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug information.");
        System.out.println();
        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
    }
}
