package Visitor;

/**
 * Created by houxinjie on 2016/12/16.
 */
public class Computer implements ComputerPart {
    ComputerPart[] parts;

    public Computer(){
        parts = new ComputerPart[]{new Mouse(), new Keyboard(), new Monitor()};
    }
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor){
        for(int i = 0; i < parts.length; i++){
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
