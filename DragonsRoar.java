public class DragonsRoar {
    public static void main(String[] args) {
        print(1, 5);
    }

    static void print(int i, int n) {
        if (i > n) return;
        System.out.print(i + " ");
        print(i + 1, n);
    }
}
