package Behavior_Mode.Chain;

/**
 * @class: FileLogger
 * @description:
 * @author: dudg
 * @create: 2022-07-19 16:41
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error:: Logger: " + message);
    }
}
