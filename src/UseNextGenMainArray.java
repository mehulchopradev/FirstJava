public class UseNextGenMainArray {

    public static void main(String[] args) {
        String[] cars = {"porshe", "mercedes", "bmw"};
        NextgenArray<String> nextgenArray = new NextgenArray(cars);

        String ele1 = nextgenArray.get(1);
        String ele3 = nextgenArray.get(3);

        System.out.println(ele1);
        System.out.println(ele3);

        nextgenArray.set(1, "i20");

        System.out.println(nextgenArray);

        Integer[] nos = {5, 6, 3, 10, 8, 9};
        NextgenArray<Integer> nextgenArray1 = new NextgenArray(nos);

        int e = nextgenArray1.get(1);
        nextgenArray1.set(2, 10);
    }
}
