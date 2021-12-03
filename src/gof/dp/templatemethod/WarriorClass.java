package gof.dp.templatemethod;

public class WarriorClass extends PlayerClass {

    @Override
    public void dash() {
        System.out.println("뚜벅 뚜벅 접근합니다.");
    }

    @Override
    public void hit() {
        System.out.println("건곤대나잇~! 일반 공격합니다.");
    }

    @Override
    public void specialMove() {
        double rate = Math.random()*100;
        if(rate < 30) System.out.println("허공난무~! 흐미~실패닷");
        else System.out.println("동귀어진! 필살기로 공격합니다.");
    }

    @Override
    public void showClass() {
        System.out.println("<<<<< 제 직업은 전사입니다. >>>>>");
    }
}
