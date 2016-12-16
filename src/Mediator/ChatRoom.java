package Mediator;
import java.util.Date;

/**
 * Created by houxinjie on 2016/12/16.
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}
