package Struct_Mode.Adapter;

/**
 * @class: ObjectAdaptor
 * @description: 对象适配器，  适配对象
 * @author: dudg
 * @create: 2022-07-14 11:46
 */
public class ObjectAdaptor implements ITarget{

    private Adaptee adaptee;

    public ObjectAdaptor(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void f1() {
        adaptee.fa();
    }

    @Override
    public void f2() {
        adaptee.fb();
    }

    @Override
    public void fc() {
        adaptee.fc();
    }
}
