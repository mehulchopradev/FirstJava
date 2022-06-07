public class PlayString {

    public static void main(String[] args) {
        String s1 = "Mehul";
        String s2 = "Meh";
        String s3 = "ul";
        String s4 = s2 + s3;
        String s5 = "Mehul";

        System.out.println(s1 == s4); // compares addresses
        System.out.println(s1 == s5);
        System.out.println(s1.equals(s4)); // compare the actual value represented by the String
        System.out.println(s1.equalsIgnoreCase(s4));
    }
}
