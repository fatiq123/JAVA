package Basics;

public class Functions {
    public static void main(String[] args) {
        simpleFunction();

        isEven(3);

        int result = addTwoNum(2,4);
        System.out.println(result);

    }

    static void simpleFunction() {
        System.out.println("Hy, I am Simple Function");
    }

    static void isEven(int num) {
        if (num % 2 == 0) {
            System.out.println("even");
        }
        System.out.println("odd");
    }

    static int addTwoNum(int a, int b) {
        return a+b;
    }




}
