package InterceptingFilter;

/**
 * Created by houxinjie on 2016/12/16.
 */
public class DebugFilter implements Filter {
    public void execute(String request){
        System.out.println("request log: " + request);
    }
}
