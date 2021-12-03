package gof.dp.templatemethod;

public class SwordsEmperorClass extends PlayerClass {
    @Override
    public void dash() {
        System.out.println("쇄혼비무! 공격하며 접근합니다.");
    }

    @Override
    public void hit() {
        System.out.println("초혼비무! 적을 끌어당겨 공격합니다.");
    }

    @Override
    public void specialMove() {
        System.out.println("포효검황! 뿡! 필살기로 공격합니다.");
    }

    @Override
    public void showClass() {
        System.out.println("<<<<< 제 직업은 검황입니다. >>>>>");
    }

    @Override
    public void hiddenSkill() {
        System.out.println("히든 스킬 발동! 적을 도발합니다!");
    }
}
