import java.util.ArrayList;
import java.util.Comparator;

public class PlayArrayListAgain {

    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(10);
        marks.add(1);
        marks.add(9);
        marks.add(8);
        marks.add(12);
        marks.add(14);

        // inner class
        /* class DescendingComparator2 implements Comparator<Integer> {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        }

        // sort the element of the arraylist in descending order
        marks.sort(new DescendingComparator2()); */

        // annonymous inner class
        /* marks.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        }); */











        // Lambda expressions
        marks.sort((o1, o2) -> o2.compareTo(o1));


        System.out.println(marks);
    }
}
