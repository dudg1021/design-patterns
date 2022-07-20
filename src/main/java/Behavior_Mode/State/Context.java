package Behavior_Mode.State;

/**
 * @class: Context
 * @description:
 * @author: dudg
 * @create: 2022-07-20 14:44
 */
public class Context {

    private State state;

    public Context() {
        state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
