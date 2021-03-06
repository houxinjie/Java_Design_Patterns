package Memento;

/**
 * Created by houxinjie on 2016/12/16.
 */
public class Originator {
    private String state;
    public void setState(String state){
        this.state = state;
    }
    public String getState(){
        return state;
    }
    public Memento saveStateToMemento(){
        return new Memento(state);
    }
    public void getStateFromMemento(Memento memento){
        state = memento.getState();
    }
}
