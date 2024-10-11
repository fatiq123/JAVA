@FunctionalInterface
public interface Engine {
    void start();
    public static void staticMethod() {
        System.out.println("static method");
    }
    default void defaultMethod(int num1, int num2) {
        int product = num1 * num2;
        System.out.println("product: " + product + " default method");
    }

    int KEY = 0;
}
