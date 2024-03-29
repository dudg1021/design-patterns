package Creation_Mode.Singleton;

public class SingleObject5 {
    // volatile 防止指令重排序
    private volatile static SingleObject5 instance;
    private SingleObject5(){}

    public static SingleObject5 getInstance(){
        if (instance == null) {
            synchronized (SingleObject5.class){
                instance = new SingleObject5();
            }
        }
        return instance;
    }
}
