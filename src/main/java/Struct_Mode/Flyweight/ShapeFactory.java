package Struct_Mode.Flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @class: ShapeFactory
 * @description:
 * @author: dudg
 * @create: 2022-07-15 17:11
 */
public class ShapeFactory {

    public static final Map<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }

}
