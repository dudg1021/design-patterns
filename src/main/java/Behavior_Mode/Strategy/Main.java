package Behavior_Mode.Strategy;

/**
 * @class: Main
 * @description:
 * @author: dudg
 * @create: 2022-07-15 18:39
 */
public class Main {

    /**
     * 策略模式： 将算法封装为一个个类，任意替换调用。
     * @param args
     */
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10+5=" + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10-5=" + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10*5=" + context.executeStrategy(10, 5));
    }
}
