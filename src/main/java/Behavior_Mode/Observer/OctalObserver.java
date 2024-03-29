package Behavior_Mode.Observer;

/**
 * @class: OctalObserver
 * @description:
 * @author: dudg
 * @create: 2022-07-18 15:28
 */
public class OctalObserver extends Observer{
    private Subject subject;

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
    }
}
