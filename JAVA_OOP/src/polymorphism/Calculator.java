package polymorphism;

public class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println(c.add(1,2));
        System.out.println(c.add(1,2.0));
    }
}


