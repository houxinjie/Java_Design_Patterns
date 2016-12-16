package Visitor;

/**
 * Created by houxinjie on 2016/12/16.
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
