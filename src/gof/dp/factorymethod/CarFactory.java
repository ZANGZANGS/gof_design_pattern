package gof.dp.factorymethod;

public abstract class CarFactory {
    public abstract Car createCar(String name);
    public abstract Car fixedCar(String owner);
}
