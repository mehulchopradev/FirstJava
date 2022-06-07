public class Rectangle {

    static int perimeterRectangle(int length, int breadth) {
        return 2 * (length + breadth);
    }

    static int areaRectangle(int length, int breadth) {
        return length * breadth;
    }

    public static void main(String[] args) {
        var l1 = 8;
        var b1 = 4;

        var p1 = perimeterRectangle(l1, b1);
        System.out.println(p1);

        System.out.println(areaRectangle(l1, b1));
    }
}
