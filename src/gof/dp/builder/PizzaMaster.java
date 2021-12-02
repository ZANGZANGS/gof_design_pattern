package gof.dp.builder;

public class PizzaMaster {

    public static void main(String[] args){
        Pizza newYorkPizza = new NewYorkPizza.Builder(NewYorkPizza.Size.LARGE)
//                .sauceInside()
                .addTopping(Pizza.Topping.HAM)
                .addTopping(Pizza.Topping.ONION)
                .build();

        Pizza ChicagoPizza = new ChicagoPizza.Builder()
                .sauceInside()
                .addTopping(Pizza.Topping.MUSHROOM)
                .addTopping(Pizza.Topping.SAUSAGE)
                .addTopping(Pizza.Topping.PEPPER)
                .build();

        System.out.println(newYorkPizza);
        System.out.println(ChicagoPizza);
    }
}
