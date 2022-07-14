package Creation_Mode.SimpleFactory;

public class Main {

    /**
     * 简单工厂， 创建同一类型对象， 每次新增对象需要修改工厂类 违反开闭原则
     * @param args
     */
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();
    }
}
