package org.example.FactoryMethod;

/**
 * Имплементирующий класс обязательно должен реализовать все методы класса Car
 */
public class Jeep implements Car{


    @Override
    public void drive(){
        System.out.println("Jeep can drive at 150mph");
    }

    @Override
    public void stop() {
        System.out.println("Jeep can stop at 50 meters from 150mph");
    }


}
