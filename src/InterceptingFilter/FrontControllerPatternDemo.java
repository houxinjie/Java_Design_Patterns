package InterceptingFilter;

/**
 * Created by houxinjie on 2016/12/16.
 */
public class FrontControllerPatternDemo {
    public static void main(String[] args){
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());
        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("HOME");
    }
}
