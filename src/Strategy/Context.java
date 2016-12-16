package Strategy;

import Iterator.Container;

/**
 * Created by houxinjie on 2016/12/16.
 */
public class Context {
    private Strategy strategy;
    public Context(Strategy strategy){
        this.strategy = strategy;
    }
    public int excuteStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
