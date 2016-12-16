package Visitor;

/**
 * Created by houxinjie on 2016/12/16.
 */
public class VisitorPatternDemo {
    public static void main(String[] args){
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
