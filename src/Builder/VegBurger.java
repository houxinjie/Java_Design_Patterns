package Builder;

/**
 * Created by houxinjie on 2016/12/15.
 */
public class VegBurger extends Burger {
    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name(){
        return "Veg Burger";
    }
}
