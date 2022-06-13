import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MathSeries {

    public static String fibo(int n) {
        List<Integer> nos = new ArrayList<>();
        int a = 0;
        int b = 1;
        nos.add(a);
        nos.add(b);

        int i = 2;
        while (i < n) {
            int c = a + b;
            nos.add(c);
            a = b;
            b = c;
            i++;
        }

        return nos
                .stream()
                .map(no -> no.toString())
                .collect(Collectors.joining(","));
    }
}
