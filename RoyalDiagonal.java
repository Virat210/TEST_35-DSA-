public class RoyalDiagonal {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int n = matrix.length;
        int primary = 0, secondary = 0;

        for (int i = 0; i < n; i++) {
            primary += matrix[i][i];
            secondary += matrix[i][n - 1 - i];
        }
        System.out.println(primary);
        System.out.println(secondary);
    }
}
