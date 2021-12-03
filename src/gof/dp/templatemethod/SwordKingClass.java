package gof.dp.templatemethod;

public class SwordKingClass extends PlayerClass{
    @Override
    public void dash() {
        System.out.println("번쩍 접근합니다.");
    }

    @Override
    public void hit() {
        System.out.println("어검술! 일반 공격합니다.");
    }

    @Override
    public void specialMove() {
        System.out.println("진백호령! 필살기로 공격합니다.");
    }

    @Override
    public void showClass() {
        System.out.println("<<<<< 제 직업은 검제입니다. >>>>>");
    }
}
