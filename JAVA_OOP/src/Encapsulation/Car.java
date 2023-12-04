package Encapsulation;

public class Car {

    String model;
    int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void start() {
        System.out.println("The car is starting");
    }


    public static void main(String[] args) {
        // Creating an object of class
        Car c = new Car("Bentle", 2023);
        c.start();
    }


}

