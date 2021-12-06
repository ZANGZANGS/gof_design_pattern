package gof.dp.strategy;

public class LeastJob implements Scheduler{
    @Override
    public void getNextCall() {
        System.out.println("가장 짧은 작업을 호출한다.");
    }

    @Override
    public void sendCallAgent() {
        System.out.println("현재 상담업무가 없거나 상담대기가 가장 작은 상담원에게 콜한다.");
    }
}
