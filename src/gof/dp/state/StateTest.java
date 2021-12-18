package gof.dp.state;

import java.util.ArrayList;

public class StateTest {

    public static void main(String[] args){

        ArrayList<PlayerClass> list = new ArrayList<>();
        list.add(new WarriorClass());
        list.add(new SwordsManClass());
        list.add(new SwordKingClass());
        list.add(new SwordsEmperorClass());

        PlayerClass playerClass;

        for (PlayerClass pClass: list) {
            System.out.println("\n### state 변경 ###");
            playerClass = pClass; //직업 Class의 state를 변경

            playerClass.showClass();
            playerClass.dash();
            playerClass.hit();
            playerClass.specialMove();
            playerClass.hiddenSkill();
        }

    }

}
