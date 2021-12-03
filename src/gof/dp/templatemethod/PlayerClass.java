package gof.dp.templatemethod;

public abstract class PlayerClass {

    public abstract void dash();
    public abstract void hit();
    public abstract void specialMove();
    public abstract void showClass();


    final public void act(int count){
        dash();
        for (int i = 0; i < count; i++) {
            hit();
        }
        specialMove();
        hiddenSkill();
    }

    public void hiddenSkill(){};  //오퍼레이션 훅
}
