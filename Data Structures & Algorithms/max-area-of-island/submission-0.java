class Solution {
    private int[] directions = new int[] {0, 1, 0, -1, 0};
    private int dfs(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) return 0;
        grid[i][j] = 0;
        int ans = 1;
        for (int k = 0; k < 4; k++) {
            int r = i + directions[k];
            int c = j + directions[k+1];

            if (r >= 0 && r < grid.length && c >= 0 && c < grid[0].length && grid[r][c] == 1) {
                ans += dfs(grid, r, c); 
            }
        }
        return ans;
    }


    public int maxAreaOfIsland(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int max = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    max = Math.max(max, dfs(grid, i, j));
                }
            }
        }
        return max;
    }
}
