package Behavior_Mode.State;

/**
 * @class: Main
 * @description:
 * @author: dudg
 * @create: 2022-07-20 15:59
 */
public class Main {

    /**
     * 状态模式：对有状态的对象，把复杂的“判断逻辑”提取到不同的状态对象中，允许状态对象在其内部状态发生改变时改变其行为。
     * @param args
     */
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println(context.getState().toString());
        System.out.println();

        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());
        System.out.println();
    }
}
