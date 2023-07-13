package org.example;

public class Singleton2 {

    private static final Singleton2 instance = new Singleton2();

    public static Singleton2 getInstance() {
        return instance;
    }

    public Singleton2() {
    }

    public void print(){
        System.out.println("This is singleton2 !");
    }
}
