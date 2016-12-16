package Memento;

/**
 * Created by houxinjie on 2016/12/16.
 */
public class Memento {
    private String state;
    public Memento(String state){
        this.state = state;
    }
    public String getState(){
        return state;
    }
}
