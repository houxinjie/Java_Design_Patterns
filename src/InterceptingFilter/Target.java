package InterceptingFilter;

/**
 * Created by houxinjie on 2016/12/16.
 */
public class Target {
    public void execute(String request){
        System.out.println("Executing request: " + request);
    }
}
