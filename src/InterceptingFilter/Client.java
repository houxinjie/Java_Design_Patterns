package InterceptingFilter;

/**
 * Created by houxinjie on 2016/12/16.
 */
public class Client {
    FilterManager filterManager;
    public void setFilterManager(FilterManager filterManager){
        this.filterManager = filterManager;
    }
    public void sendRequest(String request){
        filterManager.filterRequest(request);
    }
}
