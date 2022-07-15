package Struct_Mode.Facade;

/**
 * @class: ShapeMaker
 * @description:
 * @author: dudg
 * @create: 2022-07-15 13:53
 */
public class ShapeMaker {

    private Shape circle;
    private Shape rectangle;

    public ShapeMaker() {
        this.circle = new Circle();
        this.rectangle = new Rectangle();
    }


    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }
}
