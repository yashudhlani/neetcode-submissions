class Solution {
    private int[] directions = new int[]{0, 1, 0, -1, 0};

    private void dfs(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) {
            return;
        }

        grid[i][j] = '0';

        for (int k = 0; k < 4; k++) {
            int r = i + directions[k];
            int c = j + directions[k + 1];

            if (r >= 0 && r < grid.length && c >= 0 && c < grid[0].length && grid[r][c] == '1') {
                dfs(grid, r, c);
            }
        }
    }

// grid=[["1","1","0","0","1"],
//       ["1","1","0","0","1"],
//       ["0","0","1","0","0"],
//       ["0","0","0","1","1"]]

    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int ans = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    ans++;
                }
            }
        }
        return ans;
    }
}
