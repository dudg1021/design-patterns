package Behavior_Mode.Observer;

/**
 * @class: BinaryObserver
 * @description:
 * @author: dudg
 * @create: 2022-07-18 15:26
 */
public class BinaryObserver extends Observer {

    private Subject subject;

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {

        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }
}
