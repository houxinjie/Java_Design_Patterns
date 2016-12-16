package FrontController;

/**
 * Created by houxinjie on 2016/12/16.
 */
public class FrontControllerPatternDemo {
    public static void main(String[] args){
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}
