import java.util.*;
public class TreasureMapSearch {

    public static String findTreasure(int[][] matrix, int target) {
        for (int[] row : matrix) {
            for (int value : row) {
                if (value == target) {
                    return "Yes";
                }
            }
        }
        return "No";
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int target = 5;

        System.out.println( findTreasure(matrix, target));
    }
}
