package BusinessDelegate;

/**
 * Created by houxinjie on 2016/12/16.
 */
public class Client {
    BusinessDelegate businessService;
    public Client(BusinessDelegate businessService){
        this.businessService = businessService;
    }
    public void doTask(){
        businessService.doTask();
    }
}
