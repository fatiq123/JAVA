package Coupling_in_java.Tight;

public class Car {

    DieselEngine dieselEngine;

    // when car class is called it invokes the constructor and makes an object of DieselEngine
    public Car() {
        // Tight couple directly creates object of desired class
        dieselEngine = new DieselEngine(); 
    }

    void move() {
        System.out.println("Car moves with...");
        dieselEngine.start();
    }
}
