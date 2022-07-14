package Struct_Mode.Bridge;

/**
 * @class: Circle
 * @description:
 * @author: dudg
 * @create: 2022-07-14 17:57
 */
public class Circle extends Shape {

    private int radius;

    public Circle(DrawApi drawApi, int radius) {
        super(drawApi);
        this.radius = radius;
    }

    public void draw() {
        drawApi.draw(radius, 0, 0);
    }
}
