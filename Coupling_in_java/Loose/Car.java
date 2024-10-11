package Coupling_in_java.Loose;

public class Car {

    // declaring interface object.
    Engine engine;

    // making constructor and passing paramter of type Engine so that any type of Engine and can send
    public Car(Engine engine) {
        this.engine = engine;
    }

    void drive() {
        engine.start();
        System.out.println("Car is moving");
    }
}
