package Struct_Mode.Decorator;

/**
 * @class: Main
 * @description:
 * @author: dudg
 * @create: 2022-07-14 18:44
 */
public class Main {

    /**
     * 装饰器模式：创建一个装饰类，动态给包装类增加新功能不改变其结构，解决继承子类膨胀等问题。
     * @param args
     */
    public static void main(String[] args) {

        Circle circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
