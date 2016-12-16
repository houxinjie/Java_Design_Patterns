package Observer;

/**
 * Created by houxinjie on 2016/12/16.
 */
public class OctalObserver extends Observer {
    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update(){
        System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
    }
}
