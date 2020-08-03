package Singleton;

public class SingleObject4 {
    private static SingleObject4 instance = new SingleObject4();
    private SingleObject4(){}

    public static synchronized SingleObject4 getInstance(){
        return instance;
    }
}
