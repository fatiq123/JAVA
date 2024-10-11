package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Lambda expression
        Employee employee = () -> {
            return "Fatiq Hussnain";
        };
        System.out.println(employee);


        String i = "i";
        i  ="j";
        System.out.println(i);

        StringBuffer sb = new StringBuffer("Hello");
        sb.append("World");
        System.out.println(sb);


        String[] s = {"a", "b", "c"};
        Integer[] in = {1,2,3};

        printArray(s);
        printArray(in);

        List<String> listOfStrings = new ArrayList<>();
        printList(listOfStrings);

        List<String> listOfIntegers = new ArrayList<>();
        printList(listOfIntegers);

        List<Number> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(1.0);
        printNumbers(numbers);

        List<Integer> integers = Arrays.asList(1,2,3);
        printNumbers(integers);

        List<Float> floats = Arrays.asList(1.0f,2f,3.0f);
        printNumbers(floats);

    }


    public static <T> void printArray(T[] array) {
        for (T elements : array) {
            System.out.println(elements);
        }
    }

    public static void printList(List<?> list) {
        for (Object object : list) {
            System.out.println(object);
        }
    }


    static void printNumbers(List<? extends Number> numbers) {
        for (Number number : numbers) {
            System.err.println(number);
        }
    }
}
