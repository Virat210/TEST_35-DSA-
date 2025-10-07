public class SorcerersSpell {
    public static void main(String[] args) {
        String input = "abc";
        String reversed = reverse(input);
        System.out.println(reversed);
    }

    static String reverse(String str) {
        if (str.isEmpty()) return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
