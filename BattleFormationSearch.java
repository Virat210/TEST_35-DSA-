import java.util.*;

public class BattleFormationSearch {

    public static boolean searchSoldier(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int low = 0, high = n * m - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int row = mid / m;
            int col = mid % m;
            int value = matrix[row][col];
            if (value == target) {
                return true;
            } else if (value < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5},
                {7, 10, 11},
                {16, 20, 30}
        };
        int target = 10;

        System.out.println("Output: " + searchSoldier(matrix, target));
    }
}
