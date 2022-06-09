import java.util.Random;

public class RandomArray {

    // Generic methods
    static <T extends Number> T randomElement(T[] elements) {
        Random random = new Random();
        int index = random.nextInt(elements.length);
        return elements[index];
    }

    public static void main(String[] args) {
        /* String[] cars = {"Porshe", "Mercedes", "Bmw"};
        String element = randomElement(cars);
        System.out.println(element); */

        Integer[] nos = {10, 5, 4, 3, 8, 9, 1, 2};
        int n = randomElement(nos);
        System.out.println(n);

        Double[] d = {10.0, 5.0, 4.0, 3.0, 8.0};
        double dd = randomElement(d);
        System.out.println(dd);
    }
}
