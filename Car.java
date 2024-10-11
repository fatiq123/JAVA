public class Car implements Engine {

    @Override
    public void start() {
        System.out.println("Car started working...");
    }

    @Override
    public void defaultMethod(int num1, int num2) {
        Engine.super.defaultMethod(num1, num2);
    }
    

    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        System.out.println("\n");
        car.defaultMethod(1, 3);
        Engine.staticMethod();
    }
}
