import java.util.ArrayList;

public class PlayArrayList {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();

        cars.add("i10");
        cars.add("i20");

        System.out.println(cars); // i10, i20

        cars.add(1, "Porshe");
        System.out.println(cars); // i10, Porshe, i20

        for(String car : cars) {
            System.out.println(car);
        }

        System.out.println(cars.contains("i20"));
        System.out.println(cars.contains("Mercedes"));

        System.out.println(cars.indexOf("Porshe")); // 1
        System.out.println(cars.indexOf("Mercedes")); // -1

        System.out.println(cars.size()); // 3

        System.out.println(cars.remove(0));
        System.out.println(cars); // i20, Porshe

        cars.remove("Porshe");
        System.out.println(cars); // i20

        cars.set(0, "i10");
        System.out.println(cars);
    }
}
