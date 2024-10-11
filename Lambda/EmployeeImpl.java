package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EmployeeImpl implements Employee {

    @Override
    public String getName() {
        return "Fatiq Hussnain";
    }


    public static void main(String[] args) {
        Employee employee = new EmployeeImpl();
        String name = employee.getName();
        System.out.println(name);


        char data[] = {'a', 'b', 'c'};
        String str = new String(data);
        System.out.println(str);

        String notchange  ="notchange".substring(0, 5);
        System.out.println(notchange);

        String i = "i";
        i = "j";
        StringBuffer sb = new StringBuffer();
        sb.append("a");
        
        StringBuilder s = new StringBuilder();

        

        List<String> list = List.of("a", "b", "c");
        //list.forEach(System.out::println);

        List<String> names = new ArrayList<>();
        names.add("Fatiq");
        names.add("Hussnain");

        Stream<String> stream = names.stream();
        //long count = stream.count();
        Stream<String> distinct = stream.distinct();
        //System.out.println(count);
        System.out.println(distinct);




        String[] n = {"a", "b", "c"};
        Stream<String> stream2 = Arrays.stream(n);
        System.out.println(stream2);

    }


    
}
