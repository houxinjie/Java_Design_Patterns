package CompositeEntity;

/**
 * Created by houxinjie on 2016/12/16.
 */
public class CompositeEntityPatternDemo {
    public static void main(String[] args){
        Client client = new Client();
        client.setData("Test", "Data");
        client.printData();
        client.setData("Second Test", "Data1");
        client.printData();
    }

}
