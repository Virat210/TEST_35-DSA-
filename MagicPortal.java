public class MagicPortal {
    public static String searchPortal(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int row = 0, col = cols - 1;

        while (row < rows && col >= 0) {
            int current = matrix[row][col];
            if (current == target) return "Activated";
            else if (current > target) col--;
            else row++;
        }
        return "Failed";
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 8}, {3, 6, 10}, {7, 9, 12}};
        int target = 9;
        System.out.println(searchPortal(matrix, target)); 
    }
}
