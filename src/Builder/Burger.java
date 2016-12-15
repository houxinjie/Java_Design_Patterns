package Builder;

/**
 * Created by houxinjie on 2016/12/15.
 */
public abstract class Burger implements Item{
    @Override
    public Packing packing(){
        return new Wrapper();
    }
    @Override
    public abstract float price();
}
