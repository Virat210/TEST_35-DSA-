import java.util.*;

public class ScrollLocator {
    public static int[] findScroll(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };
        int target = 60;

        int[] result = findScroll(matrix, target);
        System.out.println("Output: (" + result[0] + ", " + result[1] + ")");
    }
}
