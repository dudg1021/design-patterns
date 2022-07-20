package Behavior_Mode.Template;

/**
 * @class: Basketball
 * @description:
 * @author: dudg
 * @create: 2022-07-20 11:56
 */
public class Basketball extends Game {

    @Override
    void endPlay() {
        System.out.println("Basketball Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Basketball Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Basketball Game Started. Enjoy the game!");
    }
}
