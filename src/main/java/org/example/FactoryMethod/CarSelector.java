package org.example.FactoryMethod;

/**
 * Фабрика по созданию автомобилей
 */
public class CarSelector {
    /**
     * Фабричный метод - который создает нужный автомобиль
     */
    public Car getCar(RoadType roadType){
        Car car = null;
        switch (roadType){
            case City:
                car = new Octavia();
                break;
            case Offroad:
                car = new Jeep();
                break;
            case Track:
                car = new Porsche();
                break;
        }

        return car;
    }


}
