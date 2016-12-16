package Chain;

/**
 * Created by houxinjie on 2016/12/16.
 */
public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message){
        System.out.println("Standard Info::Logger: " + message);
    }
}
