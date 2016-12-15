package AbstractFactory;

/**
 * Created by houxinjie on 2016/12/15.
 */
public class Green implements Color {
    @Override
    public void fill(){
        System.out.println("Inside Red::fill() method.");
    }
}
