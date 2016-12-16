package ServiceLocator;


/**
 * Created by houxinjie on 2016/12/16.
 */
public class Service1 implements Service {
    public void execute(){
        System.out.println("Executing Service1");

    }

    @Override
    public String getName(){
        return "Service1";
    }
}
