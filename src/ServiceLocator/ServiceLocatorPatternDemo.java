package ServiceLocator;

/**
 * Created by houxinjie on 2016/12/16.
 */
public class ServiceLocatorPatternDemo {
    public static void main(String[] args){
        Service service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
        service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
    }
}
