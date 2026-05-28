class Solution {
    private int[] directions = new int[] {0, 1, 0, -1, 0};

    private int bfs(int[][] grid, int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i , j});
        grid[i][j] = 0;
        int ans = 1;
        while (!queue.isEmpty()) {
            int[] node = queue.poll();
            int size = queue.size();
            for (int k = 0; k < 4; k++) {
                int r = node[0] + directions[k];
                int c = node[1] + directions[k + 1];
                if (r >= 0 && r < grid.length && c >= 0 && c < grid[0].length && grid[r][c] == 1) {
                    queue.offer(new int[] {r, c});
                    grid[r][c] = 0;
                    ans++;
                }
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
                    max = Math.max(max, bfs(grid, i, j));
                }
            }
        }
        return max;
    }
}
