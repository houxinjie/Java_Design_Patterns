package Prototype;

/**
 * Created by houxinjie on 2016/12/15.
 */
public class Circle extends Shape {
    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw(){
        System.out.println("Inside Circle::draw() method.");
    }
}
