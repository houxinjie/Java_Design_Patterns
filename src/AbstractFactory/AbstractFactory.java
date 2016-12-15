package AbstractFactory;

/**
 * Created by houxinjie on 2016/12/15.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
