package Creation_Mode.Singleton;

public class SingleObject3 {

    private static SingleObject3 instance;
    private SingleObject3(){}

    public static synchronized SingleObject3 getInstance(){
        if (instance == null) {
            instance = new SingleObject3();
        }

        return instance;
    }
}
