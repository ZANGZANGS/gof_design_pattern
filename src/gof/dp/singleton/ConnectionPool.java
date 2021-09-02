package gof.dp.singleton;

public class ConnectionPool {

    private static ConnectionPool instance = new ConnectionPool();

    //생성자의 접근제어자를 private로
    private ConnectionPool(){}

    //외부에서 접근 가능한 static 메서드 생성
    public static ConnectionPool getInstance(){
        if(null == instance){
            instance = new ConnectionPool();
        }
        return instance;
    }
}
