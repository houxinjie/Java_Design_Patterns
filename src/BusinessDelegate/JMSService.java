package BusinessDelegate;

/**
 * Created by houxinjie on 2016/12/16.
 */
public class JMSService implements BusinessService {
    @Override
    public void doProcessing(){
        System.out.println("Processing task by invoking JMS Service");
    }
}
