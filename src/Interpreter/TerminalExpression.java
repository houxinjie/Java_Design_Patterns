package Interpreter;

/**
 * Created by houxinjie on 2016/12/16.
 */
public class TerminalExpression implements Expression {
    private String data;
    public TerminalExpression(String data){
        this.data = data;
    }
    @Override
    public boolean interpret(String context){
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
