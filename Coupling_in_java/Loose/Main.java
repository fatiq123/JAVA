package Coupling_in_java.Loose;

public class Main {
    public static void main(String[] args) {
        Engine petrolEngine = new PetrolEngine();
        Car petrolCar = new Car(petrolEngine);
        petrolCar.drive();

        Engine electricEngine = new DieselEngine();
        Car electricCar = new Car(electricEngine);
        electricCar.drive();
    }
}
