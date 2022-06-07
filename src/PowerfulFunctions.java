public class PowerfulFunctions {

    // 0 to n arguments
    static int nextGenAdd(int... nos) { // variance
        int sum = 0;
        for (int i = 0; i < nos.length; i++) {
            sum += nos[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(nextGenAdd());
        System.out.println(nextGenAdd(5));
        System.out.println(nextGenAdd(5, 6, 4));
        System.out.println(nextGenAdd(5, 6, 4, 10, 4, 3, 1, 8, 9));
    }
}
