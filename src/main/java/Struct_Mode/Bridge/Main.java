package Struct_Mode.Bridge;

/**
 * @class: Main
 * @description:
 * @author: dudg
 * @create: 2022-07-14 18:02
 */
public class Main {

    /**
     * 桥梁模式：将抽象和实现隔离，实现隔离易扩展
     * @param args
     */
    public static void main(String[] args) {

        Circle circle = new Circle(new RedPen(), 5);
        circle.draw();

        Rectangle rectangle = new Rectangle(new BluePen(), 5, 2);
        rectangle.draw();
    }
}
