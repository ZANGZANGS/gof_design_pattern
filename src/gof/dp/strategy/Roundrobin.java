package gof.dp.strategy;

public class Roundrobin implements Scheduler{
    @Override
    public void getNextCall() {
        System.out.println("순서대로 작업을 호출한다.");
    }

    @Override
    public void sendCallAgent() {
        System.out.println("상담원들에게 순차적으로 돌아가며 콜한다.");
    }
}
