public class EvenOdd {

    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        var n = 13;
        /* if(isEven(n)) {
            System.out.println("It is even");
        } else {
            System.out.println("It is odd");
        } */

        System.out.println(isEven(n) ? "It is even" : "It is odd");
    }
}
