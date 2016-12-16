package Template;

/**
 * Created by houxinjie on 2016/12/16.
 */
public class TemplatePatternDemo {
    public static void main(String[] args){
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
