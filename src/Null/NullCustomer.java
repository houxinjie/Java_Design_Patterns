package Null;

/**
 * Created by houxinjie on 2016/12/16.
 */
public class NullCustomer extends AbstractCustomer {
    @Override
    public String getName(){
        return "Not Available in Customer Database";
    }

    @Override
    public boolean isNil(){
        return true;
    }
}
