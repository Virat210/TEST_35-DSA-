import java.util.*;

public class QueensJewelsSearch {
    public static int[] findFirstOccurrence(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int row = 0, col = m - 1;
        int[] result = {-1, -1};

        while (row < n && col >= 0) {
            int value = matrix[row][col];

            if (value == target) {
                result[0] = row;
                result[1] = col;
                col--;
            } else if (value > target) {
                col--;
            } else {
                row++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 2},
                {3, 4, 4},
                {5, 6, 7}
        };
        int target = 4;

        int[] result = findFirstOccurrence(matrix, target);
        System.out.println("Output: (" + result[0] + ", " + result[1] + ")");
    }
}
