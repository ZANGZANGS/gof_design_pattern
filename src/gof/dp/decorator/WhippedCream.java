package gof.dp.decorator;

public class WhippedCream extends Decorator{
    public WhippedCream(Coffee coffee) {
        super(coffee);
    }

    public void brewing(){
        super.brewing();
        System.out.println("Add WhippedCream");
    }
}
