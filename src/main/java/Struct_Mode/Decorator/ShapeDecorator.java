package Struct_Mode.Decorator;

/**
 * @class: ShapeDecorator
 * @description: 抽象装饰类
 * @author: dudg
 * @create: 2022-07-14 18:40
 */
public abstract class ShapeDecorator implements Shape{

    protected Shape decoratorShape;

    public ShapeDecorator(Shape decoratorShape) {
        this.decoratorShape = decoratorShape;
    }

    @Override
    public void draw() {
        decoratorShape.draw();
    }
}
