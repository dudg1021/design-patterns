package Creation_Mode.AbstractFactory;

public class Main {

    /**
     * 抽象工厂模式：对工厂方法模式进一步延伸，创建一组对象（产品族）
     * 解决工厂方法模式分类比较多导致工厂多的问题，
     * @param args
     */
    public static void main(String[] args) {

        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        //获取形状为 Rectangle 的对象
        Shape shape1 = shapeFactory.getShape("RECTANGLE");

        //调用 Rectangle 的 draw 方法
        shape1.draw();

        //获取形状为 Square 的对象
        Shape shape2 = shapeFactory.getShape("SQUARE");

        //调用 Square 的 draw 方法
        shape2.draw();


        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        //获取颜色为 Red 的对象
        Color color1 = colorFactory.getColor("RED");

        //调用 Red 的 fill 方法
        color1.fill();

        //获取颜色为 Green 的对象
        Color color2 = colorFactory.getColor("Green");

        //调用 Green 的 fill 方法
        color2.fill();
    }
}
