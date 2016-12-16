package Command;

/**
 * Created by houxinjie on 2016/12/16.
 */
public class SellStock implements Order {
    private Stock abcStock;
    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }
    public void execute(){
        abcStock.sell();
    }
}
