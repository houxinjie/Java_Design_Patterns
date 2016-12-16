package State;

/**
 * Created by houxinjie on 2016/12/16.
 */
public class Context {
    private State state;
    public Context(){
        state = null;
    }
    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
