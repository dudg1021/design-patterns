package Behavior_Mode.State;

/**
 * @class: StartState
 * @description:
 * @author: dudg
 * @create: 2022-07-20 14:44
 */
public class StartState implements State {


    @Override
    public void doAction(Context context) {
        System.out.println("player is in start state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start State";
    }
}
