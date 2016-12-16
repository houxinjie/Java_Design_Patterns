package Chain;

/**
 * Created by houxinjie on 2016/12/16.
 */
public class ChainPatternDemo {
    private static AbstractLogger getChainOfLoggers(){
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger debugLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger infoLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(infoLogger);

        return errorLogger;
    }

    public static void main(String[] args){
        AbstractLogger loggerChain = getChainOfLoggers();
        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level infomation.");
        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
    }
}
