package Visitor;

/**
 * Created by houxinjie on 2016/12/16.
 */
public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor){
        computerPartVisitor.visit(this);
    }
}
