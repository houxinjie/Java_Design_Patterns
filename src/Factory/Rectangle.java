package Factory;

/**
 * Created by houxinjie on 2016/12/15.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
