package org.example.FactoryMethod;

public class Porsche implements Car{
    @Override
    public void drive() {
        System.out.println("Skoda can drive at 300km/h");
    }

    @Override
    public void stop() {
        System.out.println("Skoda can stop at 30 meters from 300km/h");
    }
}
