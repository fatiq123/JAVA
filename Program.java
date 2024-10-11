import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {

        // Program p = new Program();
        // p.sum(0, 5);

        // List in Java
        List<String> animals = new ArrayList<>();
        animals.add("Lion");
        animals.add("Zebra");
        animals.add("Bufallo");
        animals.add("Monkey");
        animals.add("kangaroo");

        animals.set(0, null);

        // System.out.println(animals.size());
        // for (int i=0; i< animals.size()-1; i++) {
        // String newAnimals = animals.get(i);
        // System.out.println(newAnimals);
        // }

        for (String string : animals) {
            // System.out.println(string);
        }

        animals.forEach(animal -> System.out.println(animal));
        // List<String> animalsStartWithNameA = animals.stream()
        // .filter(a -> a.startsWith("A"))
        // .close();

        // System.out.println(animals);

        List<Product> products = new ArrayList<>();
        products.add(new Product(0, "coffee", 15.0f));
        products.add(new Product(1, "tea", 10.0f));
        products.add(new Product(2, "milk", 5.0f));
        products.add(new Product(3, "sugar", 2.0f));
        products.add(new Product(4, "Biscuits", 20));

        List<Float> product = products.stream()
        .filter(p -> p.price > 5.0f && p.name.startsWith("B"))
        .map(p -> p.price)
        .collect(Collectors.toList());

        System.out.println(product);

        var lambda = () -> {
            System.out.println("Hello Lambda function");
        };

    }

    void sum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println(sum);
    }
}
