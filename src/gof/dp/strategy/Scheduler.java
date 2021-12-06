package gof.dp.strategy;

public interface Scheduler {
    public void getNextCall();
    public void sendCallAgent();
}
