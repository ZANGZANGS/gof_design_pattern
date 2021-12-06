package gof.dp.strategy;

public class Priority implements Scheduler{
    @Override
    public void getNextCall() {
        System.out.println("가장 우선순위가 높은 작업을 호출한다.");
    }

    @Override
    public void sendCallAgent() {
        System.out.println("현상담 우선순위가 높은 상담원에게 콜한다.");
    }
}
