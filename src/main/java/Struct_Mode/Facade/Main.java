package Struct_Mode.Facade;

/**
 * @class: Main
 * @description:
 * @author: dudg
 * @create: 2022-07-15 13:52
 */
public class Main {

    /**
     * 外观模式   为一组接口提供一个门面接口 简化系统之间调用
     * @param args
     */
    public static void main(String[] args) {

        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
    }
}
