public class Rectangle {

    static int perimeterRectangle(int length, int breadth) {
        return 2 * (length + breadth);
    }

    public static void main(String[] args) {
        var l1 = 8;
        var b1 = 4;

        var p1 = perimeterRectangle(l1, b1);
        System.out.println(p1);
    }
}
