package Mediator;

/**
 * Created by houxinjie on 2016/12/16.
 */
public class MediatorPatternDemo {
    public static void main(String[] args){
        User robert = new User("Rober");
        User john = new User("John");

        robert.sendMessage("Hi! John");
        john.sendMessage("Hello! Robert");
    }
}
