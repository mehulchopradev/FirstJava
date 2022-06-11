import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class AdvancedArrayList {

    public static void main(String[] args) {
        List<Integer> nos = Arrays.asList(4, 1, 6, 7, 9, 10, 3, 5, 1, 7, 9);
        System.out.println(nos);
        System.out.println(nos.getClass());

        LinkedList<Integer> l = new LinkedList<>(nos);
        System.out.println(l);

        System.out.println("********** all numbers *************");
        // to print all the number from the nos list without explicitly using a loop
        nos.forEach(n -> System.out.println(n));

        System.out.println("********** even numbers ***************");
        // to print all the even numbers from the nos list without explicitly using a loop
        nos.forEach(n -> {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        });

        // Method references
        System.out.println("********** all numbers (method references) *************");
        // to print all the number from the nos list without explicitly using a loop
        nos.forEach(System.out::println);
    }
}
