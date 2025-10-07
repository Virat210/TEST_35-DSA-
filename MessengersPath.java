public class MessengersPath {
    public static void main(String[] args) {
        int[][] grid = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };

        boolean[][] visited = new boolean[grid.length][grid[0].length];
        boolean canReach = dfs(grid, 0, 0, visited);
        System.out.println(canReach);
    }
    public static boolean dfs(int[][] grid, int i, int j, boolean[][] visited) {
        int rows = grid.length, cols = grid[0].length;
        if (i < 0 || j < 0 || i >= rows || j >= cols || grid[i][j] == 1 || visited[i][j])
            return false;
        if (i == rows - 1 && j == cols - 1)
            return true;
        visited[i][j] = true;
        return dfs(grid, i + 1, j, visited) ||
                dfs(grid, i - 1, j, visited) ||
                dfs(grid, i, j + 1, visited) ||
                dfs(grid, i, j - 1, visited);
    }
}
