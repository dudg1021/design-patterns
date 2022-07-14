package Creation_Mode.Singleton;

public class SingleObject2 {

    private static SingleObject2 instance;
    private SingleObject2(){}

    public static SingleObject2 getInstance(){
        if (instance == null) {
            instance = new SingleObject2();
        }

        return instance;
    }
}
