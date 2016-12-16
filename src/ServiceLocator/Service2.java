package ServiceLocator;

/**
 * Created by houxinjie on 2016/12/16.
 */
public class Service2 implements Service {
    public void execute(){
        System.out.println("Executing Service2");
    }

    @Override
    public String getName(){
        return "Service2";
    }
}
