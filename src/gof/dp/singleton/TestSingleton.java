package gof.dp.singleton;

public class TestSingleton {

    public static void main(String[] args){
        ConnectionPool instance1 = ConnectionPool.getInstance();
        ConnectionPool instance2 = ConnectionPool.getInstance();

        System.out.println(instance1 == instance2);

    }
}