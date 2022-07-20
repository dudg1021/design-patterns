package Behavior_Mode.Chain;

/**
 * @class: ConsoleLogger
 * @description:
 * @author: dudg
 * @create: 2022-07-19 16:38
 */
public class ConsoleLogger extends AbstractLogger {


    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console:: Logger: " + message);
    }
}
