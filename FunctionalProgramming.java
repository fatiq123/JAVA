import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionalProgramming {

    public static void main(String[] args) {

        // forEach
        Arrays.asList(1, 2, 3)
                .forEach(System.out::println); // Consumer
        // print output -> 1 2 3
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5);
        
        
        // map
        List<Integer> square = numbers.stream()
                .map(x -> x * x) // Function
                .sorted()
                .limit(2)
                .collect(Collectors.toList());
        // print output -> [4, 9]
        List<String> names = Arrays.asList("Sally", "Harry", "Sephora");
        
        
        // filter
        List<String> result = names.stream()
                .filter(s -> s.startsWith("S")) // Predicate
                .collect(Collectors.toList());
        // print output -> [Sally, Sephora]
        
        
        // sorted
        List<String> sortedNames = names.stream()
                .sorted()
                .collect(Collectors.toList());
        // print output -> [Harry, Sally, Sephora]
        
        
        // reduce
        int even = numbers.stream()
                .filter(x -> x % 2 == 0) // Predicate
                .reduce(4, Integer::sum); // BinaryOperator which extends BiFunction
        // print output -> 10
        
        
        // max
        int maxN = numbers.stream()
                .max(Integer::compare).get(); // Comparator
        // print output -> 5
        
        
        // min
        int minN = numbers.stream()
                .min(Integer::compare).get(); // Comparator
        // print output -> 2
        
        
        // skip
        List<Integer> skipped = numbers.stream().skip(1).collect(Collectors.toList());
        // print output -> [3,4,5]



        Predicate<Integer> isEven = num -> num%2==0;
        Predicate<String> isEmpty = String::isEmpty;

        System.out.println(isEven.test(2));

        List<Integer> integers = Arrays.asList(1,2,3,4,5);
        integers.stream().filter(isEven).collect(Collectors.toList());
        integers.forEach(s -> System.out.println(s));

        String name = "A";

        Optional<String> nullCheck = Optional.ofNullable(name);
        if (nullCheck.isPresent()) {
                System.out.println(name);
        } else {
                System.out.println("null");
        }



        // Consumer Interface
        //Consumer<String> input = s -> System.out.println("Input is : " + s);

        List<String> words = Arrays.asList("java", "c++", "python", "kotlin");
        words.stream()
                .map(String::toUpperCase)
                .filter(word -> word.length() > 4)
                .collect(Collectors.toList());

                words.stream()
                .map(s -> s.toUpperCase())
                .filter(word -> word.length() > 4)
                .collect(Collectors.toList());

        System.out.println(words);
    }

}