package AbstractFactory;

/**
 * Created by houxinjie on 2016/12/15.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
