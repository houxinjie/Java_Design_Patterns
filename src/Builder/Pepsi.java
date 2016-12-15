package Builder;

/**
 * Created by houxinjie on 2016/12/15.
 */
public class Pepsi extends ColdDrink {
    @Override
    public float price(){
        return 35.0f;
    }

    @Override
    public String name(){
        return "Pepsi";
    }
}
