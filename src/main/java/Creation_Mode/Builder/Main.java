package Creation_Mode.Builder;

/**
 * @class: Main
 * @description:
 * @author: dudg
 * @create: 2020-08-12 16:45
 */
public class Main {

    /**
     * 建造者模式：所有属性设置通过builder， 然后通过builder.build()将属性复制到对象
     * 链式写法核心return this，
     * 简单用法： lombox  @Builder注解
     * @param args
     */
    public static void main(String[] args) {

        Computer computer = new Computer.Builder("Inter", "kingston")
                .setDisplay("great wall")
                .setKeyBoard("dell")
                .setUsbCount(4)
                .builder();

        System.out.println(computer.toString());
    }
}
