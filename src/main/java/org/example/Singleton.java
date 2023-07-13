package org.example;

public class Singleton {

    //создаем переменную класса
    public static Singleton instanсe;

    /**
     * СОздаем метод - Getter, если переменная instance == null, то возвращаем экземпляр класса Singleton.
     * synchronized - если нужен запуск в нескольких потоках. Будет один и тот же экземпляр использоваться
     * @return
     */
    public static synchronized Singleton getInstanсe() {
        if (instanсe == null) {
            instanсe = new Singleton();
        }
        return instanсe;
    }
    //Должен быть пустой конструктор класса с Private, иначе можно будет создавать много объектов класса
    private Singleton() {
    }

    public void print(){
        System.out.println("Пример применение паттерна Singleton!");
    }

}
