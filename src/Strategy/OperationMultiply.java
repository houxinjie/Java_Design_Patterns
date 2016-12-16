package Strategy;

/**
 * Created by houxinjie on 2016/12/16.
 */
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2){
        return num1 * num2;
    }
}
