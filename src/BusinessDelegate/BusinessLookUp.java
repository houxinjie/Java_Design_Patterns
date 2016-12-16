package BusinessDelegate;

/**
 * Created by houxinjie on 2016/12/16.
 */
public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType) {
        if(serviceType.equalsIgnoreCase("EJB")){
            return new EJBService();
        } else {
            return new JMSService();
        }
    }
}
