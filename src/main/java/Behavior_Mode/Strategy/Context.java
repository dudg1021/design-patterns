package Behavior_Mode.Strategy;

/**
 * @class: Context
 * @description:
 * @author: dudg
 * @create: 2022-07-15 18:38
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
