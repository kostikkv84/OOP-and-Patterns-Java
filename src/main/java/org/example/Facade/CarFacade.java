package org.example.Facade;

public class CarFacade {
    private Door door = new Door();
    private StartEngine engine = new StartEngine();
    private Wheels wheels = new Wheels();

    public void go(){
        door.openDoor();
        engine.engineStarted();
        wheels.wheelsRotates();
    }

}
