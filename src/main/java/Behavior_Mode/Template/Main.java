package Behavior_Mode.Template;

/**
 * @class: Main
 * @description:
 * @author: dudg
 * @create: 2022-07-20 11:58
 */
public class Main {

    /**
     * 模板方法模式：定义一个操作中的算法的骨架，将步骤延迟到子类中。
     * 模板方法只负责定义每一步应该做什么，具体怎么做由子类实现！
     * @param args
     */
    public static void main(String[] args) {
        Game game = new Football();
        game.play();
        System.out.println();

        game = new Basketball();
        game.play();
        System.out.println();
    }
}
