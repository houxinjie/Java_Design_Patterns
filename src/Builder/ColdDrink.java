package Builder;

/**
 * Created by houxinjie on 2016/12/15.
 */
public abstract class ColdDrink implements Item{
    @Override
    public Packing packing(){
        return new Bottle();
    }

    @Override
    public abstract float price();
}
