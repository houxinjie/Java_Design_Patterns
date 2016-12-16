package Chain;

/**
 * Created by houxinjie on 2016/12/16.
 */
public class FileLogger extends AbstractLogger {
    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message){
        System.out.println("Debug::Logger: " + message);
    }
}
