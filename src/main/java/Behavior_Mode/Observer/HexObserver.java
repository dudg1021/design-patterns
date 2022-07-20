package Behavior_Mode.Observer;

/**
 * @class: OctalObserver
 * @description:
 * @author: dudg
 * @create: 2022-07-18 15:28
 */
public class HexObserver extends Observer{
    private Subject subject;

    public HexObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: " + Integer.toHexString(subject.getState()));
    }
}
