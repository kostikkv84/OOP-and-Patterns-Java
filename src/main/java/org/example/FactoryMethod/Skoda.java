package org.example.FactoryMethod;

public class Skoda implements Car{


    @Override
    public void drive() {
        System.out.println("Skoda can drive at 180km/h");
    }

    @Override
    public void stop() {
        System.out.println("Skoda can stop at 70 meters from 180km/h");
    }
}
