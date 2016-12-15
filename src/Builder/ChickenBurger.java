package Builder;

/**
 * Created by houxinjie on 2016/12/15.
 */
public class ChickenBurger extends Burger {
    @Override
    public float price(){
        return 50.5f;
    }

    @Override
    public String name(){
        return "Chicken Burger";
    }
}
