package Observer;

/**
 * Created by houxinjie on 2016/12/16.
 */
public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update(){
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }

}
