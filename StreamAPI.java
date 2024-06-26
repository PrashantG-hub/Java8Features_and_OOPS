import java.util.*;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c", "d");

        // FILTER
        List<String> filteredList = list.stream()
                .filter(s -> !s.equals("b"))
                .collect(Collectors.toList());
        System.out.println(filteredList);           // -- [a, c, d]

        // MAP
        List<String> mappedList = list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(mappedList);            // [A, B, C, D]
        // SORTED
        List<String> sortedList = list.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedList);            // [a, b, c, d]

        // REDUCE
        Optional<String> ReducedList = (list.stream().reduce((firstElement, secondElement)-> firstElement + secondElement));
        System.out.println( ReducedList);



    }
}
