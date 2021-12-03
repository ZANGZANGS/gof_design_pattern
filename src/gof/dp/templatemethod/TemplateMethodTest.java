package gof.dp.templatemethod;

public class TemplateMethodTest {

    public static void main(String[] args){
        Player player = new Player();
        player.play(1);

        player.upgradeClass(new SwordsManClass());
        player.play(2);

        player.upgradeClass(new SwordKingClass());
        player.play(3);

        player.upgradeClass(new SwordsEmperorClass());
        player.play(4);
    }




}
