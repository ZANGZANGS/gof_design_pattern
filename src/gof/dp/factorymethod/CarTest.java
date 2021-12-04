package gof.dp.factorymethod;

public class CarTest {
    public static void main(String[] args){
        CarFactory carFactory = new HyunKiFactory();
        Car newCar = carFactory.createCar("sorento");

        System.out.println(newCar);

        Car myCar = carFactory.fixedCar("zangzangs");
        System.out.println(myCar);
    }
}
