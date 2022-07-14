package Struct_Mode.Adapter;


/**
 * @class: Main
 * @description:
 * @author: dudg
 * @create: 2020-08-13 11:48
 */
public class Main extends InterfaceAdaptor {


    /**
     * 类适配器：适配器通过继承适配者类，实现目标接口，完成适配者调用目标接口的转换。
     * 对象适配器：持有适配者类的实例调用目标接口。
     * 接口适配器：适配器作为抽象类，实现目标接口，调用类直接继承适配器重写需要使用的接口即可。
     * @param args
     */
    public static void main(String[] args) {


        // 类适配器
        ClassAdaptor classAdaptor = new ClassAdaptor();
        classAdaptor.f1();

        // 对象适配器
        ObjectAdaptor objectAdaptor = new ObjectAdaptor(new Adaptee());
        objectAdaptor.f2();

        // 接口适配器 调用类继承适配接口
        Main main = new Main();
        main.fc();
    }


    @Override
    public void fc() {
        System.out.println("invoke-local-fc()");
    }
}
