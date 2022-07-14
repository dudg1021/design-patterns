package Struct_Mode.Bridge;

/**
 * @class: Shape
 * @description:
 * @author: dudg
 * @create: 2022-07-14 17:56
 */
public abstract class Shape {

    protected DrawApi drawApi;

    public Shape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }

    public abstract void draw();
}
