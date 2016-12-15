package Proxy;

/**
 * Created by houxinjie on 2016/12/15.
 */
public class ProxyPatternDemo {
    public static void main(String[] args){
        Image image = new ProxyImage("test_10mb.jpg");

        image.display();

        System.out.println("");
        image.display();
    }
}
