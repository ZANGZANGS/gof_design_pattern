package gof.dp.state;

public class SwordsManClass extends PlayerClass {
    @Override
    public void dash() {
        System.out.println("달려서 접근합니다.");
    }

    @Override
    public void hit() {
        System.out.println("백호참! 일반 공격합니다.");
    }

    @Override
    public void specialMove() {
        double rate = Math.random()*100;
        if(rate < 10) System.out.println("체력이 부족합니다.");
        else System.out.println("백건! 필살기로 공격합니다.");
    }

    @Override
    public void showClass() {
        System.out.println("<<<<< 제 직업은 검객입니다. >>>>>");
    }

    @Override
    public void hiddenSkill() {
        System.out.println("히든스킬이 없습니다.");
    }
}
