package Struct_Mode.Flyweight;

import java.util.Random;

/**
 * @class: Main
 * @description:
 * @author: dudg
 * @create: 2022-07-15 17:15
 */
public class Main {

    public static final String[] colors = {"Red", "Green", "Blue", "White", "Black"};

    /**
     * 享元模式：减少创建对象的数量，减少内存占用提高性能。
     * @param args
     */
    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandColor());
            circle.setX(getRandom());
            circle.setY(getRandom());
            circle.setRadius(getRandom());
            circle.draw();

            System.out.println();
        }

    }

    public static String getRandColor(){
        return colors[(int) (Math.random() * colors.length)];
    }

    public static int getRandom() {
        return (int) (Math.random() * 100);
    }
}
