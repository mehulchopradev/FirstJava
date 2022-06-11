import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ListOperations {

    public static void main(String[] args) {
        // Java 8
        // Stream API

        // source data
        List<Integer> nos = Arrays.asList(4, 1, 6, 7, 9, 10, 3, 5, 1, 7, 9);
        Stream<Integer> stream = nos.stream();

        // create a new list consisting of odd numbers more than 3 from the nos list
        // print the new list
        // Intermediate operation in a stream
        List<Integer> odds = stream
                .filter(element -> element % 2 != 0 && element > 3)
                .collect(Collectors.toList()); // collect ---> Terminal operation
        System.out.println(odds);

        // create a String of elements separate by comma, consisting of even numbers more than 2 from the nos list
        String s = nos.stream()
                .filter(element -> element % 2 == 0 && element > 2)
                .map(element -> element.toString())
                .collect(Collectors.joining(","));
        System.out.println(s);

        // create a new list consisting of
            // elements more than 4 from the nos list
            // squared up each of the elements
            // sorted in the descending order
        // filter -> map -> sort -> collect
        List<Integer> nn = nos.stream()
                .filter(element -> element > 4)
                .distinct()
                .map(element -> element * element)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(nn);

        // source data
        int[] n = {6, 4, 5, 9, 10, 3, 4, 8};
        // Stream<Integer> iStream = Arrays.stream(n);
        IntStream intStream =  Arrays.stream(n); // stream of integer values

        // build up Stream from specific values
        Stream<Integer> st = Stream.of(5, 4, 8, 9, 2, 5);

        // empty stream
        Stream stream1 = Stream.empty();
    }
}
