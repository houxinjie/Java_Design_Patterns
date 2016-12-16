package State;

/**
 * Created by houxinjie on 2016/12/16.
 */
public class StartState implements State {
    public void doAction(Context context){
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString(){
        return "Start State";
    }
}
