public class EvenSeries {

    static String evenSeries(int n) {
        int i = 0;
        String result = "";
        while (i <= n) {
            if (i % 2 == 0) {
                result = result + i;

                if (i != n) {
                    result = result + ',';
                }
            }
            i++;
        }

        return result;
    }

    public static void main(String[] args) {
        var n = 34;
        System.out.println(evenSeries(n));
    }
}
