package org.example;

import org.example.Facade.CarFacade;
import org.example.FactoryMethod.Car;
import org.example.FactoryMethod.CarSelector;
import org.example.FactoryMethod.Jeep;
import org.example.FactoryMethod.RoadType;

import java.lang.reflect.GenericArrayType;

public class Main {
    public static void main(String[] args) {

        //Пример паттерна Builder
        System.out.println(Builder.builderString("This", " is ", "builder!"));
//------------ Singleton --------------------------------------
        /**
         *   Пример петтерна Singleton
         *   Вызов методов происходит через getInstance - создающий экземпляр класса.
         */
        Singleton.getInstanсe().print();
        /**
         *   Пример петтерна Singleton - проще
        *   Вызов методов происходит через getInstance - создающий экземпляр класса.
        */
        Singleton2.getInstance().print();

//------------ Factory Method ---------------------------------
        // Создадим машину Octavia - через фабрику
        CarSelector selector = new CarSelector();
        Car skodaOctavia = selector.getCar(RoadType.City);
        skodaOctavia.drive();
        // СОздадим Porsche - через фабрику
        Car porsche = selector.getCar(RoadType.Track);
        porsche.stop();
        // Можно объединить с Singleton, если сделать для Car privat, конструктор и т.д.

//------------ Facade -----------------------------------------
        // реализация спрятана от пользователя - за фасадом
        CarFacade drive = new CarFacade();
        drive.go();

//-------------

    }
}