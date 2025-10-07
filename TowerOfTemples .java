public class TowerOfTemples {
    public static void main(String[] args) {
        int n = 3;
        moveDisks(n, 'A', 'C', 'B');
    }

    static void moveDisks(int n, char source, char destination, char helper) {
        if (n == 0) return;
        moveDisks(n - 1, source, helper, destination);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        moveDisks(n - 1, helper, destination, source);
    }
}
