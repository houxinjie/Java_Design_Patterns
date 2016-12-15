package Prototype;

/**
 * Created by houxinjie on 2016/12/15.
 */
public class Square extends Shape{
    public Square(){
        type = "Square";
    }

    @Override
    public void draw(){
        System.out.println("Inside Square::draw() method.");
    }


}
