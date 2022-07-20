package Behavior_Mode.State;

/**
 * @class: StopState
 * @description:
 * @author: dudg
 * @create: 2022-07-20 14:50
 */
public class StopState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stop State";
    }
}
