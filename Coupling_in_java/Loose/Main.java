package Coupling_in_java.Loose;

public class Main {
    public static void main(String[] args) {

        // This is java style of Doing thing "Engine petrolEngine = new PetrolEngine();"
        // Left side is interface Right side we ar making object of class
        // Now after making object of Desired Engine. Pass it to Car Constructor which then analyze the passed object and do call the desired function...

        // Note: the thing here is that we have flexibilty to make object of any Engine Class and pass directly it to Car constructor which then do further steps.
        
        // For Example: In near future if there is any new Engine then we can easily creates the object of it and pass it to Car leading to -> LOOSE COUPLING.


        Engine petrolEngine = new PetrolEngine();
        Car petrolCar = new Car(petrolEngine);
        petrolCar.drive();

        Engine electricEngine = new DieselEngine();
        Car electricCar = new Car(electricEngine);
        electricCar.drive();
    }
}
