public class Vowel {

    static boolean isVowel2(char ch) {
        // switch expressions
        return switch (ch) {
            case 'a', 'e', 'i', 'o', 'u' -> true;
            default -> false;
        };
    }

    static boolean isVowel(char ch) {
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;

        }
    }

    public static void main(String[] args) {
        char c = 'p';
        System.out.println(isVowel2(c));
    }
}
