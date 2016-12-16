package Null;

/**
 * Created by houxinjie on 2016/12/16.
 */
public class CustomerFactory {
    public static final String[] names = {"Rob", "Joe", "Julie"};
    public static AbstractCustomer getCustomer(String name){
        for(int i = 0; i < names.length; i++){
            if(names[i].equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
