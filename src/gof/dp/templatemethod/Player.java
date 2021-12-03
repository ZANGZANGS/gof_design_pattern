package gof.dp.templatemethod;

public class Player {

    private PlayerClass playerClass;

    public Player(){
        playerClass = new WarriorClass();
        playerClass.showClass();
    }

    public PlayerClass getPlayerClass(){
        return playerClass;
    }

    public void upgradeClass(PlayerClass level){
        this.playerClass = level;
        playerClass.showClass();
    }

    public void play(int count){
        playerClass.act(count);
    }
}
