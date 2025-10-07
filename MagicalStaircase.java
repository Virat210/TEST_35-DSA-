
public class MagicalStaircase {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(countWays(n));
    }
    static int countWays(int n) {
        if (n == 0 || n == 1) return 1;

        int a = 1, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
}
