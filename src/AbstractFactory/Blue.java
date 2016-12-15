package AbstractFactory;

/**
 * Created by houxinjie on 2016/12/15.
 */
public class Blue implements Color {
    @Override
    public void fill(){
        System.out.println("Inside Blue::fill() method.");
    }
}
