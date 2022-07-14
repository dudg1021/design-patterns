package Struct_Mode.Decorator;

/**
 * @class: RedShapeDecorator
 * @description: 实体装饰类
 * @author: dudg
 * @create: 2022-07-14 18:42
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void draw() {
        decoratorShape.draw();

        setRedBorder(decoratorShape);
    }

    private void setRedBorder(Shape decoratorShape) {
        System.out.println("Border Color: Red");
    }
}
