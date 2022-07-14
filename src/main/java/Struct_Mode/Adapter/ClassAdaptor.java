package Struct_Mode.Adapter;

/**
 * @class: Adaptor
 * @description: 类适配器，类继承
 * @author: dudg
 * @create: 2022-07-14 11:23
 */
public class ClassAdaptor extends Adaptee implements ITarget{

    @Override
    public void f1() {
        super.fa();
    }

    @Override
    public void f2() {
        super.fb();
    }

}
