package Singleton;

public class SingleObject6 {
    private static class SingleHolder{
        private static final SingleObject6 instance = new SingleObject6();
    }

    private SingleObject6(){}

    public static final SingleObject6 getInstance(){
        return SingleHolder.instance;
    }
}
