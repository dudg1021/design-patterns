package Behavior_Mode.Template;

/**
 * @class: Game
 * @description:
 * @author: dudg
 * @create: 2022-07-20 11:53
 */
public abstract class Game {

    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    public final void play() {
        //初始化
        initialize();

        //开始
        startPlay();

        //结束
        endPlay();
    }

}
