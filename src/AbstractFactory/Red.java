package AbstractFactory;

/**
 * Created by houxinjie on 2016/12/15.
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
