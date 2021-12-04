package gof.dp.factorymethod;

import java.util.HashMap;

public class HyunKiFactory extends CarFactory{

    HashMap<String, Car> carMap = new HashMap<>();//owner, car

    @Override
    public Car createCar(String name) {

        Car car = null;

        if("avante".equals(name)){
            car = new Avante();
        }else if("sorento".equals(name)){
            car = new Sorento();
        }

        return car;
    }

    @Override
    public Car fixedCar(String owner) {

        Car myCar = carMap.get(owner);

        if(null == myCar){
            if (owner.equals("zangzangs")){
                myCar = new Avante();
            }
        }
        return myCar;
    }
}
