package AbstractFactory;

/**
 * Created by houxinjie on 2016/12/15.
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
