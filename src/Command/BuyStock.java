package Command;

/**
 * Created by houxinjie on 2016/12/16.
 */
public class BuyStock implements Order {
    private Stock abcStock;
    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }
    public void execute(){
        abcStock.buy();
    }
}
