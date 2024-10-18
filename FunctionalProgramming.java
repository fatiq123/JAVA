import java.util.Arrays;
import java.util.List;
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

    }

}