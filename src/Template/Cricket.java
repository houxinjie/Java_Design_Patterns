package Template;

/**
 * Created by houxinjie on 2016/12/16.
 */
public class Cricket extends Game{

    @Override
    void endPlay(){
        System.out.println("Cricket Game Finished!");
    }

    @Override
    void initialize(){
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void startPlay(){
        System.out.println("Cricket Game Started. Enjoy the game!");
    }
}
