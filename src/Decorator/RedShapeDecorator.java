package Decorator;

/**
 * Created by houxinjie on 2016/12/15.
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape){
        super(decoratedShape);
    }

    @Override
    public void draw(){
        decoratedShape.draw();
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
