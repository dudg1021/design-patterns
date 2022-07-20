package Behavior_Mode.Observer;

/**
 * @class: Main
 * @description:
 * @author: dudg
 * @create: 2022-07-18 15:30
 */
public class Main {

    /**
     * 观察者模式：定义对象间一对多的依赖关系，当一个对象发生改变时，所有依赖它的对象都得到通知并被自动更新
     * @param args
     */
    public static void main(String[] args) {

        Subject subject = new Subject();

        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);

        System.out.println();

        System.out.println("First state change: 10");
        subject.setState(10);

    }
}
