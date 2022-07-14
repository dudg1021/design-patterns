package Creation_Mode.Singleton;

public class Main {
    public static void main(String[] args) {
        SingleObject1 instance = SingleObject1.getInstance();
        instance.showMessage();

        SingleEnum7.INSTANCE.method01();
    }
}
