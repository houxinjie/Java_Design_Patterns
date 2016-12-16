package Null;

/**
 * Created by houxinjie on 2016/12/16.
 */
public class RealCustomer extends AbstractCustomer {
    public RealCustomer(String name){
        this.name = name;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public boolean isNil(){
        return false;
    }
}
