package InterceptingFilter;

/**
 * Created by houxinjie on 2016/12/16.
 */
public class AuthenticationFilter implements Filter {
    public void execute(String request){
        System.out.println("Authenticating request: " + request);
    }
}
