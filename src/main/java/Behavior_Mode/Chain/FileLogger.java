package Behavior_Mode.Chain;

/**
 * @class: FileLogger
 * @description:
 * @author: dudg
 * @create: 2022-07-19 16:41
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File:: Logger: " + message);
    }
}
