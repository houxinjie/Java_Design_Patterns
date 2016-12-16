package State;

/**
 * Created by houxinjie on 2016/12/16.
 */
public class StatePatternDemo {
    public static void main(String[] args){
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());
    }
}
