package Singleton;

/**
 * Created by houxinjie on 2016/12/15.
 */
public class SingletonPatternDemo {
    public static void main(String[] args){
        SingleObject object = SingleObject.getInstance();

        object.showMessage();
    }
}
