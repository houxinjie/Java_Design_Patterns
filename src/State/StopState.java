package State;

/**
 * Created by houxinjie on 2016/12/16.
 */
public class StopState implements State {
    public void doAction(Context context){
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }
}
